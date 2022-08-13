package edu.project_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * simulates a phonebook that holds contacts of the Contact class
 * <p>
 * @author Kian
 * @version - 1.0
 * @since - 10/15/16
 *
 */

public class Phonebook {
	
	ArrayList<Contact> contacts;
	Scanner in;
	
	/**
	 * creates a phonebook object with an empty list of contacts
	 */
	public Phonebook(){
		contacts = new ArrayList<Contact>();
		in = new Scanner(System.in);
	}
	
	/**
	 * adds a nonexisting contact to the phonebook.
	 * @param contact - the contact object being added
	 */
	public void addContact(Contact contact){
		boolean match = false;
		for(int i = 1; i < contacts.size(); i++){
			String name = contacts.get(i).getName();
			if(name.equals(contact.getName())){
				match = true;
				break;
			}
		}
		if(!match){
			contacts.add(contact);
		}
		else{
			System.out.println("That contact already exists.");
		}
	}
	
	/**
	 * modifies a chosen contact's name, number, email, and additional notes.
	 * @param contact - the name of the chosen contact
	 */
	public void modifyContact(String modify_name){
		boolean match = false;
		int i;
		for(i = 0; i < contacts.size(); i++){
			String name = contacts.get(i).getName();
			if(name.equals(modify_name)){
				match = true;
				break;
			}
		}
		if(match){
			String answer;
				do{
					modifyMenu();
					answer = in.next();
		            in.nextLine();
		            if(answer.equals("1")){
			            System.out.print("\nEnter new name:\n>>"); 
			            contacts.get(i).setName(in.nextLine());
		            }
		            else if(answer.equals("2")){
		            	System.out.print("\nEnter new number:\n>>");
		            	contacts.get(i).setNumber(in.next());
		
		            }
		            else if(answer.equals("3")){
		            	System.out.print("\nEnter new email:\n>>");
		            	contacts.get(i).setEmail(in.nextLine());
		
				    }
		            else if(answer.equals("4")){
		            	System.out.print("\nEnter new notes:\n>>");
		            	// ASK ABOUT in.nextLine() problem (FIXED added in in.NextLine after answer input call (not sure why that works but it does..))
		            	contacts.get(i).setAdditionalNotes(in.nextLine());
		            	System.out.println(" ");
				    }
		            else if(!(answer.equals("1")||answer.equals("2")||(answer.equals("3")||answer.equals("4")||answer.equalsIgnoreCase("Done")))){
		            	System.out.println("Not a valid input!");  
				    }
		            }while(!answer.equalsIgnoreCase("Done"));
				}
		else{
			System.out.println("That contact does not exists.");
			}
		}
	
	/**
	 * removes a chosen contact from the phonebook
	 * @param contact - the chosen contact's name
	 */
	public boolean removeContact(String remove_name){
		boolean match = false;
		for(int i = 0; i < contacts.size(); i++){
			String name = contacts.get(i).getName();
			if(name.equals(remove_name)){
				contacts.remove(i);
				match = true;
				break;
			}
		}
		return match;
	}
	
	/**
	 * displays the whole phonebook
	 */
	public void displayContacts(){
		System.out.println("Contacts:");
		Collections.sort(contacts);
		System.out.printf("%-4s%-16s%-16s%-32s%-32s","#." , "[NAME]", "[NUMBER]", "[EMAIL]", "[NOTES]");
		System.out.println("\n");
		int no = 1;
		for(Contact contact : contacts){
			System.out.printf("%-4s%-16s%-16s%-32s%-32s", no + ".", contact.getName(), contact.getNumber(), contact.getEmail(), contact.getAdditionalNotes());
			System.out.println(" ");
			no++;
		}
	}
	
	/**
	 * Searches the phone book to see if a contact exist.
	 * @param name - The name of the contact.
	 * @return match - True if the contact is in the phone book.
	 */
	public boolean is_inPhonebook(String name){
		boolean match = false;
		for(int i = 0; i < contacts.size(); i++){
			String current_name = contacts.get(i).getName();
			if(current_name.equals(name)){
				match = true;
				break;
			}
		}
		return match;
	}
	
	/**
	 * Retrieves a contact from the phone book. ONLY USE after is_inPhonebook to make sure the contact exist.
	 * @param name - the name of the contact.
	 * @return The contact being searched for.
	 */
	public Contact getContact(String name){
		int pos = 0;
		for(int i = 0; i < contacts.size(); i++){
			String current_name = contacts.get(i).getName();
			if(current_name.equals(name)){
				pos = i;
				break;
			}
		}
		return contacts.get(pos);
	}
	
	private void modifyMenu(){
        System.out.println("1.\tModify name");
        System.out.println("2.\tModify number");
        System.out.println("3.\tModify email");
        System.out.println("4.\tModify notes");
        System.out.println("Done.\tExit");
        System.out.print(">>");
	}
}
