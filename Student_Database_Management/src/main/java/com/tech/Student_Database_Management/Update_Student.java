package com.tech.Student_Database_Management;

import java.sql.*;
import java.util.*;

public class Update_Student {
	public void updateStudent() throws ClassNotFoundException, SQLException {
	    Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pass = "shrecodersql";
		Connection connect = DriverManager.getConnection(url,user,pass);
		Statement stmt = connect.createStatement();
		String a = "use Student_Database_Management";
		stmt.executeUpdate(a);
		System.out.println("Whose detail you want to update? (Enter ID)");
		String n = sc.nextLine();
		System.out.println("What do you want to Update?");
    	String Type = sc.nextLine(); 
		switch(Type) {
    	case "student_name":
            System.out.println("Enter new student name:");
            String n2 = sc.nextLine();
            String updateQuery1 = "UPDATE students SET student_name = ? WHERE id = ?";
            PreparedStatement pstmt1 = connect.prepareStatement(updateQuery1);
            pstmt1.setString(1, n2);
            pstmt1.setString(2, n);
            pstmt1.executeUpdate();
            break;

        case "course_name":
            System.out.println("Enter new course name:");
            String newCourse = sc.nextLine();
            String updateQuery2 = "UPDATE students SET course_name = ? WHERE id = ?";
            PreparedStatement pstmt2 = connect.prepareStatement(updateQuery2);
            pstmt2.setString(1, newCourse);
            pstmt2.setString(2, n);
            pstmt2.executeUpdate();
            break;

        case "marks":
            System.out.println("Enter new marks:");
            int newMarks = sc.nextInt();
            String updateQuery3 = "UPDATE students SET marks = ? WHERE id = ?";
            PreparedStatement pstmt3 = connect.prepareStatement(updateQuery3);
            pstmt3.setInt(1, newMarks);
            pstmt3.setString(2, n);
            pstmt3.executeUpdate();
            break;

        case "total":
            System.out.println("Enter new total:");
            int newTotal = sc.nextInt();
            String updateQuery4 = "UPDATE students SET total = ? WHERE id = ?";
            PreparedStatement pstmt4 = connect.prepareStatement(updateQuery4);
            pstmt4.setInt(1, newTotal);
            pstmt4.setString(2, n);
            pstmt4.executeUpdate();
            break;

        case "percent":
            System.out.println("Enter new percent:");
            float newPercent = sc.nextFloat();
            String updateQuery5 = "UPDATE students SET percent = ? WHERE id = ?";
            PreparedStatement pstmt5 = connect.prepareStatement(updateQuery5);
            pstmt5.setFloat(1, newPercent);
            pstmt5.setString(2, n);
            pstmt5.executeUpdate();
            break;

        case "grade":
            System.out.println("Enter new grade:");
            String newGrade = sc.nextLine();
            String updateQuery6 = "UPDATE students SET grade = ? WHERE student_name = ?";
            PreparedStatement pstmt6 = connect.prepareStatement(updateQuery6);
            pstmt6.setString(1, newGrade);
            pstmt6.setString(2, n);
            pstmt6.executeUpdate();
            break;

        default:
            System.out.println("Invalid update field!");    	}
    	
	}

}


