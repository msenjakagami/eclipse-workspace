package edu.project_2;

import java.util.Scanner;

/**
 * Simulates a cellphone that is able to add, modify, and remove contacts. It also keeps a call history and a list of favorite contacts. 
 * <p>
 * @author Kian,Andrew
 * @version 1.0
 * @since 10/15/2016
 *
 */

public class Cellphone2 {
	
	private Phonebook phonebook;
	private CallLog log;
	private Scanner in;
	
	/**
	 * Constructs a cell phone object with a blank phone book, a single empty contact, and a scanner object to read user input.
	 */
	public Cellphone2(){
		phonebook = new Phonebook();
		log = new CallLog();
		in = new Scanner(System.in);
	}
	
	/**
	 * Adds a contact to the cell phone's phonebook
	 */
	public void addContact(){
		//create contact
		Contact contact = new Contact();
		System.out.print("Name:\n>>");
		contact.setName(in.nextLine());
		System.out.print("Number:\n>>");
		contact.setNumber(in.next());
		System.out.print("Email:\n>>");
		contact.setEmail(in.next());
		in.nextLine();
		System.out.print("Note:\n>>");
		contact.setAdditionalNotes(in.nextLine());
		//add contact to phonebook
		phonebook.addContact(contact);
		phonebook.displayContacts();
	}
	
	/**
	 * Removes a contact from the cell phone's phone book
	 */
	public void removeContact(){
		phonebook.displayContacts();
		System.out.print("Remove:\n>>");
		boolean removed = phonebook.removeContact(in.next());
		System.out.println("");
		if(!removed){
			System.out.println("That contact does not exist.");
		}
		else{
			System.out.println("Successfully removed.");
		}
	}
	
	/**
	 * Modifies a contact from the cell phone's phone book
	 */
	public void modifyContact(){
		phonebook.displayContacts();
		System.out.println("Modify:\n>>");
		phonebook.modifyContact(in.next());
	}
	
	/**
	 * Display's all the contacts in the cell phone in alphabetical order.
	 */
	public void displayContacts(){
		phonebook.displayContacts();
	}
	
	/**
	 * Searches the cellphone's phone book to see if a contact exist
	 * @param name - the name of the contact
	 * @return True if the contact exist
	 */
	public boolean is_inPhonebook(String name){
		return phonebook.is_inPhonebook(name);
	}
	
	/**
	 * Retrieves a contact from the phone book. ONLY USE after is_inPhonebook to make sure the contact exist.
	 * @param name - the name of the contact
	 * @return the contact being searched for in the phone book.
	 */
	public Contact getContact(String name){
		return phonebook.getContact(name);
	}
	
	//NEED TO TEST///////////////////////////
	public void makeCall(String recipient){
		if(Character.isDigit(recipient.charAt(recipient.length() - 1))){  //test if the last digit is a number
			Call call = new Call("outgoing", recipient);
		}
		else{
			boolean exist = phonebook.is_inPhonebook(recipient);
			if(exist){
				Call call = new Call("outgoing", recipient);
			}
			else{
				System.out.println("That contact does not exist.");
			}
		}
	}
	
	public void recieveCall(){
		int rand1 = random(100, 999);
		int rand2 = random(100, 999);
		int rand3 = random(1000, 9999);
		String rand = "(" + rand1 + ") " + rand2 + "-" +rand3;
		Call call = new Call("incoming" ,rand);
		//ADD THING HERE
	}
	
	
	
 /**
  * Displays a menu for the methods in the cellphone class, 
  * 
  */
	public void cellMenu(){ //2:39 pm 10/16 Andrew added menu selection for CellPhone class
		String answer;
		String callTo;
		String bookAnswer;
		do{
		mainMenu();
		answer = in.next();
		in.nextLine();
		if(answer.equals("1")){
			System.out.println("Enter in the name or number:" );
			callTo=in.nextLine();
			System.out.println("Enter in the status of the call (incoming/outgoing)");
			makeCall(callTo);
			// NOT DONE YET, NEED TO FIGURE OUT WHAT PROGRAM NEEDS TO DO AFTER USER INPUTS THE ABOVE.
		}
		else if(answer.equals("2")){
			recieveCall(); 
		}
		else if(answer.equals("3")){
			// access phonebook
			do{
				phoneBookMenu();
				bookAnswer = in.next();
				in.nextLine();
				if(bookAnswer.equals("1")){
					addContact();
				}
				else if(bookAnswer.equals("2")){
					removeContact();
				}
				else if(bookAnswer.equals("3")){
					modifyContact();
				}
				else if(bookAnswer.equals("4")){
					displayContacts();
				}
				else if(!(bookAnswer.equals("1")||bookAnswer.equals("2")||bookAnswer.equals("3")||bookAnswer.equals("4")||bookAnswer.equalsIgnoreCase("Done"))){
					System.out.println("Not a valid input!");
				}
			}while(!bookAnswer.equalsIgnoreCase("Done"));
			
		}
		else if(answer.equals("4")){
			//callLog(), once done
		}

		else if(!(answer.equals("1")||answer.equals("2")||answer.equals("3")||answer.equals("4")||answer.equalsIgnoreCase("Done"))){
			System.out.println("Not a valid input!");
		}
		}while(!answer.equalsIgnoreCase("Done"));
	}
	
	private void mainMenu(){
		System.out.println("------------------------------------Main Menu------------------------------------");
	    System.out.println("\t1.\tMake call");
	    System.out.println("\t2.\tAnswer incoming call");
	    System.out.println("\t3.\tView Phone Book");
	    System.out.println("\t4.\tView Call Log");
	    System.out.println("\tDone.\tExit");
	}
	private void phoneBookMenu(){
		 System.out.println("------------------------------------Contacts Menu------------------------------------");
		 System.out.println("\t 1.\tAdd Contact");
		 System.out.println("\t 2.\tRemove Contact");
		 System.out.println("\t 3.\tModify Contact");
		 System.out.println("\t 4.\tDisplay Contacts");
		 System.out.println("\t Done.\tExit");
	}
	private int random(int min, int max){
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
}