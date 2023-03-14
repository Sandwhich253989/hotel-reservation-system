package Hotel;
//import java.util.Scanner;
//
//public class login {
//	public String user_name;
//	public String password;
//	
//	public login() {
//		user_name = "WASD";
//		password = "ArneshSux69696969420";
//	}
//
// public boolean pwd_check(String user_name_input , String user_pwd_input) {
//	 
//	 if(user_name_input.equals(user_name_input)){
//		 if(user_pwd_input.equals(password)) {
//			 return true;
//		 }
//		 else
//			 return false;
//	 }
//	 else {
//		 return false;
//	 }
// }
//
// public void signin() {
//	 login obj = new login();
//	 Scanner ip = new Scanner(System.in);
//	 
//	 while(true) {
//	 System.out.println("Enter ur username");
//	 String user_name_input = ip.nextLine();
//	 System.out.println("Enter the password");
//	 String user_pwd_input = ip.nextLine();
//	 
//	 if(obj.pwd_check(user_name_input, user_pwd_input) == false) {
//		 System.out.println("invalid username or password , Try again");
//	 }
//	 else {
//		 System.out.println("Signed in successfully");
//		 break;
//	 }
//	 }
// }
//}
import java.util.Scanner;

public class login {
//creating instance variables
	public String user_name;
	public String password;
	
	public login() {
		user_name = "Admin";
		password = "agshdfjfh";
	}

 public boolean pwd_check(String user_name_input , String user_pwd_input) {
	 //checking if the username and password is same
	 if(user_name_input.equals(user_name_input)){
		 if(user_pwd_input.equals(password)) {
			 return true;
		 }
		 else
			 return false;
	 }
	 else {
		 return false;
	 }
 }

 public void signin() {
//creating objects
	 login obj = new login();
	 Scanner ip = new Scanner(System.in);
	 
	 while(true) {
	//inputing the username and password from user
	 System.out.println("Enter ur username");
	 String user_name_input = ip.nextLine();
	 System.out.println("Enter the password");
	 String user_pwd_input = ip.nextLine();
	 //calling pwd_check method 
	 if(obj.pwd_check(user_name_input, user_pwd_input) == false) {
		 System.out.println("invalid username or password , Try again");
	 }
	 else {
		 System.out.println("Signed in successfully");
		 break;
	 }
	 }
 }
}

