
package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener {

    JLabel text;
    JTextField amount;
    JButton withdraw, back;
    String pin;

    Withdrawl(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AdobeStock_178351228_Preview.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);

        add(image);

        text = new JLabel("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
        text.setForeground(Color.BLACK);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(180, 180, 700, 35);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 314, 370, 30);
        amount.setBackground(Color.white);
        image.add(amount);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(410, 396, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("BACK");
        back.setBounds(410, 435, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }

 
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == withdraw) {
            String number = amount.getText();
            if (number.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw.");
            } else {
                try {
                    double withdrawAmount = Double.parseDouble(number);
                    
                    if (withdrawAmount <= 0) {
                        JOptionPane.showMessageDialog(null, "Please enter an amount greater than zero.");
                        return;
                    }

                    Connection con = conn.getConnection();

                    // Check current balance
                    String balanceQuery = "SELECT SUM(CASE WHEN type = 'Deposit' THEN amount ELSE -amount END) AS balance FROM BANK WHERE pin = ?";
                    PreparedStatement balanceStmt = con.prepareStatement(balanceQuery);
                    balanceStmt.setString(1, pin);
                    ResultSet rs = balanceStmt.executeQuery();

                    double currentBalance = 0;
                    if (rs.next()) {
                        currentBalance = rs.getDouble("balance");
                    }
                    rs.close();
                    balanceStmt.close();

                    if (currentBalance <= 0) {
                        JOptionPane.showMessageDialog(null, "Insufficient balance. Your current balance is zero.");
                        return;
                    }

                    if (withdrawAmount > currentBalance) {
                        JOptionPane.showMessageDialog(null, "Insufficient balance");
                        return;
                    }

                    // Proceed with withdrawal
                    String query = "INSERT INTO BANK (pin, date, type, amount) VALUES (?, ?, 'Withdraw', ?)";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1, pin);
                    pstmt.setDate(2, new java.sql.Date(new Date().getTime()));
                    pstmt.setDouble(3, withdrawAmount);
                    pstmt.executeUpdate();
                    pstmt.close();

                    JOptionPane.showMessageDialog(null, "Rs " + number + " withdrawn successfully");
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













