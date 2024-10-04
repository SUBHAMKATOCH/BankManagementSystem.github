package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener {

    JTextField tfAadharNumber, tfpan;
    JLabel additionaldetails, ExistingAccount, religion, SeniorCitizen, AadharNumber, PANNumber, categories, income, educational, Occupation, qualification;
    JRadioButton syes, sno, eyes, eno;
    ButtonGroup SeniorCitizengroup, ExistingAccountgroup;
    JButton next;
    JComboBox jceducation, jcoccupation, jcincome, jccategory, jcreligion;
    String formno;

    Signup2(String formno) {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE2");
        setLayout(null);

        additionaldetails = new JLabel("PAGE 2: ADDITIONALS DETAILS");
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionaldetails.setBounds(290, 40, 400, 90);
        add(additionaldetails);

        religion = new JLabel("Religion");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String valreligion[] = {"", "Hindu", "Muslim", "Sikh", "Christian", "Other"};
        jcreligion = new JComboBox(valreligion);
        jcreligion.setBounds(300, 140, 400, 30);
        jcreligion.setBackground(Color.WHITE);
        add(jcreligion);

        categories = new JLabel("Categories:");
        categories.setFont(new Font("Raleway", Font.BOLD, 20));
        categories.setBounds(100, 190, 200, 30);
        add(categories);

        String valcategory[] = {"", "General", "OBC", "SC", "ST", "Other"};
        jccategory = new JComboBox(valcategory);
        jccategory.setBounds(300, 190, 400, 30);
        jccategory.setBackground(Color.WHITE);
        add(jccategory);

        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String valincome[] = {"", "NULL", "<1,50,000", "<2,50,000", "<5,00,000", "UPTO 10,00,000"};
        jcincome = new JComboBox(valincome);
        jcincome.setBounds(300, 240, 400, 30);
        jcincome.setBackground(Color.WHITE);
        add(jcincome);

        educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);

        qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 320, 200, 30);
        add(qualification);

        String valeducation[] = {"", "Non-Graduation", "Graduate", "Post-Graduation", "Doctorate", "Other"};
        jceducation = new JComboBox(valeducation);
        jceducation.setBounds(300, 317, 400, 30);
        jceducation.setBackground(Color.WHITE);
        add(jceducation);

        Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation.setBounds(100, 390, 200, 30);
        add(Occupation);

        String valOccupation[] = {"", "Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        jcoccupation = new JComboBox(valOccupation);
        jcoccupation.setBounds(300, 390, 400, 30);
        jcoccupation.setBackground(Color.WHITE);
        add(jcoccupation);

        PANNumber = new JLabel("PAN Number:");
        PANNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        PANNumber.setBounds(100, 440, 200, 30);
        add(PANNumber);

        tfpan = new JTextField();
        tfpan.setFont(new Font("Raleway", Font.BOLD, 14));
        tfpan.setBounds(300, 440, 400, 30);
        add(tfpan);

        AadharNumber = new JLabel("Aadhar Number:");
        AadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        AadharNumber.setBounds(100, 490, 200, 30);
        add(AadharNumber);

        tfAadharNumber = new JTextField();
        tfAadharNumber.setFont(new Font("Raleway", Font.BOLD, 14));
        tfAadharNumber.setBounds(300, 490, 400, 30);
        add(tfAadharNumber);

        SeniorCitizen = new JLabel("Senior Citizen:");
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        SeniorCitizen.setBounds(100, 540, 200, 30);
        add(SeniorCitizen);

        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("NO");
        sno.setBounds(430, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        SeniorCitizengroup = new ButtonGroup();
        SeniorCitizengroup.add(sno);
        SeniorCitizengroup.add(syes);

        ExistingAccount = new JLabel("Existing Account:");
        ExistingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        ExistingAccount.setBounds(100, 590, 200, 30);
        add(ExistingAccount);

        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("NO");
        eno.setBounds(430, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ExistingAccountgroup = new ButtonGroup();
        ExistingAccountgroup.add(eno);
        ExistingAccountgroup.add(eyes);

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
        String religion = (String) jcreligion.getSelectedItem();
        String categories = (String) jccategory.getSelectedItem();
        String income = (String) jcincome.getSelectedItem();
        String qualification = (String) jceducation.getSelectedItem();
        String occupation = (String) jcoccupation.getSelectedItem();
        String seniorCitizen = null;
        if (syes.isSelected()) {
            seniorCitizen = "YES";
        } else if (sno.isSelected()) {
            seniorCitizen = "NO";
        }

        String existingAccount = null;
        if (eyes.isSelected()) {
            existingAccount = "YES";
        } else if (eno.isSelected()) {
            existingAccount = "NO";
        }
        String aadharNumber = tfAadharNumber.getText().trim();
        String panNumber = tfpan.getText().trim();

        // Input validation
        if (religion.isEmpty() || categories.isEmpty() || aadharNumber.isEmpty() || panNumber.isEmpty() ||
                seniorCitizen == null || existingAccount == null) {
            JOptionPane.showMessageDialog(null, "All fields are required.");
            return;
        }

        try {
            // Call insertData2 method from conn class
            conn.insertData2(formno, religion, categories, income, qualification, occupation, seniorCitizen, existingAccount, aadharNumber, panNumber);
            JOptionPane.showMessageDialog(null, "Data inserted successfully!");
            
            setVisible(false);
    		new signup3(formno).setVisible(true);
           

            // Optionally, you can open a new frame here
            // new Signup3().setVisible(true); // Assuming there's a Signup3 class

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error inserting data. Please try again.");
        }
    }

    public static void main(String[] args) {
        new Signup2(""); // Replace with appropriate form number or parameter
    }
}
