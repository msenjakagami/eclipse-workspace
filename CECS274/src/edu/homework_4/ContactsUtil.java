package edu.homework_4;
import java.util.LinkedList;
import java.util.ListIterator;
import edu.project_2.Contact;
import java.util.Scanner;
/**
 * 
 * @author Gabriel
 *
 */
public class ContactsUtil {
	
	public static void pt3(){
		Scanner in = new Scanner(System.in);
		Contact zak = new Contact("zak", "562");
		Contact marc = new Contact("marc","274");
		Contact cas = new Contact("cas", "124");
		Contact adri = new Contact("adri", "098");
		Contact nia = new Contact("nia", "124");
		Contact rico = new Contact("rico", "212");
		LinkedList<Contact> contacts = new LinkedList<Contact>();
		contacts.add(zak);
		contacts.add(marc);
		contacts.add(cas);
		contacts.add(adri);
		contacts.add(nia);
		contacts.add(rico);
		int ind = 1;
		for(Contact i: contacts){
			System.out.println(ind + ". " + i.getName());
			ind++;
		}
		System.out.println();
		
		System.out.print("Enter a number to remove\n>>");
		int n = in.nextInt();
		downsize(contacts, n);
		
		ind = 1;
		for(Contact i: contacts){
			System.out.println(ind + ". "  + i.getName());
			ind++;
		}
		
	}
	
	public static void downsize(LinkedList<Contact> contacts, int n){
		ListIterator<Contact> iter = contacts.listIterator();
		for(int i = 1; i <= contacts.size(); i++){
			iter.next();
			if(i == n){
				iter.remove();
			}
		}
	}

}
