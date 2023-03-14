package Hotel;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
//
//public class menu {
//	 public int amount;
//	 public static int rooms[] = {20,28,13,4};
//	 public static int classic_room_numbers[] = {101,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129};
//	 public static int deluxe_room_numbers[] = {130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157};
//	 public int double_deluxe_room_numbers[] = {158,159,160,161,162,163,164,165,166,167,168,169};
//	 public int presidential_room_numbers[]  = {201,202,203,204};
//public void menu() {
//	welcome greet = new welcome();
//	login sg = new login();
//	menu obj = new menu();
//	greet.welcome();
//	sg.signin();
//	
//	Scanner ip = new Scanner(System.in);
//	while(true) {
//	System.out.println("============================================================================="
//			+ "\n\n1.Rooms\n2.Restaurant\n3.Spa\n4.Jacuzzi\n"
//			+ "======================================================================================");
//	System.out.println("Choose any one from the above : ");
//	int c = ip.nextInt();
//	if(c==1)
//		obj.room(amount);
//	else if(c==2)
//		obj.restaurant();
//	else if(c==3)
//		obj.Spa();
//	else if(c==4)
//		obj.Jacuzzi();
//	
//	System.out.println("Do you want to exit the menu ? (Y for yes and N for no)");
//	String exit = ip.next();
//	if(exit.equals("Y") ||exit.equals("y") || exit.equals("yes") || exit.equals("Yes") || exit.equals("YES") || exit.equals("YeS")) {
//		System.out.println("\r\n"
//				+ "████████╗██╗░░██╗░█████╗░███╗░░██╗██╗░░██╗  ██╗░░░██╗░█████╗░██╗░░░██╗  ░█████╗░███╗░░██╗██████╗░\r\n"
//				+ "╚══██╔══╝██║░░██║██╔══██╗████╗░██║██║░██╔╝  ╚██╗░██╔╝██╔══██╗██║░░░██║  ██╔══██╗████╗░██║██╔══██╗\r\n"
//				+ "░░░██║░░░███████║███████║██╔██╗██║█████═╝░  ░╚████╔╝░██║░░██║██║░░░██║  ███████║██╔██╗██║██║░░██║\r\n"
//				+ "░░░██║░░░██╔══██║██╔══██║██║╚████║██╔═██╗░  ░░╚██╔╝░░██║░░██║██║░░░██║  ██╔══██║██║╚████║██║░░██║\r\n"
//				+ "░░░██║░░░██║░░██║██║░░██║██║░╚███║██║░╚██╗  ░░░██║░░░╚█████╔╝╚██████╔╝  ██║░░██║██║░╚███║██████╔╝\r\n"
//				+ "░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝  ░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░\r\n"
//				+ "\r\n"
//				+ "██╗░░░██╗██╗░██████╗██╗████████╗  ░█████╗░░██████╗░░█████╗░██╗███╗░░██╗██╗\r\n"
//				+ "██║░░░██║██║██╔════╝██║╚══██╔══╝  ██╔══██╗██╔════╝░██╔══██╗██║████╗░██║██║\r\n"
//				+ "╚██╗░██╔╝██║╚█████╗░██║░░░██║░░░  ███████║██║░░██╗░███████║██║██╔██╗██║██║\r\n"
//				+ "░╚████╔╝░██║░╚═══██╗██║░░░██║░░░  ██╔══██║██║░░╚██╗██╔══██║██║██║╚████║╚═╝\r\n"
//				+ "░░╚██╔╝░░██║██████╔╝██║░░░██║░░░  ██║░░██║╚██████╔╝██║░░██║██║██║░╚███║██╗\r\n"
//				+ "░░░╚═╝░░░╚═╝╚═════╝░╚═╝░░░╚═╝░░░  ╚═╝░░╚═╝░╚═════╝░╚═╝░░╚═╝╚═╝╚═╝░░╚══╝╚═╝");
//		break;
//	}
//	}
//	
//}
//
//public int room(int a) {
//	menu obj = new menu();
//	Scanner ip = new Scanner(System.in);
//	TimeUnit t = TimeUnit.SECONDS;
//	System.out.println("\n1.Check in\n2.Check out");
//	System.out.println("Choose an option : ");
//	int choice = ip.nextInt();
//	try {
//	switch(choice) {
//		case 1:
//			System.out.println("Room type (following prices below are for 1 day) : ");
//			System.out.println("\n1.Classic (₹5000)\n2.Deluxe  (₹6000)\n3.Double Deluxe (₹8000) \n4.presidential (₹10000)");
//			System.out.println("Enter the room type he/she/they want to reserve/book");
//			int room_type = ip.nextInt();
//			System.out.println("Enter the number of Rooms you want : ");
//			int no_of_rooms = ip.nextInt();
//			System.out.println("Number of adults : ");
//			int parents = ip.nextInt();
//			System.out.println("Number of children : ");
//			int children = ip.nextInt();
//			int people = parents + children;
//			System.out.println("Number of days he/she/they are going to stay : ");
//			int days = ip.nextInt();
//			int room_number = 0;
//			int arr_room_numbers[] = new int[100];
//			t.sleep(5L);
//			for(int i=0;i<no_of_rooms;i++) {
//			room_number = obj.gen_room_number(room_type);
//			arr_room_numbers[i] = room_number;
//			if(room_number !=0) {
//			if(room_type==1 && rooms[0]!=0) {
//				amount = 5000 * days + a;
//				rooms[0] -= 1;
//			}
//			if(room_type==2 && rooms[1]!=0) {
//				amount = 6000 * days + a;
//				rooms[1] -=1;
//			}
//			if(room_type==3 && rooms[2]!=0) {
//				amount = 8000 * days + a;
//				rooms[2] -=1;
//			}
//			if(room_type==4 && rooms[3]!=0) {
//				amount = 10000 * days + a;
//				rooms[3] -=1;
//			}
//			
//			}
//			}
//			System.out.println("Your room has been reserved successfully :)");
//			t.sleep(1L);
//			System.out.println("your room numbers are : ");
//			t.sleep(2L);
//			for(int i=0 ; i< arr_room_numbers.length ; i++)
//				if(arr_room_numbers[i] !=0)
//				System.out.print(arr_room_numbers[i] + " ");
//				t.sleep(1L);
//			System.out.println();
//
//			
//			break;
//		case 2: 
//			System.out.println("Room type (following prices below are for 1 day) : ");
//			System.out.println("\n1.Classic (₹5000)\n2.Deluxe  (₹6000)\n3.Double Deluxe (₹8000) \n4.presidential (₹10000)");
//			System.out.println("Enter the room type you stayed in this hotel");
//			int room_type_checkout = ip.nextInt();
//			System.out.println("Enter the room number where you stayed : ");
//			int room_number_checkout = ip.nextInt();
//			
//			if(room_type_checkout == 1) {
//				for(int i=0 ; i<classic_room_numbers.length;i++) {
//					if(classic_room_numbers[i] == room_number_checkout)
//						classic_room_numbers[i] = 0;
//				}
//			}
//			if(room_type_checkout == 2) {
//				for(int i=0 ; i<deluxe_room_numbers.length;i++) {
//					if(deluxe_room_numbers[i] == room_number_checkout)
//						deluxe_room_numbers[i] = 0;
//				}
//			}
//			
//			if(room_type_checkout == 3) {
//				for(int i=0 ; i<double_deluxe_room_numbers.length;i++) {
//					if(deluxe_room_numbers[i] == room_number_checkout)
//						 deluxe_room_numbers[i] = 0;
//				}
//			}
//			if(room_type_checkout == 4) {
//				for(int i=0 ; i<double_deluxe_room_numbers.length;i++) {
//					if(double_deluxe_room_numbers[i] == room_number_checkout)
//						double_deluxe_room_numbers[i] = 0;
//				}
//			}
//			System.out.println("Pls wait , Generating the bill...............");
//			t.sleep(5L);
//			if(amount !=0)
//			System.out.println("Your bill is : ₹" + amount);
//			else
//			System.out.println("You clearly have not checked into this hotel, nice try scammer");
//			
//			break;
//	}
//	}catch(Exception e) {
//		System.out.println("ERR");
//	}
//	return amount;
//}		
//
//public void restaurant() {
//	Scanner ip = new Scanner(System.in);
//	TimeUnit t = TimeUnit.SECONDS;
//	try {
//	System.out.println("=====================================================================================================\n"
//			         + "*****************************************************************************************************\n"
//			         + ""
//			         + "█┼┼┼█ ███ █┼┼ ███ ███ █▄┼▄█ ███ ┼┼ ███ ███ ┼┼ ███ █┼█ ███ ┼┼ ███ ███ ███ ███ ███ █┼█ ███ ███ █┼┼█ ███\r\n"
//			         + "█┼█┼█ █▄┼ █┼┼ █┼┼ █┼█ █┼█┼█ █▄┼ ┼┼ ┼█┼ █┼█ ┼┼ ┼█┼ █▄█ █▄┼ ┼┼ █▄┼ █▄┼ █▄▄ ┼█┼ █▄█ █┼█ █▄┼ █▄█ ██▄█ ┼█┼\r\n"
//			         + "█▄█▄█ █▄▄ █▄█ ███ █▄█ █┼┼┼█ █▄▄ ┼┼ ┼█┼ █▄█ ┼┼ ┼█┼ █┼█ █▄▄ ┼┼ █┼█ █▄▄ ▄▄█ ┼█┼ █┼█ ███ █┼█ █┼█ █┼██ ┼█┼\r\n"
//			         + ""
//			         + "****************************************************************************************************\n"
//			         + "====================================================================================================\n");
//	
//	t.sleep(2L);
//	System.out.println("LOADING...................................");
//	t.sleep(5L);
//	
//	System.out.println("Breakfast\tSoups\tStarters\tMain Courses\tSnacks\tAlcohol\tBeverages\tDeserts\n"
//					 + "  Idly\n"
//					 + "  Dosa\n"
//					 + "  Podi dosa\n"
//					 + "  Puri\n"
//					 + "  Idiappam\n"
//					 + "  French toast\n"
//					 + "  Veg Sandwich\n"
//					 + "  Veg Salad\n"
//					 + "  Masala Dosa\n"
//					 + "  Chola Batura\n"
//					 + "  Corn Flakes\n"
//					 + "  Oats\n"
//					 + "  Vada\n"
//					 + "  Rava dosa\n"
//					 + "  Pongal\n");
//	
//	
//	System.out.println("Enter the number of dishes you are going to order : ");
//	int no_of_dishes = ip.nextInt();
//	t.sleep(1L);
//	System.out.println("Choose your favored dishes (type it like 'dish,dish'");
//	String dishes = ip.next();
//	System.out.println("Food will be ready within 15 mins , pls be patient ");
//	t.sleep(2L);
//	System.out.println("Enter the Room number you are staying : ");
//	String room_number = ip.next();
//	System.out.println("Generating the bill...............................");
//	t.sleep(10L);
//	System.out.println("Your restaurant bill is now : ₹" + (250*no_of_dishes));
//	
//	amount += 250*no_of_dishes;
//	
//	t.sleep(5L);
//	
//	}
//	catch(Exception e) {
//		System.out.println("ERR");
//	}
//		
//}
//
//public void Spa() {
//	Scanner ip = new Scanner(System.in);
//	TimeUnit t = TimeUnit.SECONDS;
//	
//	System.out.println("\r\n"
//			+ "███████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
//			+ "█▄─█▀▀▀█─▄█▄─▄▄─█▄─▄███─▄▄▄─█─▄▄─█▄─▀█▀─▄█▄─▄▄─███─▄─▄─█─▄▄─███─▄─▄─█─█─█▄─▄▄─███─▄▄▄▄█▄─▄▄─██▀▄─██\r\n"
//			+ "██─█─█─█─███─▄█▀██─██▀█─███▀█─██─██─█▄█─███─▄█▀█████─███─██─█████─███─▄─██─▄█▀███▄▄▄▄─██─▄▄▄██─▀─██\r\n"
//			+ "▀▀▄▄▄▀▄▄▄▀▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▀▄▄▄▀▄▄▄▀▄▄▄▄▄▀▀▀▀▄▄▄▀▀▄▄▄▄▀▀▀▀▄▄▄▀▀▄▀▄▀▄▄▄▄▄▀▀▀▄▄▄▄▄▀▄▄▄▀▀▀▄▄▀▄▄▀");
//	
//	try {
//	System.out.println("Options : ");
//	System.out.println("\n1.Whole body masssage 30 minutes(₹1000)\n2.Whole body massage 1 hour(₹2000)");
//	System.out.println("Select from the options");
//	int options = ip.nextInt();
//	
//	System.out.println("Enter your room number : ");
//	int room_number  = ip.nextInt();
//	t.sleep(2L);
//	System.out.println("Pls wait patiently for 5 mins the spa manager will escort you to the room for massage.");
//	t.sleep(2L);
//	System.out.println("Generating the bill...............................");
//	t.sleep(10L);
//	if(options == 1) {
//		amount += 1000;
//		System.out.println("Your Spa bill is  : ₹" +  1000);
//	}
//	else if(options == 2) {
//		amount += 2000;
//		System.out.println("Your Spa bill is  : ₹" +  2000);
//	}
//	}
//	catch(Exception e) {
//		System.out.println("ERR");
//	}
//	
//}
//
//public void Jacuzzi() {
//	TimeUnit t = TimeUnit.SECONDS;
//	Scanner ip = new Scanner(System.in);
//	try {
//	System.out.println("Jacuzzi is 500 rupees per hour , do you want to use it ? ");
//	String option = ip.nextLine();
//	t.sleep(1L);
//	System.out.println("Enter the Room number you are staying : ");
//	String room_number = ip.next();
//	System.out.println("Generating bill...............");
//	t.sleep(5L);
//	if(option.equals("Y") ||option.equals("y") || option.equals("yes") || option.equals("Yes") || option.equals("YES") || option.equals("YeS")) {
//		System.out.println("The jacuzzi bill is  " + 500);
//		amount += 500;
//	}
//	}
//	catch(Exception e){
//		System.out.println("ERR");
//	}
//}
//
//public int gen_room_number(int i) {
//	int room_number = 0;
//	if(i==1) {
//		room_number = classic_room_numbers[(int)(Math.random()*classic_room_numbers.length)];
//		int temp[] = new int[60];
//		for(int j=0;j<classic_room_numbers.length ; j++) {
//			if(classic_room_numbers[j] != room_number)
//				temp[j] = classic_room_numbers[j];
//				
//		}
////		classic_room_numbers = Arrays.copyOf(temp, temp.length);
//		for(int j=0 ; j<classic_room_numbers.length;j++) {
//			if(j<temp.length)
//				classic_room_numbers[j] = temp[j];
//			else
//				classic_room_numbers[j] = 0;
//		}
////		for(int j=0 ; j<classic_room_numbers.length ; j++)
////			System.out.print(classic_room_numbers[j] + " ");
//	}
//	if(i==2) {
//		room_number = deluxe_room_numbers[(int)(Math.random()*deluxe_room_numbers.length)];
//		int temp[] = new int[100];
//		for(int j=0;j<deluxe_room_numbers.length ; j++) {
//			if(deluxe_room_numbers[j] != room_number)
//				temp[j] = deluxe_room_numbers[j];
//		}
//		for(int j=0 ; j<deluxe_room_numbers.length;j++) {
//			if(j<temp.length)
//				deluxe_room_numbers[j] = temp[j];
//			else
//				deluxe_room_numbers[j] = 0;
//		}
//	}
//	if(i==3) {
//		room_number = double_deluxe_room_numbers[(int)(Math.random()*double_deluxe_room_numbers.length)];
//		int temp[] = new int[100];
//		for(int j=0;j<double_deluxe_room_numbers.length ; j++) {
//			if(double_deluxe_room_numbers[j] != room_number)
//				temp[j] = double_deluxe_room_numbers[j];
//		}
//		for(int j=0 ; j<double_deluxe_room_numbers.length;j++) {
//			if(j<temp.length)
//				double_deluxe_room_numbers[j] = temp[j];
//			else
//				double_deluxe_room_numbers[j] = 0;
//		}
//	}
//	if(i==4) {
//		while(room_number == 0)
//		room_number = presidential_room_numbers[(int)(Math.random()*presidential_room_numbers.length)];
//		for(int j=0;j<presidential_room_numbers.length ; j++) {
//			if(presidential_room_numbers[j] == room_number)
//				presidential_room_numbers[j] = 0;
//		}
//	}
//	
//	return room_number;
//
//}
//
//
//}

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class menu {
//Creating instance variables
	 public int amount;
	 public static int rooms[] = {20,28,13,4};
	 public static int classic_room_numbers[] = {101,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129};
	 public static int deluxe_room_numbers[] = {130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157};
	 public int double_deluxe_room_numbers[] = {158,159,160,161,162,163,164,165,166,167,168,169};
	 public int presidential_room_numbers[]  = {201,202,203,204};
public void menu() {
//creating class objects
	welcome greet = new welcome();
	login sg = new login();
	menu obj = new menu();
	greet.welcome();
//	sg.signin();
	
	Scanner ip = new Scanner(System.in);
	while(true) {
	System.out.println("============================================================================="
			+ "\n\n1.Rooms\n2.Restaurant\n3.Spa\n4.Jacuzzi\n"
			+ "======================================================================================");
	System.out.println("Choose any one from the above : ");
	int c = ip.nextInt(); //inputing the choice
	//calling the specific methods
	if(c==1)
		obj.room(amount);
	else if(c==2)
		obj.restaurant();
	else if(c==3)
		obj.Spa();
	else if(c==4)
		obj.Jacuzzi();
	
	System.out.println("Do you want to exit the menu ? (Y for yes and N for no)");
	String exit = ip.next();
	if(exit.equals("Y") ||exit.equals("y") || exit.equals("yes") || exit.equals("Yes") || exit.equals("YES") || exit.equals("YeS")) {
		System.out.println("\r\n"
				+ "████████╗██╗░░██╗░█████╗░███╗░░██╗██╗░░██╗  ██╗░░░██╗░█████╗░██╗░░░██╗  ░█████╗░███╗░░██╗██████╗░\r\n"
				+ "╚══██╔══╝██║░░██║██╔══██╗████╗░██║██║░██╔╝  ╚██╗░██╔╝██╔══██╗██║░░░██║  ██╔══██╗████╗░██║██╔══██╗\r\n"
				+ "░░░██║░░░███████║███████║██╔██╗██║█████═╝░  ░╚████╔╝░██║░░██║██║░░░██║  ███████║██╔██╗██║██║░░██║\r\n"
				+ "░░░██║░░░██╔══██║██╔══██║██║╚████║██╔═██╗░  ░░╚██╔╝░░██║░░██║██║░░░██║  ██╔══██║██║╚████║██║░░██║\r\n"
				+ "░░░██║░░░██║░░██║██║░░██║██║░╚███║██║░╚██╗  ░░░██║░░░╚█████╔╝╚██████╔╝  ██║░░██║██║░╚███║██████╔╝\r\n"
				+ "░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝  ░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░\r\n"
				+ "\r\n"
				+ "██╗░░░██╗██╗░██████╗██╗████████╗  ░█████╗░░██████╗░░█████╗░██╗███╗░░██╗██╗\r\n"
				+ "██║░░░██║██║██╔════╝██║╚══██╔══╝  ██╔══██╗██╔════╝░██╔══██╗██║████╗░██║██║\r\n"
				+ "╚██╗░██╔╝██║╚█████╗░██║░░░██║░░░  ███████║██║░░██╗░███████║██║██╔██╗██║██║\r\n"
				+ "░╚████╔╝░██║░╚═══██╗██║░░░██║░░░  ██╔══██║██║░░╚██╗██╔══██║██║██║╚████║╚═╝\r\n"
				+ "░░╚██╔╝░░██║██████╔╝██║░░░██║░░░  ██║░░██║╚██████╔╝██║░░██║██║██║░╚███║██╗\r\n"
				+ "░░░╚═╝░░░╚═╝╚═════╝░╚═╝░░░╚═╝░░░  ╚═╝░░╚═╝░╚═════╝░╚═╝░░╚═╝╚═╝╚═╝░░╚══╝╚═╝");
		break;
	}
	}
	
}

public int room(int a) {
//creating objects
	menu obj = new menu();
	Scanner ip = new Scanner(System.in);
	TimeUnit t = TimeUnit.SECONDS;
	System.out.println("\n1.Check in\n2.Check out");
	System.out.println("Choose an option : ");
	int choice = ip.nextInt();
//using try and switch
	try {
	switch(choice) {
case 1:
System.out.println("Room type (following prices below are for 1 day) : ");
System.out.println("\n1.Classic (₹5000)\n2.Deluxe  (₹6000)\n3.Double Deluxe (₹8000) \n4.presidential (₹10000)");
	System.out.println("Enter the room type he/she/they want to reserve/book");
	int room_type = ip.nextInt();
	System.out.println("Enter the number of Rooms you want : ");
	int no_of_rooms = ip.nextInt();
	System.out.println("Number of adults : ");
	int adults = ip.nextInt(); //inputing the number of adults
	System.out.println("Number of children : ");
	int children = ip.nextInt();
	int people = adults + children;
	System.out.println("Number of days he/she/they are going to stay : ");
	int days = ip.nextInt();
	int room_number = 0;
	int arr_room_numbers[] = new int[100];
	t.sleep(5L);
	for(int i=0;i<no_of_rooms;i++) { //storing the generated room numbers in an array
		room_number = obj.gen_room_number(room_type);
		arr_room_numbers[i] = room_number;
		if(room_number !=0) { //calculating the amount
			if(room_type==1 && rooms[0]!=0) {
				amount = 5000 * days + a;
				rooms[0] -= 1;
			}
			if(room_type==2 && rooms[1]!=0) {
				amount = 6000 * days + a;
				rooms[1] -=1;
			}
			if(room_type==3 && rooms[2]!=0) {
				amount = 8000 * days + a;
				rooms[2] -=1;
			}
			if(room_type==4 && rooms[3]!=0) {
				amount = 10000 * days + a;
				rooms[3] -=1;
			}
			
			}
			}
	System.out.println("Your room has been reserved successfully :)");
	t.sleep(1L);
System.out.println("your room numbers are : ");
	t.sleep(2L);
	for(int i=0 ; i< arr_room_numbers.length ; i++)//printing the generated room numbers
		if(arr_room_numbers[i] !=0)
			System.out.print(arr_room_numbers[i] + " ");
		t.sleep(1L);

	System.out.println();
	break;
case 2: 
//inputing basic details
System.out.println("Room type (following prices below are for 1 day) : ");
	System.out.println("\n1.Classic (₹5000)\n2.Deluxe  (₹6000)\n3.Double Deluxe (₹8000) \n4.presidential (₹10000)");
	System.out.println("Enter the room type you stayed in this hotel");
int room_type_checkout = ip.nextInt();
System.out.println("Enter the room number where you stayed : ");
int room_number_checkout = ip.nextInt();
if(room_type_checkout == 1) {
for(int i=0 ; i<classic_room_numbers.length;i++) {
if(classic_room_numbers[i] == room_number_checkout)
					classic_room_numbers[i] = 0;
				}
			}
if(room_type_checkout == 2) {
		for(int i=0 ; i<deluxe_room_numbers.length;i++) {																		if(deluxe_room_numbers[i]==room_number_checkout)
				deluxe_room_numbers[i] = 0;
				}
			}
			
if(room_type_checkout == 3) {
		for(int i=0 ; i<double_deluxe_room_numbers.length;i++) {
			if(deluxe_room_numbers[i] == room_number_checkout)
				deluxe_room_numbers[i] = 0;
				}
			}
if(room_type_checkout == 4) {
		for(int i=0 ; i<double_deluxe_room_numbers.length;i++) {
			if(double_deluxe_room_numbers[i] == room_number_checkout)
				double_deluxe_room_numbers[i] = 0;
				}
			}
System.out.println("Pls wait , Generating the bill...............");
t.sleep(5L);
	if(amount !=0)
		System.out.println("Your bill is : ₹" + amount);
	else
		System.out.println("You clearly have not checked into this hotel, nice try scammer");
			
	break;
	}
	}catch(Exception e) {
		System.out.println("ERR");
	}
return amount;
}		

public void restaurant() {
//restaurant
	Scanner ip = new Scanner(System.in);
	TimeUnit t = TimeUnit.SECONDS;
	try {
	System.out.println("=====================================================================================================\n"
			         + "*****************************************************************************************************\n"
			         + ""
			         + "█┼┼┼█ ███ █┼┼ ███ ███ █▄┼▄█ ███ ┼┼ ███ ███ ┼┼ ███ █┼█ ███ ┼┼ ███ ███ ███ ███ ███ █┼█ ███ ███ █┼┼█ ███\r\n"
			         + "█┼█┼█ █▄┼ █┼┼ █┼┼ █┼█ █┼█┼█ █▄┼ ┼┼ ┼█┼ █┼█ ┼┼ ┼█┼ █▄█ █▄┼ ┼┼ █▄┼ █▄┼ █▄▄ ┼█┼ █▄█ █┼█ █▄┼ █▄█ ██▄█ ┼█┼\r\n"
			         + "█▄█▄█ █▄▄ █▄█ ███ █▄█ █┼┼┼█ █▄▄ ┼┼ ┼█┼ █▄█ ┼┼ ┼█┼ █┼█ █▄▄ ┼┼ █┼█ █▄▄ ▄▄█ ┼█┼ █┼█ ███ █┼█ █┼█ █┼██ ┼█┼\r\n"
			         + ""
			         + "****************************************************************************************************\n"
			         + "====================================================================================================\n");
	
	t.sleep(2L);
	System.out.println("LOADING...................................");
	t.sleep(5L);
	//menu
	System.out.println("Breakfast       Soups           Starters           Main Courses     Snacks   Alcohol     Beverages    Deserts\n"
            + "  Idly         Veg soup         Paneer Tikka       Veg briyani      Bajji    Vodka       Orange juice Icecream(any flavour)\n"
            + "  Dosa         Chicken soup     Gobi fry           Chicken briyani  Bonda    Kingfisher  Coca cola    Brownie\n"
            + "  Podi dosa    Veg Manchow soup Mushroom fry       Veg Noodles      Vada                 Lassi        Falooda\n"                                       
            + "  Puri         Tomato soup      Chicken Kebab      Mutton Briyani   Samosa               Lime juice   Fruit salad\n"                                                      
            + "  Idiappam     Sweet corn soup  Mutton chukka      Schezwan noodles Cutlet               Milk shakes  Choco truffle cake\n" 
            + "  French toast Mushroom soup    Drumstick chicken  Roti Naan        Paani poori\n"
            + "  Veg Sandwich                  Chicken 65         Paratta          Aloo tikki\n"
            + "  Veg Salad                     Gobi manchurian    Chilly parotta\n"                 
            + "  Masala Dosa\n"
            + "  Chola Batura\n"
            + "  Corn Flakes\n"
            + "  Oats\n"
            + "  Vada\n"
            + "  Rava dosa\n"
            + "  Pongal\n");

	
	
//inputing the dishes and room number from user
System.out.println("Enter the number of dishes you are going to order : ");
int no_of_dishes = ip.nextInt();
t.sleep(1L);
System.out.println("Choose your favored dishes (type it like 'dish,dish'");
String dishes = ip.next();
System.out.println("Food will be ready within 15 mins , pls be patient ");
//t.sleep(2L);
System.out.println("Enter the Room number you are staying : ");
String room_number = ip.next();
System.out.println("Generating the bill...............................");
t.sleep(10L);
System.out.println("Your restaurant bill is now : ₹" + (250*no_of_dishes));

amount += 250*no_of_dishes; //adds the bill to the total room amount
	
t.sleep(5L);
	
}
catch(Exception e) {
	System.out.println("ERR");
	}
		
}

public void Spa() {
///spa
	Scanner ip = new Scanner(System.in);
	TimeUnit t = TimeUnit.SECONDS;
	
	System.out.println("\r\n"
			+ "███████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
			+ "█▄─█▀▀▀█─▄█▄─▄▄─█▄─▄███─▄▄▄─█─▄▄─█▄─▀█▀─▄█▄─▄▄─███─▄─▄─█─▄▄─███─▄─▄─█─█─█▄─▄▄─███─▄▄▄▄█▄─▄▄─██▀▄─██\r\n"
			+ "██─█─█─█─███─▄█▀██─██▀█─███▀█─██─██─█▄█─███─▄█▀█████─███─██─█████─███─▄─██─▄█▀███▄▄▄▄─██─▄▄▄██─▀─██\r\n"
			+ "▀▀▄▄▄▀▄▄▄▀▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▀▄▄▄▀▄▄▄▀▄▄▄▄▄▀▀▀▀▄▄▄▀▀▄▄▄▄▀▀▀▀▄▄▄▀▀▄▀▄▀▄▄▄▄▄▀▀▀▄▄▄▄▄▀▄▄▄▀▀▀▄▄▀▄▄▀");
	
try {
	System.out.println("Options : ");
	System.out.println("\n1.Whole body masssage 30 minutes(₹1000)\n2.Whole body massage 1 hour(₹2000)");
	System.out.println("Select from the options");
	int options = ip.nextInt();
	
	System.out.println("Enter your room number : ");
	int room_number  = ip.nextInt();
	t.sleep(2L);
	System.out.println("Pls wait patiently for 5 mins the spa manager will escort you to the room for massage.");
	t.sleep(2L);
	System.out.println("Generating the bill...............................");
	t.sleep(10L);
	if(options == 1) {
		amount += 1000;
		System.out.println("Your Spa bill is  : ₹" +  1000);
	}
	else if(options == 2) {
		amount += 2000;
		System.out.println("Your Spa bill is  : ₹" +  2000);
	}
	}
catch(Exception e) {
	System.out.println("ERR");
}
	
}

public void Jacuzzi() {
//jacuzzi
	TimeUnit t = TimeUnit.SECONDS;
	Scanner ip = new Scanner(System.in);
try {
	System.out.println("Jacuzzi is 500 rupees per hour , do you want to use it ? ");
	String option = ip.nextLine();
	t.sleep(1L);
	System.out.println("Enter the Room number you are staying : ");
	String room_number = ip.next();
	System.out.println("Generating bill...............");
	t.sleep(5L);
	if(option.equals("Y") ||option.equals("y") || option.equals("yes") || option.equals("Yes") || option.equals("YES") || option.equals("YeS")) {
		System.out.println("The jacuzzi bill is  " + 500);
		amount += 500; //adds bill to total room amount
	}
	}
catch(Exception e){
	System.out.println("ERR");
	}
}

public int gen_room_number(int i) {
//generates room number and makes changes to the available hotel rooms
	int room_number = 0;
	if(i==1) {
		room_number = classic_room_numbers[(int)(Math.random()*classic_room_numbers.length)]; //generates room number
		int temp[] = new int[60];
		for(int j=0;j<classic_room_numbers.length ; j++) {
			if(classic_room_numbers[j] != room_number)
				temp[j] = classic_room_numbers[j];
				
		}
//		classic_room_numbers = Arrays.copyOf(temp, temp.length);
		for(int j=0 ; j<classic_room_numbers.length;j++) {
			if(j<temp.length)
				classic_room_numbers[j] = temp[j];
			else
				classic_room_numbers[j] = 0;
		}
//		for(int j=0 ; j<classic_room_numbers.length ; j++)
//			System.out.print(classic_room_numbers[j] + " ");
	}
	if(i==2) {
		room_number = deluxe_room_numbers[(int)(Math.random()*deluxe_room_numbers.length)];
		int temp[] = new int[100];
		for(int j=0;j<deluxe_room_numbers.length ; j++) {
			if(deluxe_room_numbers[j] != room_number)
				temp[j] = deluxe_room_numbers[j];
		}
		for(int j=0 ; j<deluxe_room_numbers.length;j++) {
			if(j<temp.length)
				deluxe_room_numbers[j] = temp[j];
			else
				deluxe_room_numbers[j] = 0;
		}
	}
	if(i==3) {
		room_number = double_deluxe_room_numbers[(int)(Math.random()*double_deluxe_room_numbers.length)];
		int temp[] = new int[100];
		for(int j=0;j<double_deluxe_room_numbers.length ; j++) {
			if(double_deluxe_room_numbers[j] != room_number)
				temp[j] = double_deluxe_room_numbers[j];
		}
		for(int j=0 ; j<double_deluxe_room_numbers.length;j++) {
			if(j<temp.length)
				double_deluxe_room_numbers[j] = temp[j];
			else
				double_deluxe_room_numbers[j] = 0;
		}
	}
	if(i==4) {
		while(room_number == 0)
		room_number = presidential_room_numbers[(int)(Math.random()*presidential_room_numbers.length)];
		for(int j=0;j<presidential_room_numbers.length ; j++) {
			if(presidential_room_numbers[j] == room_number)
				presidential_room_numbers[j] = 0;
		}
	}
	
	return room_number;

}
}

