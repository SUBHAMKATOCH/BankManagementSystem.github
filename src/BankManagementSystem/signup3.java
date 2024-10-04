//package BankManagementSystem;
//
//
//import java.util.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.*;
//
//public class signup3 extends JFrame implements ActionListener {
//	JRadioButton r1,r2,r3,r4;
//	JCheckBox c1,c2,c3,c4,c5,c6,c7;
//	JButton cancel,submit;
//    String formno;
//
//	signup3(String formno) {
//		this.formno = formno;
//		setLayout(null);
//		
//		JLabel l1 =new JLabel("Page 3: Account Details");
//		l1.setFont(new Font("Raleway",Font.BOLD, 22));
//		l1.setBounds(280, 40, 400, 40);
//		add(l1);
//		
//		JLabel type =new JLabel("Account Type:");
//		type.setFont(new Font("Raleway",Font.BOLD, 22));
//		type.setBounds(100, 140, 300, 30);
//		add(type);
//		
//		r1 =new JRadioButton("Saving Account");
//		r1.setFont(new Font("Raleway",Font.BOLD,16));
//		r1.setBackground(Color.WHITE);
//		r1.setBounds(350, 180, 160, 20);
//		add(r1);
//		
//		r2 =new JRadioButton("Fixed Deposit Account");
//		r2.setFont(new Font("Raleway",Font.BOLD,16));
//		r2.setBackground(Color.WHITE);
//		r2.setBounds(100, 225, 210, 20);
//		add(r2);
//		
//		r3 =new JRadioButton("Current Account");
//		r3.setFont(new Font("Raleway",Font.BOLD,16));
//		r3.setBackground(Color.WHITE);
//		r3.setBounds(100, 180, 160, 20);
//		add(r3);
//		
//		r4 =new JRadioButton("Recurring Deposit Account");
//		r4.setFont(new Font("Raleway",Font.BOLD,16));
//		r4.setBackground(Color.WHITE);
//		r4.setBounds(350, 225, 240, 20);
//		add(r4);
//		
//		ButtonGroup groupaccount=new ButtonGroup();
//		groupaccount.add(r1);
//		groupaccount.add(r2);
//		groupaccount.add(r3);
//		groupaccount.add(r4);
//		
//		
//		JLabel card =new JLabel("Card Number:");
//		card.setFont(new Font("Raleway",Font.BOLD, 22));
//		card.setBounds(100, 270, 300, 30);
//		add(card);
//		
//		
//		JLabel number =new JLabel("XXXX-XXXX-XXXX-4104");
//		number.setFont(new Font("Raleway",Font.BOLD, 22));
//		number.setBounds(300, 274, 400, 30);
//		add(number);
//		
//		JLabel carddetails =new JLabel("Your 16 Digits Card Number");
//		carddetails.setFont(new Font("Raleway",Font.BOLD, 12));
//		carddetails.setBounds(100, 300, 300, 25);
//		add(carddetails);
//		
//		JLabel pinnumber =new JLabel("PIN:");
//		pinnumber.setFont(new Font("Raleway",Font.BOLD, 22));
//		pinnumber.setBounds(100, 340, 300, 30);
//		add(pinnumber);
//		
//		
//		JLabel pnumber =new JLabel("XXXX");
//		pnumber.setFont(new Font("Raleway",Font.BOLD, 22));
//		pnumber.setBounds(300, 340, 400, 30);
//		add(pnumber);
//		
//		JLabel pindetails =new JLabel("Your 4 Digits Password");
//		pindetails.setFont(new Font("Raleway",Font.BOLD, 12));
//		pindetails.setBounds(100, 370, 300, 25);
//		add(pindetails);
//		
//		JLabel services =new JLabel("Services Required:");
//		services.setFont(new Font("Raleway",Font.BOLD, 22));
//		services.setBounds(100, 410, 200, 30);
//		add(services);
//		
//		c1=new JCheckBox("ATM CARD");
//		c1.setBackground(Color.WHITE);
//		c1.setFont(new Font("Raleway",Font.BOLD,16));
//		c1.setBounds(100, 450, 120, 30);
//		add(c1);
//		
//		c2=new JCheckBox("Internet Banking");
//		c2.setBackground(Color.WHITE);
//		c2.setFont(new Font("Raleway",Font.BOLD,16));
//		c2.setBounds(100, 500, 200, 30);
//		add(c2);
//		
//		c3=new JCheckBox("Mobile Banking");
//		c3.setBackground(Color.WHITE);
//		c3.setFont(new Font("Raleway",Font.BOLD,16));
//		c3.setBounds(350, 450, 150, 30);
//		add(c3);
//		
//		c4=new JCheckBox("Email & SMS Alerts");
//		c4.setBackground(Color.WHITE);
//		c4.setFont(new Font("Raleway",Font.BOLD,16));
//		c4.setBounds(350, 500, 200, 30);
//		add(c4);
//		
//		c5=new JCheckBox("Cheque Book");
//		c5.setBackground(Color.WHITE);
//		c5.setFont(new Font("Raleway",Font.BOLD,16));
//		c5.setBounds(100, 550, 200, 30);
//		add(c5);
//		
//		c6=new JCheckBox("E-Statement");
//		c6.setBackground(Color.WHITE);
//		c6.setFont(new Font("Raleway",Font.BOLD,16));
//		c6.setBounds(350, 550, 200, 30);
//		add(c6);
//		
//		c7=new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge ");
//		c7.setBackground(Color.WHITE);
//		c7.setFont(new Font("Raleway",Font.BOLD,12));
//		c7.setBounds(100, 600, 600, 30);
//		add(c7);
//		
//		submit =new JButton("Submit");
//		submit.setBackground(Color.black);
//		submit.setForeground(Color.WHITE);
//		submit.setFont(new Font("Raleway",Font.BOLD,14));
//		submit.setBounds(420, 650, 100, 30);
//		submit.addActionListener(this);
//		add(submit);
//		
//		
//		cancel =new JButton("Cancel");
//		cancel.setBackground(Color.red);
//		cancel.setForeground(Color.WHITE);
//		cancel.setFont(new Font("Raleway",Font.BOLD,14));
//		cancel.setBounds(250, 650, 100, 30);
//		cancel.addActionListener(this);
//		add(cancel);
//		
//		
//		getContentPane().setBackground(Color.white);
//	    setSize(850,820);
//	    setLocation(350,0);
//	    setVisible(true);
//	    
//		
//		
//	}
//	public void actionPerformed(ActionEvent ae) {
//		if(ae.getSource()==submit) {
//			String accountType=null;
//			if(r1.isSelected()) {
//				accountType="Saving Account";
//			}
//			else if(r2.isSelected()) {
//				accountType="Fixed Deposit Account";
//			}
//			else if(r3.isSelected()) {
//				accountType="Current Account";
//			}
//			else if(r4.isSelected()) {
//				accountType="Reccuring Account";
//			}
//			Random  random= new Random();
//			String cardnumber="" + Math.abs((random.nextLong()%90000000L))+504093600000000L;
//			String pinnumber=""+Math.abs((random.nextLong()%9000L))+1000L;
//			String facility="";
//			if(c1.isSelected()) {
//				facility=facility+"ATM Card";
//			}
//			else if(c2.isSelected()) {
//				facility=facility+"Internet Banking";
//			}
//			else if(c3.isSelected()) {
//				facility=facility+"Mobile Banking";
//				
//			}
//			else if(c4.isSelected()) {
//				facility=facility+"Email & SMS Alerts ";
//				
//			}
//			else if(c5.isSelected()) {
//				facility=facility+"Cheque Book";
//				
//			}
//			else if(c6.isSelected()) {
//				facility=facility+"E-Statement";
//			}
//			if (accountType.equals("")) {
//	            JOptionPane.showMessageDialog(null, "Account Type is required.");
//	            return;
//	        }
//
//	        try {
//	            // Call insertData2 method from conn class
//	            conn.insertData3(formno, accountType, cardnumber, pinnumber, facility);
//	            JOptionPane.showMessageDialog(null, "Data inserted successfully!");
//
//	            // Hide the current frame
//	            setVisible(false);
//
//	            // Optionally, you can open a new frame here
//	            // new Signup3().setVisible(true); // Assuming there's a Signup3 class
//
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            JOptionPane.showMessageDialog(null, "Error inserting data. Please try again.");
//	        }
//			
//			
//		}
//		else if(ae.getSource()==cancel) {
//				
//			}
//			
//		
//	}
//
//	
//
//	public static void main(String[] args) {
//		new signup3("");
//
//	}
//
//
//package BankManagementSystem;
//
//import java.util.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//
//public class signup3 extends JFrame implements ActionListener {
//    JRadioButton r1, r2, r3, r4;
//    JCheckBox c1, c2, c3, c4, c5, c6, c7;
//    JButton cancel, submit;
//    String formno;
//    conn connection;  // Add this line to declare the connection object
//
//    signup3(String formno) {
//        this.formno = formno;
//        this.connection = new conn();  // Initialize the connection object here
//
//        setLayout(null);
//
//        JLabel l1 = new JLabel("Page 3: Account Details");
//        l1.setFont(new Font("Raleway", Font.BOLD, 22));
//        l1.setBounds(280, 40, 400, 40);
//        add(l1);
//
//        JLabel type = new JLabel("Account Type:");
//        type.setFont(new Font("Raleway", Font.BOLD, 22));
//        type.setBounds(100, 140, 300, 30);
//        add(type);
//
//        r1 = new JRadioButton("Saving Account");
//        r1.setFont(new Font("Raleway", Font.BOLD, 16));
//        r1.setBackground(Color.WHITE);
//        r1.setBounds(350, 180, 160, 20);
//        add(r1);
//
//        r2 = new JRadioButton("Fixed Deposit Account");
//        r2.setFont(new Font("Raleway", Font.BOLD, 16));
//        r2.setBackground(Color.WHITE);
//        r2.setBounds(100, 225, 210, 20);
//        add(r2);
//
//        r3 = new JRadioButton("Current Account");
//        r3.setFont(new Font("Raleway", Font.BOLD, 16));
//        r3.setBackground(Color.WHITE);
//        r3.setBounds(100, 180, 160, 20);
//        add(r3);
//
//        r4 = new JRadioButton("Recurring Deposit Account");
//        r4.setFont(new Font("Raleway", Font.BOLD, 16));
//        r4.setBackground(Color.WHITE);
//        r4.setBounds(350, 225, 240, 20);
//        add(r4);
//
//        ButtonGroup groupaccount = new ButtonGroup();
//        groupaccount.add(r1);
//        groupaccount.add(r2);
//        groupaccount.add(r3);
//        groupaccount.add(r4);
//
//        JLabel card = new JLabel("Card Number:");
//        card.setFont(new Font("Raleway", Font.BOLD, 22));
//        card.setBounds(100, 270, 300, 30);
//        add(card);
//
//        JLabel number = new JLabel("XXXX-XXXX-XXXX-4104");
//        number.setFont(new Font("Raleway", Font.BOLD, 22));
//        number.setBounds(300, 274, 400, 30);
//        add(number);
//
//        JLabel carddetails = new JLabel("Your 16 Digits Card Number");
//        carddetails.setFont(new Font("Raleway", Font.BOLD, 12));
//        carddetails.setBounds(100, 300, 300, 25);
//        add(carddetails);
//
//        JLabel pinnumber = new JLabel("PIN:");
//        pinnumber.setFont(new Font("Raleway", Font.BOLD, 22));
//        pinnumber.setBounds(100, 340, 300, 30);
//        add(pinnumber);
//
//        JLabel pnumber = new JLabel("XXXX");
//        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
//        pnumber.setBounds(300, 340, 400, 30);
//        add(pnumber);
//
//        JLabel pindetails = new JLabel("Your 4 Digits Password");
//        pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
//        pindetails.setBounds(100, 370, 300, 25);
//        add(pindetails);
//
//        JLabel services = new JLabel("Services Required:");
//        services.setFont(new Font("Raleway", Font.BOLD, 22));
//        services.setBounds(100, 410, 200, 30);
//        add(services);
//
//        c1 = new JCheckBox("ATM CARD");
//        c1.setBackground(Color.WHITE);
//        c1.setFont(new Font("Raleway", Font.BOLD, 16));
//        c1.setBounds(100, 450, 120, 30);
//        add(c1);
//
//        c2 = new JCheckBox("Internet Banking");
//        c2.setBackground(Color.WHITE);
//        c2.setFont(new Font("Raleway", Font.BOLD, 16));
//        c2.setBounds(100, 500, 200, 30);
//        add(c2);
//
//        c3 = new JCheckBox("Mobile Banking");
//        c3.setBackground(Color.WHITE);
//        c3.setFont(new Font("Raleway", Font.BOLD, 16));
//        c3.setBounds(350, 450, 150, 30);
//        add(c3);
//
//        c4 = new JCheckBox("Email & SMS Alerts");
//        c4.setBackground(Color.WHITE);
//        c4.setFont(new Font("Raleway", Font.BOLD, 16));
//        c4.setBounds(350, 500, 200, 30);
//        add(c4);
//
//        c5 = new JCheckBox("Cheque Book");
//        c5.setBackground(Color.WHITE);
//        c5.setFont(new Font("Raleway", Font.BOLD, 16));
//        c5.setBounds(100, 550, 200, 30);
//        add(c5);
//
//        c6 = new JCheckBox("E-Statement");
//        c6.setBackground(Color.WHITE);
//        c6.setFont(new Font("Raleway", Font.BOLD, 16));
//        c6.setBounds(350, 550, 200, 30);
//        add(c6);
//
//        c7 = new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge ");
//        c7.setBackground(Color.WHITE);
//        c7.setFont(new Font("Raleway", Font.BOLD, 12));
//        c7.setBounds(100, 600, 600, 30);
//        add(c7);
//
//        submit = new JButton("Submit");
//        submit.setBackground(Color.black);
//        submit.setForeground(Color.WHITE);
//        submit.setFont(new Font("Raleway", Font.BOLD, 14));
//        submit.setBounds(420, 650, 100, 30);
//        submit.addActionListener(this);
//        add(submit);
//
//        cancel = new JButton("Cancel");
//        cancel.setBackground(Color.red);
//        cancel.setForeground(Color.WHITE);
//        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
//        cancel.setBounds(250, 650, 100, 30);
//        cancel.addActionListener(this);
//        add(cancel);
//
//        getContentPane().setBackground(Color.white);
//        setSize(850, 820);
//        setLocation(350, 0);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == submit) {
//            String accountType = null;
//            if (r1.isSelected()) {
//                accountType = "Saving Account";
//            } else if (r2.isSelected()) {
//                accountType = "Fixed Deposit Account";
//            } else if (r3.isSelected()) {
//                accountType = "Current Account";
//            } else if (r4.isSelected()) {
//                accountType = "Reccuring Account";
//            }
//            Random random = new Random();
//            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L)) + 504093600000000L;
//            String pinnumber = "" + Math.abs((random.nextLong() % 9000L)) + 1000L;
//            String facility = "";
//            if (c1.isSelected()) {
//                facility = facility + "ATM Card";
//            }
//            if (c2.isSelected()) {
//                facility = facility + "Internet Banking";
//            }
//            if (c3.isSelected()) {
//                facility = facility + "Mobile Banking";
//            }
//            if (c4.isSelected()) {
//                facility = facility + "Email & SMS Alerts ";
//            }
//            if (c5.isSelected()) {
//                facility = facility + "Cheque Book";
//            }
//            if (c6.isSelected()) {
//                facility = facility + "E-Statement";
//            }
//
//            if (accountType == null) {
//                JOptionPane.showMessageDialog(null, "Account Type is required.");
//                return;
//            }
//
//            try {
//                // Call insertData3 method from conn class
//                connection.insertData3(formno, accountType, cardnumber, pinnumber, facility);
//                JOptionPane.showMessageDialog(null, "Data inserted successfully!");
//
//                // Hide the current frame
//                setVisible(false);
//
//                // Optionally, you can open a new frame here
//                // new Signup3().setVisible(true); // Assuming there's a Signup3 class
//
//            } catch (Exception e) {
//                e.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Error inserting data. Please try again.");
//            }
//
//        } else if (ae.getSource() == cancel) {
//            // Handle cancel action if needed
//        }
//    }
//
//    public static void main(String[] args) {
//        new signup3("");
//    }
//}
//

package BankManagementSystem;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton cancel, submit;
    String formno;
    conn connection; // Add this line to declare the connection object

    signup3(String formno) {
        this.formno = formno;
        this.connection = new conn(); // Initialize the connection object here

        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 300, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(350, 180, 160, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(100, 225, 210, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 180, 160, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 225, 240, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 270, 300, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4104");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(300, 274, 400, 30);
        add(number);

        JLabel carddetails = new JLabel("Your 16 Digits Card Number");
        carddetails.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetails.setBounds(100, 300, 300, 25);
        add(carddetails);

        JLabel pinnumber = new JLabel("PIN:");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinnumber.setBounds(100, 340, 300, 30);
        add(pinnumber);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(300, 340, 400, 30);
        add(pnumber);

        JLabel pindetails = new JLabel("Your 4 Digits Password");
        pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetails.setBounds(100, 370, 300, 25);
        add(pindetails);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 410, 200, 30);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 450, 120, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(100, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(350, 450, 150, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 500, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 550, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 550, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 600, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(420, 650, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(250, 650, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.white);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Reccuring Account";
            }
            
            if (accountType == null) {
                JOptionPane.showMessageDialog(null, "Account Type is required.");
                return;
            }
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L)) + 504093600L;
            String pinnumber = "" + Math.abs((random.nextLong() % 90000L)) + 1000;

            String facility = "";
            if (c1.isSelected()) {
                facility += "ATM Card, ";
            }
            if (c2.isSelected()) {
                facility += "Internet Banking, ";
            }
            if (c3.isSelected()) {
                facility += "Mobile Banking, ";
            }
            if (c4.isSelected()) {
                facility += "Email & SMS Alerts, ";
            }
            if (c5.isSelected()) {
                facility += "Cheque Book, ";
            }
            if (c6.isSelected()) {
                facility += "E-Statement, ";
            }
            if (!c7.isSelected()) {
                JOptionPane.showMessageDialog(null, "CheckBox is not CHECKED! ");
                  return;
            }
            facility = facility.substring(0, facility.length() - 2); // Remove trailing comma and space
            
            conn.insertData3(formno, accountType, cardnumber, pinnumber, facility);
            JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n PIN: " + pinnumber);
        } else if (ae.getSource() == cancel) {
           setVisible(false);
           new Login().setVisible(true);       }
    }

    public static void main(String[] args) {
        new signup3("");
    }
}




