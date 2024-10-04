//////package BankManagementSystem;
//////
//////
//////
//////
//////import java.sql.Connection;
//////
//////import java.sql.DriverManager;
//////import java.sql.PreparedStatement;
//////
//////public class conn {
//////
//////    private static Connection con = null;
//////
//////    public static Connection getConnection() {
//////        try {
//////            Class.forName("oracle.jdbc.driver.OracleDriver");
//////            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "subham");
//////        } catch (Exception e) {
//////            e.printStackTrace();
//////        }
//////        return con;
//////    }
//////
//////    public static void insertData(String formno, String name, String fname, String dob, String gender, String email, String marital, String address, String city, String state, String pincode) {
//////        try {
//////            Connection con = getConnection();
//////            String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//////            PreparedStatement pstmt = con.prepareStatement(query);
//////            pstmt.setString(1, formno);
//////            pstmt.setString(2, name);
//////            pstmt.setString(3, fname);
//////            pstmt.setString(4, dob);
//////            pstmt.setString(5, gender);
//////            pstmt.setString(6, email);
//////            pstmt.setString(7, marital);
//////            pstmt.setString(8, address);
//////            pstmt.setString(9, city);
//////            pstmt.setString(10, state);
//////            pstmt.setString(11, pincode);
//////            pstmt.executeUpdate();
//////            pstmt.close();
//////        } catch (Exception e) {
//////            e.printStackTrace();
//////        }
//////    }
//////    public static void insertData2(religion, categories, income, qualification, occupation, seniorCitizen, existingAccount, aadharNumber, panNumber) {
//////        try {
//////            Connection con = getConnection();
//////            String query = "INSERT INTO signup (religion, categories, fname, dob, gender, email, marital, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//////            PreparedStatement pstmt = con.prepareStatement(query);
//////            pstmt.setString(1, religion);
//////            pstmt.setString(2, categories);
//////            pstmt.setString(3, fname);
//////            pstmt.setString(4, dob);
//////            pstmt.setString(5, gender);
//////            pstmt.setString(6, email);
//////            pstmt.setString(7, marital);
//////            pstmt.setString(8, address);
//////            pstmt.setString(9, city);
//////           
//////            pstmt.executeUpdate();
//////            pstmt.close();
//////        } catch (Exception e) {
//////            e.printStackTrace();
//////        }
//////    }
//////
//////    public static void main(String[] args) {
//////        Connection con = conn.getConnection();
//////        if (con != null) {
//////            System.out.println("Connected.");
//////        } else {
//////            System.out.println("Not connected...");
//////        }
//////    }
//////}
////
////
////
////
////package BankManagementSystem;
////
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.PreparedStatement;
////
////public class conn {
////
////    private static Connection con = null;
////
////    public static Connection getConnection() {
////        try {
////            Class.forName("oracle.jdbc.driver.OracleDriver");
////            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "subham");
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        return con;
////    }
////
////    public static void insertData(String formno, String name, String fname, String dob, String gender, String email, String marital, String address, String city, String state, String pincode) {
////        try {
////            Connection con = getConnection();
////            String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
////            PreparedStatement pstmt = con.prepareStatement(query);
////            pstmt.setString(1, formno);
////            pstmt.setString(2, name);
////            pstmt.setString(3, fname);
////            pstmt.setString(4, dob);
////            pstmt.setString(5, gender);
////            pstmt.setString(6, email);
////            pstmt.setString(7, marital);
////            pstmt.setString(8, address);
////            pstmt.setString(9, city);
////            pstmt.setString(10, state);
////            pstmt.setString(11, pincode);
////            pstmt.executeUpdate();
////            pstmt.close();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
////
////    public static void insertData2(String formno, String religion, String categories, String income, String qualification, String occupation, String seniorCitizen, String existingAccount, String aadharNumber, String panNumber) {
////        try {
////            Connection con = getConnection();
////            String query = "INSERT INTO signup2 (formno, religion, categories, income, qualification, occupation, seniorCitizen, existingAccount, aadharNumber, panNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
////            PreparedStatement pstmt = con.prepareStatement(query);
////            pstmt.setString(1, formno);
////            pstmt.setString(2, religion);
////            pstmt.setString(3, categories);
////            pstmt.setString(4, income);
////            pstmt.setString(5, qualification);
////            pstmt.setString(6, occupation);
////            pstmt.setString(7, seniorCitizen);
////            pstmt.setString(8, existingAccount);
////            pstmt.setString(9, aadharNumber);
////            pstmt.setString(10, panNumber);
////            pstmt.executeUpdate();
////            pstmt.close();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
////    public static void insertData3(String formno ,String accountType, String cardnumber, String pinnumber, String facility) {
////        try {
////            Connection con = getConnection();
////            String query = "INSERT INTO signup2 (formno, accountType, cardnumber, pinnumber, facility) VALUES (?, ?, ?, ?, ?)";
////            PreparedStatement pstmt = con.prepareStatement(query);
////            pstmt.setString(1, formno);
////            pstmt.setString(2, accountType);
////            pstmt.setString(3, cardnumber);
////            pstmt.setString(4, pinnumber);
////            pstmt.setString(5, facility);
////            
////            pstmt.executeUpdate();
////            pstmt.close();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
////
////    public static void main(String[] args) {
////        Connection con = conn.getConnection();
////        if (con != null) {
////            System.out.println("Connected.");
////        } else {
////            System.out.println("Not connected...");
////        }
////    }
////}
////
//
//package BankManagementSystem;
//
//import java.sql.Statement;
//import java.sql.Connection;
//
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class conn {
//
//   // public static final String s = null;
//	private static Connection con = null;
//
//    public static Connection getConnection() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoolini", "subham", "root");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return con;
//    }
//    
//    public static ResultSet executeQuery(String query) {
//        ResultSet rs = null;
//        try {
//            Connection con = getConnection();
//            Statement stmt = con.createStatement();
//            rs = stmt.executeQuery(query);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return rs;
//    }
//    public static void insertData(String formno, String name, String fname, String dob, String gender, String email, String marital, String address, String city, String state, String pincode) {
//        try {
//            Connection con = getConnection();
//            String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            PreparedStatement pstmt = con.prepareStatement(query);
//            pstmt.setString(1, formno);
//            pstmt.setString(2, name);
//            pstmt.setString(3, fname);
//            pstmt.setString(4, dob);
//            pstmt.setString(5, gender);
//            pstmt.setString(6, email);
//            pstmt.setString(7, marital);
//            pstmt.setString(8, address);
//            pstmt.setString(9, city);
//            pstmt.setString(10, state);
//            pstmt.setString(11, pincode);
//            pstmt.executeUpdate();
//            pstmt.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void insertData2(String formno, String religion, String categories, String income, String qualification, String occupation, String seniorCitizen, String existingAccount, String aadharNumber, String panNumber) {
//        try {
//            Connection con = getConnection();
//            String query = "INSERT INTO signup2 (formno, religion, categories, income, qualification, occupation, seniorCitizen, existingAccount, aadharNumber, panNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            PreparedStatement pstmt = con.prepareStatement(query);
//            pstmt.setString(1, formno);
//            pstmt.setString(2, religion);
//            pstmt.setString(3, categories);
//            pstmt.setString(4, income);
//            pstmt.setString(5, qualification);
//            pstmt.setString(6, occupation);
//            pstmt.setString(7, seniorCitizen);
//            pstmt.setString(8, existingAccount);
//            pstmt.setString(9, aadharNumber);
//            pstmt.setString(10, panNumber);
//            pstmt.executeUpdate();
//            pstmt.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void insertData3(String formno, String accountType, String cardnumber, String pinnumber, String facility) {
//        try {
//            Connection con = getConnection();
//            String query = "INSERT INTO signup3 (formno, accountType, cardnumber, pinnumber, facility) VALUES (?, ?, ?, ?, ?)";
//            PreparedStatement pstmt = con.prepareStatement(query);
//            pstmt.setString(1, formno);
//            pstmt.setString(2, accountType);
//            pstmt.setString(3, cardnumber);
//            pstmt.setString(4, pinnumber);
//            pstmt.setString(5, facility);
//            pstmt.executeUpdate();
//            pstmt.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        Connection con = conn.getConnection();
//        if (con != null) {
//            System.out.println("Connected.");
//        } else {
//            System.out.println("Not connected...");
//        }
//    }
//
//	public static  ResultSet executeUpdate(String query) {
//		ResultSet r = null;
//        try {
//            Connection con = getConnection();
//            Statement stmt = con.createStatement();
//            r = stmt.executeQuery(query);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return r;
//		
//		
//	}
//
//	
//
//	
//}
//


package BankManagementSystem;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class conn {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoolini", "root", "subham");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static ResultSet executeQuery(String query) {
        ResultSet rs = null;
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void insertData(String formno, String name, String fname, String dob, String gender, String email, String marital, String address, String city, String state, String pincode) {
        try {
            Connection con = getConnection();
            String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, formno);
            pstmt.setString(2, name);
            pstmt.setString(3, fname);
            pstmt.setString(4, dob);
            pstmt.setString(5, gender);
            pstmt.setString(6, email);
            pstmt.setString(7, marital);
            pstmt.setString(8, address);
            pstmt.setString(9, city);
            pstmt.setString(10, state);
            pstmt.setString(11, pincode);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertData2(String formno, String religion, String categories, String income, String qualification, String occupation, String seniorCitizen, String existingAccount, String aadharNumber, String panNumber) {
        try {
            Connection con = getConnection();
            String query = "INSERT INTO signup2 (formno, religion, categories, income, qualification, occupation, seniorCitizen, existingAccount, aadharNumber, panNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, formno);
            pstmt.setString(2, religion);
            pstmt.setString(3, categories);
            pstmt.setString(4, income);
            pstmt.setString(5, qualification);
            pstmt.setString(6, occupation);
            pstmt.setString(7, seniorCitizen);
            pstmt.setString(8, existingAccount);
            pstmt.setString(9, aadharNumber);
            pstmt.setString(10, panNumber);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertData3(String formno, String accountType, String cardnumber, String pinnumber, String facility) {
        try {
            Connection con = getConnection();
            String query = "INSERT INTO signup3 (formno, accountType, cardnumber, pinnumber, facility) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, formno);
            pstmt.setString(2, accountType);
            pstmt.setString(3, cardnumber);
            pstmt.setString(4, pinnumber);
            pstmt.setString(5, facility);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection con = conn.getConnection();
        if (con != null) {
            System.out.println("Connected.");
        } else {
            System.out.println("Not connected...");
        }
    }

    public static ResultSet executeUpdate(String query) {
        ResultSet r = null;
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            r = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }
}

