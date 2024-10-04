//package BankManagementSystem;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//import javax.swing.*;
//
//public class Pinchange extends JFrame implements ActionListener {
//	JLabel text,pintext,rpintext;   
//	JTextField pintf,rpintf;
//	JButton change,back;
//	String pinnumber;
//	public Pinchange(String pinnumber) {
//		this.pinnumber=pinnumber;
//		 setLayout(null);
//		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("AdobeStock_178351228_Preview.jpeg"));
//		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
//		ImageIcon i3=new ImageIcon(i2);
//		JLabel image =new JLabel(i3);
//		image.setBounds(0,0,900,750);
//		add(image);
//		
//	    text =new JLabel("CHANGE YOUR PIN");
//		text.setForeground(Color.BLACK);
//		text.setFont(new Font("system",Font.BOLD,16));
//		text.setBounds(280, 130, 700, 35);
//		image.add(text);
//		
//		pintext=new JLabel("NEW PIN:");
//		pintext.setForeground(Color.BLACK);
//		pintext.setFont(new Font("system",Font.BOLD,16));
//		pintext.setBounds(180, 180, 700, 35);
//		image.add(pintext);
//		
//		pintf=new JTextField();
//		pintf.setForeground(Color.BLACK);
//		pintf.setFont(new Font("system",Font.BOLD,16));
//		pintf.setBounds(350, 180, 220, 35);
//		image.add(pintf);
//		
//		
//		rpintext=new JLabel("Re-ENTER NEW PIN:");
//		rpintext.setForeground(Color.BLACK);
//		rpintext.setFont(new Font("system",Font.BOLD,16));
//		rpintext.setBounds(180, 230, 220, 35);
//		image.add(rpintext);
//		
//		rpintf=new JTextField();
//		rpintf.setForeground(Color.BLACK);
//		rpintf.setFont(new Font("system",Font.BOLD,16));
//		rpintf.setBounds(350, 230, 220, 35);
//		image.add(rpintf);
//		
//		change =new JButton("CHANGE");
//		change.setBounds(410, 314, 150, 30);
//		change.addActionListener(this);
//		image.add(change);
//		
//	
//		back =new JButton("BACK");
//		back.setBounds(410, 355, 150, 30);
//		back.addActionListener(this);
//		image.add(back);
//		
//		
//		
//		setSize(900,900);
//		setLocation(300,0);
//		//setUndecorated(true);
//		setVisible(true);
//		
//	}
//
//	public static void main(String[] args) {
//		new Pinchange("");
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent ae) {
//		
//		if(ae.getSource()==change) {
//			String npin=pintext.getText();
//			String rpin=rpintext.getText();
//		try {
//			
//			if(!npin.equals(rpin)) {
//                JOptionPane.showMessageDialog(null, "ENTERED  PIN DOES NOT MATCH");
//                return;
//			}
//			if(npin.equals("")) {
//                JOptionPane.showMessageDialog(null, "PLEASE ENTERED NEW PIN");
//                return;
//			}
//			if(rpin.equals("")) {
//                JOptionPane.showMessageDialog(null, "PLEASE RE-ENTERED NEW PIN");
//                return;
//			}
//			  Connection con = conn.getConnection();
//			  String query1="update BANK set pin='"+rpin +"' where pin='"+pinnumber+"'";
//			  //String query2="update Login set pin='"+rpin +"' where pin='"+pinnumber+"'";
//			  String query3="update signup3 set pin='"+rpin +"' where pin='"+pinnumber+"'";
//              
//			  PreparedStatement pstmt = con.prepareStatement(query1);
//			 // PreparedStatement  pstmt2= con.prepareStatement(query2);
//			  PreparedStatement pstmt3 = con.prepareStatement(query3);
//			  
//		  
//		  pstmt.executeUpdate();
////			  pstmt2.executeUpdate();
//		  pstmt3.executeUpdate();
////			  
//              JOptionPane.showMessageDialog(null, "PIN CHANGED SUCCESSFULLY");
//              setVisible(false);
//    			new Transactions(rpin).setVisible(true);
//		}
//      
//		catch(Exception e) {
//			System.out.println(e);
//	}
//		}
//		if(ae.getSource()==back) {
//			   setVisible(false);
//	  			//new Transactions(rpin).setVisible(true);
//			
//		}
//		
//	}
//
//}
//
//



//
//
//package BankManagementSystem;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import javax.swing.*;
//
//public class Pinchange extends JFrame implements ActionListener {
//    JLabel text, pintext, rpintext;   
//    JPasswordField pintf, rpintf;
//    JButton change, back;
//    String pinnumber;
//
//    public Pinchange(String pinnumber) {
//        this.pinnumber = pinnumber;
//        setLayout(null);
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AdobeStock_178351228_Preview.jpeg"));
//        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(0, 0, 900, 750);
//        add(image);
//
//        text = new JLabel("CHANGE YOUR PIN");
//        text.setForeground(Color.BLACK);
//        text.setFont(new Font("system", Font.BOLD, 16));
//        text.setBounds(280, 130, 700, 35);
//        image.add(text);
//
//        pintext = new JLabel("NEW PIN:");
//        pintext.setForeground(Color.BLACK);
//        pintext.setFont(new Font("system", Font.BOLD, 16));
//        pintext.setBounds(180, 180, 700, 35);
//        image.add(pintext);
//
//        pintf = new JPasswordField();
//        pintf.setForeground(Color.BLACK);
//        pintf.setFont(new Font("system", Font.BOLD, 16));
//        pintf.setBounds(350, 180, 220, 35);
//        image.add(pintf);
//
//        rpintext = new JLabel("Re-ENTER NEW PIN:");
//        rpintext.setForeground(Color.BLACK);
//        rpintext.setFont(new Font("system", Font.BOLD, 16));
//        rpintext.setBounds(180, 230, 220, 35);
//        image.add(rpintext);
//
//        rpintf = new JPasswordField();
//        rpintf.setForeground(Color.BLACK);
//        rpintf.setFont(new Font("system", Font.BOLD, 16));
//        rpintf.setBounds(350, 230, 220, 35);
//        image.add(rpintf);
//
//        change = new JButton("CHANGE");
//        change.setBounds(410, 314, 150, 30);
//        change.addActionListener(this);
//        image.add(change);
//
//        back = new JButton("BACK");
//        back.setBounds(410, 355, 150, 30);
//        back.addActionListener(this);
//        image.add(back);
//
//        setSize(900, 900);
//        setLocation(300, 0);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Pinchange("");
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent ae) {
//    	String np=null;
//        if (ae.getSource() == change) {
//            String npin = new String(pintf.getPassword());
//            np=npin;
//            String rpin = new String(rpintf.getPassword());
//
//            if (!npin.equals(rpin)) {
//                JOptionPane.showMessageDialog(null, "ENTERED PIN DOES NOT MATCH");
//                return;
//            }
//
//            if (npin.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "PLEASE ENTER NEW PIN");
//                return;
//            }
//
//            if (rpin.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "PLEASE RE-ENTER NEW PIN");
//                return;
//            }
//
//            System.out.println("New PIN: " + npin);
//            System.out.println("Re-entered PIN: " + rpin);
//
//            Connection con = null;
//            PreparedStatement pstmt = null;
//            PreparedStatement pstmt2 = null;
//            try {
//                con = conn.getConnection();
//
//                // Update PIN in signup3 table
//                String query = "UPDATE signup3 SET pinnumber = ? WHERE pinnumber = ?";
//               
//                
//                pstmt = con.prepareStatement(query);
//              
//                
//                pstmt.setString(1, npin);
//                pstmt.setString(2, pinnumber);
//                
//            
//
//                int rowsUpdated = pstmt.executeUpdate();
//              
//                if (rowsUpdated > 0 ) {
//                    JOptionPane.showMessageDialog(null, "PIN CHANGED SUCCESSFULLY");
//                    setVisible(false);
//                    new Transactions(npin).setVisible(true);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error changing PIN. Please check your current PIN.");
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (pstmt != null) pstmt.close();
//                    if (con != null) con.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        } else if (ae.getSource() == back) {
//            setVisible(false);
//            new Transactions(np).setVisible(true);
//            // You might want to show the previous screen here
//        }
//    }
//}
//

package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;

public class Pinchange extends JFrame implements ActionListener {
    JLabel text, pintext, rpintext;   
    JPasswordField pintf, rpintf;
    JButton change, back;
    String pinnumber;

    public Pinchange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AdobeStock_178351228_Preview.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 750);
        add(image);

        text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.BLACK);
        text.setFont(new Font("system", Font.BOLD, 16));
        text.setBounds(280, 130, 700, 35);
        image.add(text);

        pintext = new JLabel("NEW PIN:");
        pintext.setForeground(Color.BLACK);
        pintext.setFont(new Font("system", Font.BOLD, 16));
        pintext.setBounds(180, 180, 700, 35);
        image.add(pintext);

        pintf = new JPasswordField();
        pintf.setForeground(Color.BLACK);
        pintf.setFont(new Font("system", Font.BOLD, 16));
        pintf.setBounds(350, 180, 220, 35);
        image.add(pintf);

        rpintext = new JLabel("Re-ENTER NEW PIN:");
        rpintext.setForeground(Color.BLACK);
        rpintext.setFont(new Font("system", Font.BOLD, 16));
        rpintext.setBounds(180, 230, 220, 35);
        image.add(rpintext);

        rpintf = new JPasswordField();
        rpintf.setForeground(Color.BLACK);
        rpintf.setFont(new Font("system", Font.BOLD, 16));
        rpintf.setBounds(350, 230, 220, 35);
        image.add(rpintf);

        change = new JButton("CHANGE");
        change.setBounds(410, 314, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(410, 355, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Pinchange("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    	String np = null;
        if (ae.getSource() == change) {
            String npin = new String(pintf.getPassword());
            np = npin;
            String rpin = new String(rpintf.getPassword());

            if (!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(null, "ENTERED PIN DOES NOT MATCH");
                return;
            }

            if (npin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER NEW PIN");
                return;
            }

            if (rpin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "PLEASE RE-ENTER NEW PIN");
                return;
            }

            System.out.println("New PIN: " + npin);
            System.out.println("Re-entered PIN: " + rpin);

            Connection con = null;
            PreparedStatement pstmt = null;
            PreparedStatement pstmt2 = null;
            try {
                con = conn.getConnection();

                // Update PIN in signup3 table
                String query1 = "UPDATE signup3 SET pinnumber = ? WHERE pinnumber = ?";
                pstmt = con.prepareStatement(query1);
                pstmt.setString(1, npin);
                pstmt.setString(2, pinnumber);

                // Update PIN in BANK table
                String query2 = "UPDATE BANK SET pin = ? WHERE pin = ?";
                pstmt2 = con.prepareStatement(query2);
                pstmt2.setString(1, npin);
                pstmt2.setString(2, pinnumber);

                int rowsUpdated1 = pstmt.executeUpdate();
                int rowsUpdated2 = pstmt2.executeUpdate();

                if (rowsUpdated1 > 0 && rowsUpdated2 > 0) {
                    JOptionPane.showMessageDialog(null, "PIN CHANGED SUCCESSFULLY");
                    setVisible(false);
                    new Transactions(npin).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error changing PIN. Please check your current PIN.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
                e.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) pstmt.close();
                    if (pstmt2 != null) pstmt2.close();
                    if (con != null) con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(np).setVisible(true);
            // You might want to show the previous screen here
        }
    }
}




