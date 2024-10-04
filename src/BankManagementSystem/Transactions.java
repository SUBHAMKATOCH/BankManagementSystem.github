package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transactions extends JFrame implements ActionListener{
	JButton exit,deposit,cashwithdrawl,fastcash,ministatement,pinchange,BALANCEENQUERY;
	 JLabel text;
	 String pin;
	public Transactions(String pin){
		this.pin=pin;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("AdobeStock_178351228_Preview.jpeg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(0,0,900,750);
		add(image);
		
		
		 text =new JLabel("Please select your Transaction");
		 text.setBounds(250, 180, 700, 35);
		 text.setBackground(Color.WHITE);
		 text.setFont(new Font("system",Font.BOLD,16));
		 image.add(text);
		 
		 deposit=new JButton("Deposit");
		 deposit.setBounds(170, 314, 150, 30);
		 deposit.addActionListener(this);
		 image.add(deposit);
		 
		 cashwithdrawl=new JButton("Cash Withdrawl");
		 cashwithdrawl.setBounds(410, 314, 150, 30);
		 cashwithdrawl.addActionListener(this);
		 image.add(cashwithdrawl);
//		 
//		 fastcash=new JButton("Fast Cash");
//		 fastcash.setBounds(170, 355, 150, 30);
//		 fastcash.addActionListener(this);
//		 image.add(fastcash);
		 
		 ministatement=new JButton("Mini Statement ");
		 ministatement.setBounds(170, 355, 150, 30);
		 //170, 355, 150, 30
		 ministatement.addActionListener(this);
		 image.add(ministatement);
		 
		 pinchange=new JButton("PIN CHANGE");
		 pinchange.setBounds(170, 396, 150, 30);
		 pinchange.addActionListener(this);
		 image.add(pinchange);
		 
	     BALANCEENQUERY=new JButton("BALANCE  ENQUIRY ");
		 BALANCEENQUERY.setBounds(410, 355, 150, 30);
		 BALANCEENQUERY.addActionListener(this);
		 image.add(BALANCEENQUERY);
		 
		 exit=new JButton("BACK");
		 exit.setBounds(410, 396, 150, 30);
		 exit.addActionListener(this);
		 image.add(exit);
		 
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Transactions(" ");

	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==exit) {
			setVisible(false);
			new Login().setVisible(true);
			
		}
		else if(ae.getSource()==deposit) {
			setVisible(false);
			new Deposit(pin).setVisible(true);
		}
		else if(ae.getSource()==cashwithdrawl) {
			setVisible(false);
			new Withdrawl(pin).setVisible(true);
		}
		else if(ae.getSource()==pinchange) {
			setVisible(false);
			new Pinchange(pin).setVisible(true);
		}
		else if(ae.getSource()==BALANCEENQUERY) {
			setVisible(false);
			new BalanceEnquiry(pin).setVisible(true);
		}
		else if(ae.getSource()==ministatement) {
			setVisible(false);
			new MiniStatement(pin).setVisible(true);
		}
		
    	
		
	}

}
