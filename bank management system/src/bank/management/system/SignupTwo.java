package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener {
    
//    int random; 
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, married, unmarried;
    JTextField pan, aadhar;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, education, occupation;
    String formno;
    
    SignupTwo(String formno){
        
//        Random ran = new Random();
//        random = Math.abs(ran.nextInt()%100);
//        System.out.println(random);
//    
        this.formno = formno;
        setLayout(null); 

        setTitle("New Account Application - Page 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
         
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion); 
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD,22));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
                
        String valcategory [] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
//        fnameTextField = new JTextField();
//        fnameTextField.setFont(new Font("Raleway", Font.BOLD,22));
//        fnameTextField.setBounds(300,190,400,30);
//        add(fnameTextField);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);
       
        String valincome [] = {"<50000", "<100000", "<200000", "<300000", "<500000"};
        income = new JComboBox(valincome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
       
        JLabel gender = new JLabel("Education:");
        gender.setFont(new Font("Raleway", Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender); 
        
        String educationValues[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        education = new JComboBox(educationValues); 
        education.setBounds(300,290,400,30);
        education.setBackground(Color.WHITE);
        add(education);

         
        JLabel martial = new JLabel("Occupation:");
        martial.setFont(new Font("Raleway", Font.BOLD,22));
        martial.setBounds(100,340,200,30);
        add(martial); 
        
        String occupationValues[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues); 
        occupation.setBounds(300,340,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);
         
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD,22));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway", Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD,22));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(400,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup sgendergroup = new ButtonGroup();
        sgendergroup.add(syes);
        sgendergroup.add(sno);
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(400,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup egendergroup = new ButtonGroup();
        egendergroup.add(eyes);
        egendergroup.add(eno);
        
//        pincodeTextField = new JTextField();
//        pincodeTextField.setFont(new Font("Raleway", Font.BOLD,22));
//        pincodeTextField.setBounds(300,590,400,30);
//        add(pincodeTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
//        String formno = "" + random;//        
//        String formno = null;

        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome =  (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();        
        String soccupation = (String) occupation.getSelectedItem();        
        String seniorcitizen = null;
        
        if (syes.isSelected())
        {
            seniorcitizen = "Yes";
        }else if(sno.isSelected())
        {
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if (eyes.isSelected())
        {
            existingaccount = "Yes";
        }else if(eno.isSelected())
        {
            existingaccount = "No";
        }

        String span = pan.getText();
        String saadhar = aadhar.getText();
      
        
        try
        {
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"', '"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query); 
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }   
    }
    
    public static void main(String args[])
    {
        new SignupTwo("");
    }
}



