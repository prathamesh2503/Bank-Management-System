package bank.management.system;

import javax.swing.*; //java class extends swing class
import java.awt.*;
import java.awt.event.*; //ActionListener
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    
    JButton login, clear, signup; 
    JTextField cardTextField;
    JPasswordField pinTextField;
    
     //Login() Constructor in java is used to create the instance of the class.
    Login() { 
        
        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // to take image from system
        // To resize image - use Image class from pakage awt.
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        //we can't pass i2 directly to JLabel class
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3); 
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel title = new JLabel("Welcome To ATM");
        title.setFont(new Font("Raleway",Font.BOLD,38));
        title.setBounds(200,40,400,40);
        add(title);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,38));
        cardno.setBounds(120,150,400,40);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14)); 
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD,38));
        pin.setBounds(120,220,250,40);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14)); 
        
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this); // it will understand button is clicked
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);

        add(signup);
        getContentPane().setBackground(Color.WHITE); // to set frame cclr white
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear)
        {
            cardTextField.setText("");            
            pinTextField.setText("");
        }
        else if(ae.getSource() == login)
        {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and '"+pinnumber+"'";
            
            try
            {
               ResultSet rs = conn.s.executeQuery(query); // to catch the data from database.
               if(rs.next())
               {
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               } else {
                   JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
               }

            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource() == signup)
        {
            setVisible(false); // to stop visibility of login
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String arg[]) 
    {
        new Login();
    }
}

