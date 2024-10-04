package BankManagementSystem;

import java.awt.Color;


import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	
	
     JButton login,signup,clear;
     JTextField cardnotf;
     JPasswordField pintf;
     JLabel text,cardno,pin;
     
	public Login() {
		 setTitle("LOGIN PAGE");
		 setLayout(null);
		 
		 ImageIcon I1 = new ImageIcon("C:/Users/HP/eclipse-workspace/BankManagementSystem/ICON/ICON.png");
		 Image i2= I1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		 ImageIcon I3=new ImageIcon(i2);
		 JLabel j=new JLabel(I3);
		 j.setBounds(20,10,100,100);
		 add(j);
		 
		 
	     text=new JLabel("WELCOME TO BANK");
		 text.setFont(new Font("osward", Font.ROMAN_BASELINE, 30));
		 text.setBounds(150, 40, 400, 55);
		 add(text);
		 
		 
		 cardno=new JLabel("CARD NO:");
		 cardno.setFont(new Font("osward", Font.ROMAN_BASELINE, 30));
		 cardno.setBounds(25, 40, 150,230);
		 add(cardno);
		 
		 cardnotf=new JTextField();
		 cardnotf .setBounds(200, 147, 243, 25);
		 cardnotf.setFont(new Font("osward", Font.BOLD, 14));
		 add(cardnotf);
		 
		 pin=new JLabel("PIN:");
		 pin.setFont(new Font("osward", Font.ROMAN_BASELINE, 30));
		 pin.setBounds(27, 40, 400, 360);
		 add(pin);
		 
		 pintf=new JPasswordField();
		 pintf .setBounds(200, 210, 243, 25);
		 add(pintf);
		 
		 signup =new JButton("SIGN UP");
		 signup .setBounds(205, 280, 100, 30);
		 signup.setBackground(Color.black);
		 signup.setForeground(Color.white);
		 signup.addActionListener(this);
		 add(signup);
		 
		 
		 clear =new JButton("CLEAR");
		 clear.setBounds(340, 280, 100, 30);
		 clear.setBackground(Color.black);
		 clear.setForeground(Color.white);
		 clear.addActionListener(this);
		 add(clear);
		 
		 
		 login =new JButton("LOGIN");
		 login.setBounds(270, 360, 100, 30);
		 login.setBackground(Color.BLUE);
		 login.setForeground(Color.WHITE);
		 login.addActionListener(this);
		 add(login);
		 
		 getContentPane().setBackground(Color.white);
		 setSize(500,500);
		 //setUndecorated(true);
		 setVisible(true);
		 setLocation(450,150);
			
	}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==signup) {
		setVisible(false);
		new Signup().setVisible(true);

	}
	else if(ae.getSource()==clear) {
		cardnotf.setText("");
		pintf.setText("");
	}
    else if(ae.getSource()==login) {
    	conn conn=new conn();
    	String cardnumber=cardnotf.getText();
    	String pinnumber =pintf.getText();
    	String query ="select * from signup3 where CARDNUMBER = '"+cardnumber+"'and PINNUMBER ='"+pinnumber+"'";                        
    	try {
    		ResultSet rs= conn.executeQuery(query);
    		if(rs.next()) {
    			setVisible(false);
    			new  Transactions(pinnumber).setVisible(true);
    		}
    		else {
    			JOptionPane.showMessageDialog(null, "Incorrect card number");
    		}
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
	}
}

	public static void main(String[] args) {
		new Login();
		

		
	}

}
