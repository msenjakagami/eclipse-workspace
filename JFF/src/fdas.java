///*
//package cecs.pkg323.java.project;
//
//import java.sql.*;
//import java.util.Scanner;
//
///**
// *
// * @author Mimi Opkins with some tweaking from Dave Brown
// */
//public class CECS323JavaProject {
//	//  Database credentials
//	static String DBNAME;
//	static  Scanner in = new Scanner(System.in);
//	//This is the specification for the printout that I'm doing:
//	//each % denotes the start of a new field.
//	//The - denotes left justification.
//	//The number indicates how wide to make the field.
//	//The "s" denotes that it's a string.  All of our output in this test are 
//	//strings, but that won't always be the case.
//	static final String displayFormat="%-20s%-30s%-30s%-30s\n";
//	// JDBC driver name and database URL
//
//
//	static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
//	static String DB_URL = "jdbc:derby://localhost:1527/";
//	static Connection conn;
//	//            + "testdb;user=";
//
//	public static void main(String[] args) {
//		conn = DBConnect();
//		if(conn != null){
//			menu();
//		}
//
//		try {
//			if(conn != null)
//				conn.close();
//		}
//		catch(SQLException se){
//			System.out.println("Catch 3");
//			se.printStackTrace();
//		}
//		System.out.println("Goodbye!");
//
//	}        
//
//	/**
//	 * Creates connection to the database, or exits
//	 * @return connection to database
//	 */
//	public static Connection DBConnect(){
//		//Prompt the user for the database name, and the credentials.
//		//If your database has no credentials, you can update this code to 
//		//remove that from the connection string.
//		boolean cont = false; //general loop conditon
//		conn = null; //initialize the connection
//		while(!cont){
//			System.out.print("Name of the database (not the user account) ");
//			System.out.print("(Type Exit to leave)\n>>");
//			DBNAME = in.nextLine();
//			//Constructing the database URL connection string
//			DB_URL = DB_URL + DBNAME;
//			//Statement stmt = null;  //initialize the statement that we're using
//			try {
//				//STEP 2: Register JDBC driver
//				Class.forName("org.apache.derby.jdbc.ClientDriver");
//
//				//STEP 3: Open a connection
//				System.out.println("Connecting to database...");
//				conn = DriverManager.getConnection(DB_URL);
//				cont = true;//connection successful, loop can now end
//				System.out.println("Connected!");
//			} 
//			catch (SQLException se) {
//				if(DBNAME.equalsIgnoreCase("exit")){//database name not entered, exiting program
//					System.out.println("Exiting..."); 
//					return null;
//				}
//				//Handle errors for JDBC
//				System.out.println("Catch 1");
//				//se.printStackTrace();
//				System.out.println("Try again");
//				conn = null; //reinitialize the connectiond
//				DB_URL = "jdbc:derby://localhost:1527/"; //reset DB_URL
//
//			} 
//			catch (Exception e) {
//				//Handle errors for Class.forName
//				System.out.println("Catch 2");
//				// e.printStackTrace();
//			} 
//		}
//		return conn;
//	}
//
//
//	/**
//	 * Takes the input string and outputs "N/A" if the string is empty or null.
//	 * @param input The string to be mapped.
//	 * @return  Either the input string or "N/A" as appropriate.
//	 */
//	public static String dispNull (String input) {
//		//because of short circuiting, if it's null, it never checks the length.
//		if (input == null || input.length() == 0)
//			return "N/A";
//		else
//			return input;
//	}
//
//	/**
//	 * Displays basic menu. Allows user to go choose the view, insert, or removal menus or exits the program
//	 * checks if the user input is valid(int between 1 and x)
//	 */
//	public static void menu(){
//		boolean cont = false;
//		while(!cont){
//			System.out.println("Main Menu");
//			System.out.print("1. View \n2. Insert\n3. Remove\n4. Exit\n>>");
//			if(in.hasNextInt()){
//				int choice = in.nextInt();
//				if(choice == 1){menuV();} //goes to view menu
//				else if(choice == 2){menuI();} //goes to insert menu
//				else if(choice == 3){menuR();} //goes to removal menu
//				else if(choice == 4){cont = true;}//exits program
//				else //Verifies choice is one of the possible choices
//				{
//					System.out.println("Error. Try again");
//					cont = false;
//				}
//			}
//			else
//			{//verifies choice is an int
//				System.out.println("Error. Try again");
//				in.next();
//			}
//		}
//	}
//	/**
//	 * Displays view menu. Allows user to view all writing groups, publishers, and books, or returns to main meniu
//	 * checks if user input is valid(int between 1 and x)
//	 */
//	public static void menuV(){
//		boolean cont1 = false; //general loop condition
//		while(!cont1){
//			System.out.println("View Menu");
//			System.out.print("1. View All Writing Groups\n2. View All publishers"
//					+ "\n3. View All Books\n4. Return\n>>");
//			if(in.hasNextInt()){
//				int choice = in.nextInt();
//				Statement stmt = null;  //initialize the statement that we're using
//				System.out.println("Creating statement...");
//				if(choice == 1){
//					try{
//						stmt = conn.createStatement();
//						String sql;
//						//sql = "SELECT groupname, headwriter, yearformed, subject FROM Authors";
//						sql = "SELECT groupname FROM authors";
//						ResultSet rs = stmt.executeQuery(sql);
//						displayAuthors(rs);
//					}
//					catch(SQLException e){
//						System.out.println("Author View Catch");
//					}
//				}
//				else if(choice == 2){
//					try{
//						stmt = conn.createStatement();
//						String sql;
//						//sql = "SELECT publishername, publisheraddress, publisherphone, publisheremail FROM Publishers";
//						sql = "SELECT publishername FROM publishers";
//						ResultSet rs = stmt.executeQuery(sql);
//						displayPublishers(rs);
//					}
//					catch(SQLException e){
//						System.out.println("Publisher View Catch");
//					}
//				}
//				else if(choice == 3){
//					try{
//						stmt = conn.createStatement();
//						String sql;
//						sql = "SELECT booktitle FROM books";
//						ResultSet rs = stmt.executeQuery(sql);
//						displayBooks(rs);
//					}
//					catch(SQLException e){
//						System.out.println("Book View Catch");
//					}
//				}
//				else if(choice == 4){
//					cont1 = true;
//				}
//				else //Verifies choice validity
//				{
//					System.out.println("Error. Try again");
//					cont1 = false;
//				}
//			}
//			else
//			{
//				System.out.println("Error. Try again");
//				in.next();
//			}
//		}
//	}
//	/**
//	 * Displays insert menu. Allows user to insert new writing groups, publishers, and books, or returns to main mnue
//	 * checks if the user input is valid(int between 1 and x)
//	 * INCOMPLETE
//	 */
//	public static void menuI(){
//		boolean cont2 = false;
//		while(!cont2){
//			System.out.println("Insert Menu");
//			System.out.print("1. Insert New Writing Group\n2. Insert New publisher\n3. Insert New books\n4. Return\n>>");
//			Statement stmt = null;  //initialize the statement that we're using
//			if(in.hasNextInt()){
//
//				int choice = in.nextInt();
//				if(choice == 1){
//					try{
//						stmt = conn.createStatement();
//						String sql;
//						//sql = "SELECT groupname, headwriter, yearformed, subject FROM Authors";
//						sql = "INSERT INTO authors(groupname,headwriter,yearformed,subject) values";
//						System.out.print("Enter group name\n>>");
//						String groupname = in.nextLine();
//						System.out.print("Enter head writer's name\n>>");
//						String headwriter = in.nextLine();
//						System.out.print("Enter year the group was formed \n>>");
//						String yearformed = in.nextLine();
//						System.out.print("Enter subject\n>>");
//						String subject = in.nextLine();
//						sql = sql + "(" + groupname + ", " + headwriter + ", " + yearformed + ", " + subject +");";
//						ResultSet rs = stmt.executeQuery(sql);
//						displayAuthors(rs);
//					}
//					catch(SQLException e){
//						System.out.println("Author Insert Catch");
//					}
//				}
//				else if(choice == 2){
//					System.out.println("yay");
//				}
//				else if(choice == 3){
//					///adfasdfadsfa
//				}
//				else if(choice == 4){
//					cont2 = true;
//				}
//				else //Verifies choice validity
//				{
//					System.out.println("Error. Try again");
//					cont2 = false;
//				}
//			}
//			else{
//				System.out.println("Error. Try again");
//				in.next();
//			}
//
//		}
//	}
//	/**
//	 * Displays removal menu. Allows user to remove writing groups, publishers, and books, or returns to main mnue
//	 * checks if the user input is valid(int between 1 and x)
//	 * INCOMPLETE
//	 */
//	public static void menuR(){
//		boolean cont2 = false;
//		while(!cont2){
//			System.out.println("Removal Menu");
//			System.out.print("1. Remove Writing Group\n2. Remove publisher\n3. Remove books\n4. Return\n>>");
//			if(in.hasNextInt()){
//
//				int choice = in.nextInt();
//				if(choice == 1){
//					System.out.println("yay");
//				}
//				else if(choice == 2){
//					System.out.println("yay");
//				}
//				else if(choice == 3){
//					///adfasdfadsfa
//				}
//				else if(choice == 4){
//					cont2 = true;
//				}
//				else //Verifies choice validity
//				{
//					System.out.println("Error. Try again");
//					cont2 = false;
//				}
//			}
//			else{
//				System.out.println("Error. Try again");
//				in.next();
//			}
//
//		}
//	}
//	/**
//	 * displays all writing groups
//	 * @param rs Result Set from View menu
//	 */
//	public static void displayAuthors(ResultSet rs){
//		try{
//			//STEP 5: Extract data from result set
//			// System.out.printf(displayFormat, "Group Name", "Head Writer", "Year Formed", "Subject");
//			System.out.println("Authors");
//			System.out.printf("%-4s%-30s\n","No.", "Name");
//			int i = 1;
//			while (rs.next()) {
//				//Retrieve by column name
//				String c1 = rs.getString("groupname");
//
//				//Display values
//				System.out.printf("%-4s%-30s\n", i + ".",dispNull(c1));
//				i++;
//			}
//		}
//		catch(SQLException e){
//			System.out.println("Display Error");
//		}
//	}
//	/**
//	 * displays all publishers
//	 * @param rs Result Set from View menu
//	 */
//	public static void displayPublishers(ResultSet rs){
//		try{
//			//STEP 5: Extract data from result set
//			//System.out.printf(displayFormat, "Name", "Address", "Phone #", "Email");
//			System.out.println("Publishers");
//			System.out.printf("%-4s%-30s\n","No.", "Name");
//			int i = 1;
//			while (rs.next()) {
//				//Retrieve by column name
//				String c1 = rs.getString("publishername");
//				//Display values
//				System.out.printf("%-4s%-30s\n", i + ".",dispNull(c1));
//				i++;
//			}
//		}
//		catch(SQLException e){
//			System.out.println("Display Error");
//		}
//	}
//	/**
//	 * displays all books
//	 * @param rs Result Set from View menu
//	 */
//	public static void displayBooks(ResultSet rs){
//		try{
//			//STEP 5: Extract data from result set
//			//System.out.printf(displayFormat, "Title", "Year Published", "Page Count", "Author");
//			System.out.printf("%-4s%-30s\n","No.", "Title");
//			int i = 1;
//			while (rs.next()) {
//				//Retrieve by column name
//				String c1 = rs.getString("booktitle");
//				//Display values
//				System.out.printf("%-4s%-30s\n", i + ".", dispNull(c1));
//				i++;
//			}
//		}
//		catch(SQLException e){
//			System.out.println("Display Error");
//		}
//	}
//
//	public static void insertAuthors(ResultSet rs){
//		
//	}
//}
////end FirstExample}
//*/