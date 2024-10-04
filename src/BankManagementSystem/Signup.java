////package BankManagementSystem;
////
////import java.awt.*;
////import java.awt.event.*;
////
////import javax.swing.*;
////import java .util.*;
////import com.toedter.calendar.*;
////
////
////public class Signup extends JFrame  implements ActionListener   {
////	
////	
////	    long Random;
////	    JTextField tfname,tffname,tfemail,tfaddress,tfcity, tfstate,tfpincode;
////	    JLabel  formno,persondetails,name,fname,dob,gender,marital,address,city,state,pincode,email; 
////	    JRadioButton married,unmarried,other,male,female;
////	    ButtonGroup gendergroup,maritalgroup;
////		JButton next;
////	    JDateChooser datechooser;
////	    Random rm;
////	    
////	    Signup(){
////		setLayout(null);
////		
////		rm= new Random();
////		
////	    Random=(Math.abs(rm.nextLong()% 9000L)+1000L);
////	    formno =new JLabel("APPLICATION FORM NO."+Random);
////		formno.setFont(new Font("Raleway",Font.BOLD,38));
////		formno.setBounds(140, 20, 600, 40);
////		add(formno);
////		
////		persondetails =new JLabel("PAGE 1: PERSON DETAILS");
////		persondetails.setFont(new Font("Raleway",Font.BOLD,22));
////		persondetails.setBounds(290, 80, 300, 30);
////		add(persondetails);
////		
////		
////		
////		name =new JLabel("NAME:");
////		name.setFont(new Font("Raleway",Font.BOLD,20));
////		name.setBounds(100, 140, 100, 30);
////		add(name);
////		
////	    tfname=new JTextField();
////		tfname.setFont(new Font("Raleway",Font.BOLD,14));
////		tfname.setBounds(300, 140, 400, 30);
////		add(tfname);
////		
////		
////	    fname =new JLabel("FATHER NAME:");
////		fname.setFont(new Font("Raleway",Font.BOLD,20));
////		fname.setBounds(100, 190, 200, 30);
////		add(fname);
////		
////	    tffname=new JTextField();
////		tffname.setFont(new Font("Raleway",Font.BOLD,14));
////		tffname.setBounds(300, 190, 400, 30);
////		add(tffname);
////		
////		
////	    dob =new JLabel("DOB:");
////		dob.setFont(new Font("Raleway",Font.BOLD,20));
////		dob.setBounds(100, 240, 200, 30);
////		add(dob);
////		
////		datechooser=new JDateChooser();
////		datechooser.setBounds(300, 240, 400, 30);
////		datechooser.setForeground(Color.BLACK);
////		add(datechooser);
////
////		
////
////	    gender =new JLabel("GENDER:");
////		gender.setFont(new Font("Raleway",Font.BOLD,20));
////		gender.setBounds(100, 290, 200, 30);
////		add(gender);
////		
////		male=new JRadioButton("MALE");
////		male.setBounds(300, 290, 60, 30);
////		male.setBackground(Color.WHITE);
////		add(male);
////		
////		female=new JRadioButton("FEMALE");
////		female.setBounds(450, 290, 80, 30);
////		female.setBackground(Color.WHITE);
////		add(female);
////		
////		
////		gendergroup=new ButtonGroup();
////		gendergroup.add(male);
////		gendergroup.add(female);
////
////		
////		
////		
////	    email =new JLabel("EMAIL ADDRESS:");
////		email.setFont(new Font("Raleway",Font.BOLD,20));
////		email.setBounds(100, 340, 200, 30);
////		add(email);
////		
////	    tfemail=new JTextField();
////		tfemail.setFont(new Font("Raleway",Font.BOLD,14));
////		tfemail.setBounds(300, 340, 400, 30);
////		add(tfemail);
////		
////		
////	    marital =new JLabel("MARITAL STATUS:");
////		marital.setFont(new Font("Raleway",Font.BOLD,20));
////		marital.setBounds(100, 390, 200, 30);
////		add(marital);
////		
////		
////		married=new JRadioButton("MARRIED");
////		married.setBounds(300, 390, 100, 30);
////		married.setBackground(Color.WHITE);
////		add(married);
////		
////		unmarried=new JRadioButton("UNMARRIED");
////		unmarried.setBounds(450, 390, 100, 30);
////		unmarried.setBackground(Color.WHITE);
////		add(unmarried);
////		
////		other=new JRadioButton("OTHER");
////		other.setBounds(630, 390, 100, 30);
////		other.setBackground(Color.WHITE);
////		add(other);
////		
////		
////		maritalgroup=new ButtonGroup();
////		maritalgroup.add(married);
////		maritalgroup.add(unmarried);
////		maritalgroup.add(other);
////
////
////		
////		
////		
////		
////	    address =new JLabel("ADDRESS:");
////		address.setFont(new Font("Raleway",Font.BOLD,20));
////		address.setBounds(100, 440, 200, 30);
////		add(address);
////		
////	    tfaddress=new JTextField();
////		tfaddress.setFont(new Font("Raleway",Font.BOLD,14));
////		tfaddress.setBounds(300, 440, 400, 30);
////		add(tfaddress);
////		
////		
////	    city =new JLabel("CITY:");
////		city.setFont(new Font("Raleway",Font.BOLD,20));
////		city.setBounds(100, 490, 200, 30);
////		add(city);
////		
////		
////	    tfcity=new JTextField();
////		tfcity.setFont(new Font("Raleway",Font.BOLD,14));
////		tfcity.setBounds(300, 490, 400, 30);
////		add(tfcity);
////		
////		
////	    state =new JLabel("STATE:");
////		state.setFont(new Font("Raleway",Font.BOLD,20));
////		state.setBounds(100, 540, 200, 30);
////		add(state);
////		
////		
////	    tfstate=new JTextField();
////		tfstate.setFont(new Font("Raleway",Font.BOLD,14));
////		tfstate.setBounds(300, 540, 400, 30);
////		add(tfstate);
////		
////		
////	    pincode =new JLabel("PIN CODE:");
////		pincode.setFont(new Font("Raleway",Font.BOLD,20));
////		pincode.setBounds(100, 590, 200, 30);
////		add(pincode);
////		
////	    tfpincode=new JTextField();
////		tfpincode.setFont(new Font("Raleway",Font.BOLD,14));
////		tfpincode.setBounds(300, 590, 400, 30);
////		add(tfpincode);
////		
////		next =new JButton("NEXT");
////		next.setBackground(Color.BLACK);
////		next.setForeground(Color.WHITE);
////		next.setBounds(620, 660, 80, 30);
////		add(next);
////		
////		
////		
////		getContentPane().setBackground(Color.white);
////		setSize(850,800);
////		setLocation(350,0);
////		setVisible(true);
////		
////	}
////	    public void actionPerformed(ActionEvent ae) {
////	    	String formno=" "+Random;//long
////	    	String textfield=tfname.getText();
////	    	String 
////	    }
////
////	public static void main(String[] args) {
////		new Signup();
////
////	}
////
////}
//
//
//package BankManagementSystem;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.util.*;
//import com.toedter.calendar.*;
//import BankManagementSystem.conn ; // Ensure the package name is correct
//import java.sql.*;
//
//public class Signup extends JFrame implements ActionListener {
//    long Random;
//    JTextField tfname, tffname, tfemail, tfaddress, tfcity, tfstate, tfpincode;
//    JLabel formno, persondetails, name, fname, dob, gender, marital, address, city, state, pincode, email;
//    JRadioButton married, unmarried, other, male, female;
//    ButtonGroup gendergroup, maritalgroup;
//    JButton next;
//    JDateChooser datechooser;
//    Random rm;
//
//    Signup() {
//        setLayout(null);
//        rm = new Random();
//        Random = (Math.abs(rm.nextLong() % 9000L) + 1000L);
//
//        formno = new JLabel("APPLICATION FORM NO." + Random);
//        formno.setFont(new Font("Raleway", Font.BOLD, 38));
//        formno.setBounds(140, 20, 600, 40);
//        add(formno);
//
//        persondetails = new JLabel("PAGE 1: PERSON DETAILS");
//        persondetails.setFont(new Font("Raleway", Font.BOLD, 22));
//        persondetails.setBounds(290, 80, 300, 30);
//        add(persondetails);
//
//        name = new JLabel("NAME:");
//        name.setFont(new Font("Raleway", Font.BOLD, 20));
//        name.setBounds(100, 140, 100, 30);
//        add(name);
//
//        tfname = new JTextField();
//        tfname.setFont(new Font("Raleway", Font.BOLD, 14));
//        tfname.setBounds(300, 140, 400, 30);
//        add(tfname);
//
//        fname = new JLabel("FATHER NAME:");
//        fname.setFont(new Font("Raleway", Font.BOLD, 20));
//        fname.setBounds(100, 190, 200, 30);
//        add(fname);
//
//        tffname = new JTextField();
//        tffname.setFont(new Font("Raleway", Font.BOLD, 14));
//        tffname.setBounds(300, 190, 400, 30);
//        add(tffname);
//
//        dob = new JLabel("DOB:");
//        dob.setFont(new Font("Raleway", Font.BOLD, 20));
//        dob.setBounds(100, 240, 200, 30);
//        add(dob);
//
//        datechooser = new JDateChooser();
//        datechooser.setBounds(300, 240, 400, 30);
//        datechooser.setForeground(Color.BLACK);
//        add(datechooser);
//
//        gender = new JLabel("GENDER:");
//        gender.setFont(new Font("Raleway", Font.BOLD, 20));
//        gender.setBounds(100, 290, 200, 30);
//        add(gender);
//
//        male = new JRadioButton("MALE");
//        male.setBounds(300, 290, 60, 30);
//        male.setBackground(Color.WHITE);
//        add(male);
//
//        female = new JRadioButton("FEMALE");
//        female.setBounds(450, 290, 80, 30);
//        female.setBackground(Color.WHITE);
//        add(female);
//
//        gendergroup = new ButtonGroup();
//        gendergroup.add(male);
//        gendergroup.add(female);
//
//        email = new JLabel("EMAIL ADDRESS:");
//        email.setFont(new Font("Raleway", Font.BOLD, 20));
//        email.setBounds(100, 340, 200, 30);
//        add(email);
//
//        tfemail = new JTextField();
//        tfemail.setFont(new Font("Raleway", Font.BOLD, 14));
//        tfemail.setBounds(300, 340, 400, 30);
//        add(tfemail);
//
//        marital = new JLabel("MARITAL STATUS:");
//        marital.setFont(new Font("Raleway", Font.BOLD, 20));
//        marital.setBounds(100, 390, 200, 30);
//        add(marital);
//
//        married = new JRadioButton("MARRIED");
//        married.setBounds(300, 390, 100, 30);
//        married.setBackground(Color.WHITE);
//        add(married);
//
//        unmarried = new JRadioButton("UNMARRIED");
//        unmarried.setBounds(450, 390, 100, 30);
//        unmarried.setBackground(Color.WHITE);
//        add(unmarried);
//
//        other = new JRadioButton("OTHER");
//        other.setBounds(630, 390, 100, 30);
//        other.setBackground(Color.WHITE);
//        add(other);
//
//        maritalgroup = new ButtonGroup();
//        maritalgroup.add(married);
//        maritalgroup.add(unmarried);
//        maritalgroup.add(other);
//
//        address = new JLabel("ADDRESS:");
//        address.setFont(new Font("Raleway", Font.BOLD, 20));
//        address.setBounds(100, 440, 200, 30);
//        add(address);
//
//        tfaddress = new JTextField();
//        tfaddress.setFont(new Font("Raleway", Font.BOLD, 14));
//        tfaddress.setBounds(300, 440, 400, 30);
//        add(tfaddress);
//
//        city = new JLabel("CITY:");
//        city.setFont(new Font("Raleway", Font.BOLD, 20));
//        city.setBounds(100, 490, 200, 30);
//        add(city);
//
//        tfcity = new JTextField();
//        tfcity.setFont(new Font("Raleway", Font.BOLD, 14));
//        tfcity.setBounds(300, 490, 400, 30);
//        add(tfcity);
//
//        state = new JLabel("STATE:");
//        state.setFont(new Font("Raleway", Font.BOLD, 20));
//        state.setBounds(100, 540, 200, 30);
//        add(state);
//
//        tfstate = new JTextField();
//        tfstate.setFont(new Font("Raleway", Font.BOLD, 14));
//        tfstate.setBounds(300, 540, 400, 30);
//        add(tfstate);
//
//        pincode = new JLabel("PIN CODE:");
//        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
//        pincode.setBounds(100, 590, 200, 30);
//        add(pincode);
//
//        tfpincode = new JTextField();
//        tfpincode.setFont(new Font("Raleway", Font.BOLD, 14));
//        tfpincode.setBounds(300, 590, 400, 30);
//        add(tfpincode);
//
//        next = new JButton("NEXT");
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
//        next.setBounds(620, 660, 80, 30);
//        next.addActionListener(this);
//        add(next);
//
//        getContentPane().setBackground(Color.white);
//        setSize(850, 800);
//        setLocation(350, 0);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        String formno = "" + Random;
//        String name = tfname.getText();
//        String fname = tffname.getText();
//        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
//        String gender = null;
//        if (male.isSelected()) {
//            gender = "Male";
//        } else if (female.isSelected()) {
//            gender = "Female";
//        }
//        String email = tfemail.getText();
//        String marital = null;
//        if (married.isSelected()) {
//            marital = "Married";
//        } else if (unmarried.isSelected()) {
//            marital = "Unmarried";
//        } else if (other.isSelected()) {
//            marital = "Other";
//        }
//        String address = tfaddress.getText();
//        String city = tfcity.getText();
//        String state = tfstate.getText();
//        String pincode = tfpincode.getText();
//
//        try {
//            conn.insertData(formno, name, fname, dob, gender, email, marital, address, city, state, pincode);
//            // You can replace the following line with any further actions, like navigating to another page.
//            JOptionPane.showMessageDialog(null, "Data inserted successfully!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Signup();
//    }
//}
//
//

package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.*;
import java.sql.*;  // Ensure to import java.sql package

public class Signup extends JFrame implements ActionListener {
    long Random;
    JTextField tfname, tffname, tfemail, tfaddress, tfcity, tfstate, tfpincode;
    JLabel formno, persondetails, name, fname, dob, gender, marital, address, city, state, pincode, email;
    JRadioButton married, unmarried, other, male, female;
    ButtonGroup gendergroup, maritalgroup;
    JButton next;
    JDateChooser datechooser;
    Random rm;

    Signup() {
        setLayout(null);
        rm = new Random();
        Random = (Math.abs(rm.nextLong() % 9000L) + 1000L);

        formno = new JLabel("APPLICATION FORM NO." + Random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        persondetails = new JLabel("PAGE 1: PERSON DETAILS");
        persondetails.setFont(new Font("Raleway", Font.BOLD, 22));
        persondetails.setBounds(290, 80, 300, 30);
        add(persondetails);

        name = new JLabel("NAME:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        tfname = new JTextField();
        tfname.setFont(new Font("Raleway", Font.BOLD, 14));
        tfname.setBounds(300, 140, 400, 30);
        add(tfname);

        fname = new JLabel("FATHER NAME:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        tffname = new JTextField();
        tffname.setFont(new Font("Raleway", Font.BOLD, 14));
        tffname.setBounds(300, 190, 400, 30);
        add(tffname);

        dob = new JLabel("DOB:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        datechooser = new JDateChooser();
        datechooser.setBounds(300, 240, 400, 30);
        datechooser.setForeground(Color.BLACK);
        add(datechooser);

        gender = new JLabel("GENDER:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("MALE");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("FEMALE");
        female.setBounds(450, 290, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);

        gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        email = new JLabel("EMAIL ADDRESS:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        tfemail = new JTextField();
        tfemail.setFont(new Font("Raleway", Font.BOLD, 14));
        tfemail.setBounds(300, 340, 400, 30);
        add(tfemail);

        marital = new JLabel("MARITAL STATUS:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        married = new JRadioButton("MARRIED");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("UNMARRIED");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("OTHER");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        address = new JLabel("ADDRESS:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        tfaddress = new JTextField();
        tfaddress.setFont(new Font("Raleway", Font.BOLD, 14));
        tfaddress.setBounds(300, 440, 400, 30);
        add(tfaddress);

        city = new JLabel("CITY:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        tfcity = new JTextField();
        tfcity.setFont(new Font("Raleway", Font.BOLD, 14));
        tfcity.setBounds(300, 490, 400, 30);
        add(tfcity);

        state = new JLabel("STATE:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        tfstate = new JTextField();
        tfstate.setFont(new Font("Raleway", Font.BOLD, 14));
        tfstate.setBounds(300, 540, 400, 30);
        add(tfstate);

        pincode = new JLabel("PIN CODE:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        tfpincode = new JTextField();
        tfpincode.setFont(new Font("Raleway", Font.BOLD, 14));
        tfpincode.setBounds(300, 590, 400, 30);
        add(tfpincode);

        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + Random;
        String name = tfname.getText().trim();
        String fname = tffname.getText().trim();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText().trim();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = tfemail.getText().trim();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }
        String address = tfaddress.getText().trim();
        String city = tfcity.getText().trim();
        String state = tfstate.getText().trim();
        String pincode = tfpincode.getText().trim();

        // Input validation
        if (name.isEmpty() || fname.isEmpty() || dob.isEmpty() || gender == null || email.isEmpty() ||
            marital == null || address.isEmpty() || city.isEmpty() || state.isEmpty() || pincode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required.");
            return;
        }

        try {
            conn.insertData(formno, name, fname, dob, gender, email, marital, address, city, state, pincode);
            JOptionPane.showMessageDialog(null, "Data inserted successfully!");
            setVisible(false);
    		new Signup2(formno).setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error inserting data. Please try again.");
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}

