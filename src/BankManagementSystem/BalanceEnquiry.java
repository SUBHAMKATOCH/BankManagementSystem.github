package BankManagementSystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class BalanceEnquiry  extends JFrame implements ActionListener{
	String pinnumber;
	JButton back;
     BalanceEnquiry(String pinnumber) {
    	 this.pinnumber = pinnumber;
         setLayout(null);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AdobeStock_178351228_Preview.jpeg"));
         Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0, 0, 900, 750);
         add(image);
         
         back=new JButton("BACK");
         back.setBounds(410, 434, 150, 30);
         back.addActionListener(this);
         image.add(back);
         
         double currentBalance = 0;
         try {
            
             Connection con = conn.getConnection();

             // Check current balance
             String balanceQuery = "SELECT SUM(CASE WHEN type = 'Deposit' THEN amount ELSE -amount END) AS balance FROM BANK WHERE pin = ?";
             PreparedStatement balanceStmt = con.prepareStatement(balanceQuery);
             balanceStmt.setString(1, pinnumber);
             ResultSet rs = balanceStmt.executeQuery();

          
             if (rs.next()) {
                 currentBalance = rs.getDouble("balance");
             }
             rs.close();
             balanceStmt.close();
             

        	 
         }
         catch(Exception e) {
        	 System.out.println(e);
         }
         
         JLabel text=new JLabel("YOUR CURRENT ACCOUNT BALANCE Rs = "+currentBalance);
         text.setForeground(Color.BLACK);
         text.setBounds(200, 170, 400,30);
         image.add(text);
         
         setSize(900, 900);
         setLocation(300, 0);
         setVisible(true);
	
       }
	

	public static void main(String[] args) {
		new BalanceEnquiry(" ");
	

	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
		
		
	}

}
