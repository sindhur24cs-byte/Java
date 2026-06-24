import java.sql.*;
import java.util.Scanner;
public class StudentDB {
static final String URL = "jdbc:mysql://localhost:3306/studentdb";
static final String USER = "root";
static final String PASSWORD = "root";
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
int choice;
do {
System.out.println("\n===== STUDENT DATABASE =====");
System.out.println("1. Insert");
System.out.println("2. Update");
System.out.println("3. Delete");
System.out.println("4. Search");
System.out.println("5. Exit");
System.out.print("Enter choice: ");
choice = sc.nextInt();
switch(choice) {
case 1:
System.out.print("Enter USN: ");
String usn = sc.next();
System.out.print("Enter Name: ");
String name = sc.next();
System.out.print("Enter Branch: ");
String branch = sc.next();
System.out.print("Enter Marks: ");
int marks = sc.nextInt();
String insertQuery = "insert into student values(?,?,?,?)";
PreparedStatement ps1 = con.prepareStatement(insertQuery);
ps1.setString(1, usn);
ps1.setString(2, name);
ps1.setString(3, branch);
ps1.setInt(4, marks);
ps1.executeUpdate();
System.out.println( "Record Inserted Successfully");
break;
case 2:
System.out.print("Enter USN to update: ");
String updateUSN = sc.next();
System.out.print("Enter new Marks: ");
int newMarks = sc.nextInt();
String updateQuery = "update student set marks=? where usn=?";
PreparedStatement ps2 = con.prepareStatement(updateQuery);
ps2.setInt(1, newMarks);
ps2.setString(2, updateUSN);
int rows1 = ps2.executeUpdate();
if(rows1 > 0)
System.out.println("Record Updated");
else
System.out.println("Record Not Found");
break;
case 3:
System.out.print( "Enter USN to delete: ");
String deleteUSN = sc.next();
String deleteQuery = "delete from student where usn=?";
PreparedStatement ps3 = con.prepareStatement(deleteQuery);
ps3.setString(1, deleteUSN);
int rows2 = ps3.executeUpdate();
if(rows2 > 0)
System.out.println("Record Deleted");
else
System.out.println("Record Not Found");
break;
case 4:
System.out.print("Enter USN to search: ");
String searchUSN = sc.next();
String searchQuery = "select * from student where usn=?";
PreparedStatement ps4 = con.prepareStatement(searchQuery);
ps4.setString(1, searchUSN);
ResultSet rs = ps4.executeQuery();
if(rs.next()) {
System.out.println("\nStudent Details");
System.out.println( "USN : " + rs.getString("usn"));
System.out.println("Name : "+ rs.getString("name"));
System.out.println("Branch : " + rs.getString("branch"));
System.out.println( "Marks : " + rs.getInt("marks"));
}
else {
System.out.println("Record Not Found");
}
break;
case 5:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid Choice");
}
} while(choice != 5);
con.close();
} catch(Exception e) {
System.out.println(e);
}
}
}
