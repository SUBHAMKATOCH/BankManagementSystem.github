//package BankManagementSystem;
//
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.*;
//
//import javax.swing.*;
//public class Deposit extends JFrame  implements ActionListener {
//	
//	JLabel text;
//	JTextField amount;
//	JButton deposit, back;
//	
//	String pin;
//	
//	Deposit(String pin){
//		this.pin=pin;
//		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("AdobeStock_178351228_Preview.jpeg"));
//		
//		Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
//		ImageIcon i3=new ImageIcon(i2);
//		JLabel image=new JLabel(i3);
//		image.setBounds(0, 0, 900, 900);
//		
//		add(image);
//		
//	    text=new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
//		text.setForeground(Color.BLACK);
//		text.setFont(new Font("System",Font.BOLD,16));
//		text.setBounds(180, 180, 700, 35);
//		image.add(text);
//		
//		
//	    amount=new JTextField();
//		amount.setFont(new Font("raleway",Font.BOLD,22));
//		amount.setBounds(170, 314, 370, 30);
//		amount.setBackground(Color.white);
//		image.add(amount);
//		
//	    deposit=new JButton("Deposit");
//		deposit.setBounds(410, 396, 150, 30);
//		deposit.addActionListener(this);
//		image.add(deposit);
//		
//	    back=new JButton("BACK");
//		back.setBounds(410, 435, 150, 30);
//		back.addActionListener(this);
//		image.add(back);
//		
//		
//		setSize(900,900);
//		setLocation(300,0);
//		setVisible(true);
//		
//		
//		
//	}
//	
//
//	
//	public static void main(String [] args) {
//		new Deposit("");
//		
//	}
//
//
//
//	@Override
//	public void actionPerformed(ActionEvent ae) {
//		if(ae.getSource()==deposit) {
//			String number=amount.getText();
//			Date date=new Date();
//			if(number.equals(" ")) {
//			JOptionPane.showMessageDialog(null,"Please enetr the amount you wants to deposit");	
//			}
//			else {
//				try {
//				conn conn=new conn();
//				String query="insert into BANK values('"+pin+"','"+date+"','Deposit','"+number+"')";
//				 
//			     PreparedStatement pstmt = con.prepareStatement(query);
//                 pstmt.setString(1, pin);
//                 pstmt.setDate(2, new java.sql.Date(date.getTime()));
//                 pstmt.setString(3, number);
//                 pstmt.executeUpdate();
//                 pstmt.close();
//				JOptionPane.showMessageDialog(null,"Rs"+number+"Deposited successfully");	
//				}
//				catch(Exception e) {
//					System.out.println("e");
//					
//				}
//			}
//			
//			
//		
//	}
//		else if(ae.getSource()==back) {
//			setVisible(false);
//			new Transactions(pin).setVisible(true);
//			
//			
//		}
//	
//	}
//}





package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.*;

public class Deposit extends JFrame implements ActionListener {

    JLabel text;
    JTextField amount;
    JButton deposit, back;
    String pin;

    Deposit(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AdobeStock_178351228_Preview.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);

        add(image);

        text = new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        text.setForeground(Color.BLACK);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(180, 180, 700, 35);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 314, 370, 30);
        amount.setBackground(Color.white);
        image.add(amount);

        deposit = new JButton("Deposit");
        deposit.setBounds(410, 396, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("BACK");
        back.setBounds(410, 435, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == deposit) {
            String number = amount.getText();
            Date date = new Date();
            if (number.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            } else {
                try {
                    Connection con = conn.getConnection();
                    String query = "INSERT INTO BANK (pin, date, type, amount) VALUES (?, ?, 'Deposit', ?)";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1, pin);
                    pstmt.setDate(2, new java.sql.Date(date.getTime()));
                    pstmt.setString(3, number);
                    pstmt.executeUpdate();
                    pstmt.close();

                    JOptionPane.showMessageDialog(null, "Rs " + number + " deposited successfully");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
    }
}

