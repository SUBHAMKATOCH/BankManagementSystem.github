////package BankManagementSystem;
////
////import java.awt.Color;
////import java.sql.Connection;
////import java.sql.PreparedStatement;
////import java.sql.ResultSet;
////
////import javax.swing.JFrame;
////import javax.swing.JLabel;
////
////public class MiniStatement extends JFrame{
////	String pin;
////	public MiniStatement(String pin) {
////		this.pin=pin;
////		setLayout(null);
////		
////		JLabel text=new JLabel();
////		add(text);
////		
////		
////		JLabel bank=new JLabel("BANK OF INDIA");
////		bank.setBounds(150,20,100,20);
////		add(bank);
////		
////		JLabel mini=new JLabel("PIN NUMBER");
////		mini.setBounds(20,100,300,20);
////		add(mini);
////		
////		JLabel card=new JLabel("CARD NUMBER");
////		card.setBounds(20,80,300,20);
////		add(card);
////		
////		try {
////			 Connection con = conn.getConnection();
////			String query="select*from signup3 where pinnumber= '"+pin+"'";
////			  PreparedStatement balanceStmt = con.prepareStatement(query);
////	             
////	             ResultSet rs = balanceStmt.executeQuery();
////	             while(rs.next()) {
////	            	 card.setText("CARD NUMBER:"+rs.getString("cardnumber"));
////	             }
////		}
////		catch(Exception e) {
////			System.out.println(e);
////		}
////		
////		
////		setSize(400, 600);
////        setLocation(20, 20);
////        getContentPane().setBackground(Color.WHITE);;
////        setUndecorated(true);
////        setVisible(true);
////	}
////
////	public static void main(String[] args) {
////		new MiniStatement("");
////
////	}
////
////}
//
//
////package BankManagementSystem;
////
////import java.awt.Color;
////import java.awt.Font;
////import java.sql.Connection;
////import java.sql.PreparedStatement;
////import java.sql.ResultSet;
////import javax.swing.JFrame;
////import javax.swing.JLabel;
////
////public class MiniStatement extends JFrame {
////    String pin;
////
////    public MiniStatement(String pin) {
////        this.pin = pin;
////        setLayout(null);
////
////        JLabel text = new JLabel();
////        text.setBounds(20, 140, 300, 400);
////        add(text);
////
////        JLabel bank = new JLabel("BANK OF INDIA");
////        bank.setFont(new Font("Arial", Font.BOLD, 20));
////        bank.setBounds(150, 20, 200, 30);
////        add(bank);
////
////        JLabel card = new JLabel("CARD NUMBER: ");
////        card.setBounds(20, 80, 300, 20);
////        add(card);
////
////        JLabel pn = new JLabel("PIN NUMBER: ");
////        pn.setBounds(20, 100, 300, 20);
////        add(pn);
////
////        try {
////            Connection con = conn.getConnection();
////            String query = "SELECT * FROM signup3 WHERE pinnumber = ?";
////            PreparedStatement stmt = con.prepareStatement(query);
////            stmt.setString(1, pin);
////            ResultSet rs = stmt.executeQuery();
////            if (rs.next()) {
////                card.setText("CARD NUMBER: " + rs.getString("cardnumber").substring(0,4)+"XXXXXXX");
////                pn.setText("PIN NUMBER: " + rs.getString("pinnumber").substring(0,2)+"XX");
////            }
////        } catch (Exception e) {
////            System.out.println(e);
////        }
////
////        setSize(400, 600);
////        setLocation(20, 20);
////        getContentPane().setBackground(Color.WHITE);
////        setUndecorated(true);
////        setVisible(true);
////    }
////
////    public static void main(String[] args) {
////        new MiniStatement("");
////    }
////}
//
//package BankManagementSystem;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class MiniStatement extends JFrame {
//    String pin;
//
//    public MiniStatement(String pin) {
//        this.pin = pin;
//        setLayout(null);
//
//        JLabel bank = new JLabel("BANK OF INDIA");
//        bank.setFont(new Font("Arial", Font.BOLD, 20));
//        bank.setBounds(150, 20, 200, 30);
//        add(bank);
//
//        JLabel card = new JLabel("CARD NUMBER: ");
//        card.setBounds(20, 80, 300, 20);
//        add(card);
//
//        JLabel mini = new JLabel("PIN NUMBER: ");
//        mini.setBounds(20, 100, 300, 20);
//        add(mini);
//
//        try {
//            Connection con = conn.getConnection();
//            String query = "SELECT * FROM signup3 WHERE pinnumber = ?";
//            PreparedStatement stmt = con.prepareStatement(query);
//            stmt.setString(1, pin);
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                card.setText("CARD NUMBER: " + rs.getString("cardnumber"));
//                mini.setText("PIN NUMBER: " + rs.getString("pinnumber"));
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        // Fetch and display last three transactions from BANK table
//        JLabel statement = new JLabel("Mini Statement:");
//        statement.setBounds(20, 140, 300, 20);
//        add(statement);
//
//        try {
//            Connection con = conn.getConnection();
//            String query = "SELECT date, amount, type FROM BANK WHERE pin = ? ORDER BY date DESC LIMIT 3";
//            PreparedStatement stmt = con.prepareStatement(query);
//            stmt.setString(1, pin);
//            ResultSet rs = stmt.executeQuery();
//
//            int y = 160; // Starting y-coordinate for transaction details
//            while (rs.next()) {
//                String date = rs.getString("date");
//                String amount = rs.getString("amount");
//                String type = rs.getString("type");
//
//                JLabel transaction = new JLabel(date + " | " + amount + " | " + type);
//                transaction.setBounds(20, y, 300, 20);
//                add(transaction);
//                y += 20; // Increment y-coordinate for next transaction
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        setSize(400, 600);
//        setLocation(20, 20);
//        getContentPane().setBackground(Color.WHITE);
//        setUndecorated(true);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new MiniStatement("");
//    }
//}


package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame  implements ActionListener{
    String pin;
    JButton exit;

    public MiniStatement(String pin) {
        this.pin = pin;
        setLayout(null);

        JLabel bank = new JLabel("BANK OF INDIA");
        bank.setFont(new Font("Arial", Font.BOLD, 20));
        bank.setBounds(150, 20, 200, 30);
        add(bank);

        JLabel card = new JLabel("CARD NUMBER: ");
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel mini = new JLabel("PIN NUMBER: ");
        mini.setBounds(20, 100, 300, 20);
        add(mini);
        
        exit=new JButton("BACK");
		 exit.setBounds(270, 500, 100, 30);
		exit.addActionListener(this);
		add(exit);

        try {
            Connection con = conn.getConnection();
            String query = "SELECT * FROM signup3 WHERE pinnumber = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, pin);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                card.setText("CARD NUMBER: " + rs.getString("cardnumber").substring(0, 4)+"XXXXXXXXXXXX");
                mini.setText("PIN NUMBER: " + rs.getString("pinnumber").substring(0, 2)+"xx");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // Fetch and display last three transactions from BANK table
        JLabel statement = new JLabel("Mini Statement:");
        statement.setBounds(20, 140, 300, 20);
        add(statement);

        try {
            Connection con = conn.getConnection();
            String query = "SELECT date, amount, type FROM BANK WHERE pin = ? ORDER BY date DESC LIMIT 3";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, pin);
            ResultSet rs = stmt.executeQuery();

            int y = 160; // Starting y-coordinate for transaction details
            while (rs.next()) {
                String date = rs.getString("date");
                String amount = rs.getString("amount");
                String type = rs.getString("type");

                JLabel transaction = new JLabel(date + " | " + amount + " | " + type);
                transaction.setBounds(20, y, 300, 20);
                add(transaction);
                y += 20; // Increment y-coordinate for next transaction
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==exit) {
			setVisible(false);
			new Transactions(pin).setVisible(true);
		}
		
	}
}




