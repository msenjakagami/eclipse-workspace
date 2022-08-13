package edu.finalExam.files;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyGroups {
	private static Scanner userIn;
	private static int mainSelection;
	private static String YNresponse;
	private static int gAccessSelection;
	private static ArrayList<PhoneBook> groups = new ArrayList<PhoneBook>();
	
	public static void main(String[] args){
		System.out.println("Welcome to myGroups!");
		do{
			printMenu();
			userIn = new Scanner(System.in);
			try{
				mainSelection = Integer.parseInt(userIn.nextLine().trim());
			}
			catch(NumberFormatException e){
				System.out.println("Invalid selection. Input must be an integer between 1-3. Please try again.");
				mainSelection = Integer.parseInt(userIn.nextLine().trim());
			}
			if(mainSelection == 1){
				System.out.println("Name this new group: ");
				String groupName = userIn.nextLine().trim();
				PhoneBook newGroup = new PhoneBook(groupName);
	
				
				System.out.println("Add contacts to this group? Y/N");
				do{
					
					YNresponse = userIn.nextLine().trim();
					if(!YNresponse.equalsIgnoreCase("N")){
						System.out.println("Enter the name: ");
						String name = userIn.nextLine().trim();
						System.out.println("Enter the number: ");
						String number = userIn.nextLine().trim();
						Contact c = new Contact(name, number);
						newGroup.add(c);
						System.out.println("Successful add!  Would you like to add more? Y/N");
					}
					
				}while(!YNresponse.equalsIgnoreCase("N"));
				
				groups.add(newGroup);
			}
			else if(mainSelection == 2){
				if(groups.size() == 0){ System.out.println("No groups have been created."); continue;}
				
				System.out.println("Which group would you like to access?");
				printGroups();
				int i = Integer.parseInt(userIn.nextLine().trim()); //Unchecked exception can be thrown
				try{	
					PhoneBook current = groups.get(i-1);
					
					
					do{
						System.out.println("What would you like to do with \"" + current.getPHName() +"\"?");
						printAccessOptions();
						gAccessSelection = Integer.parseInt(userIn.nextLine().trim());  //Unchecked exception can be thrown
						if(gAccessSelection==1){
							System.out.println("Enter the name: ");
							String name = userIn.nextLine().trim();
							System.out.println("Enter the number: ");
							String number = userIn.nextLine().trim();	
							Contact n = new Contact(name, number);
							current.add(n);
							System.out.println("Addition was successful!");
						}
						else if(gAccessSelection==2){
							System.out.println("Enter the name of the contact you wish to modify:");
							String name = userIn.nextLine().trim();
							
							if(current.findContact(name)){
								System.out.println("Enter the new number: ");
								String number = userIn.nextLine().trim();
								try{
									current.setNumber(name, number);
									System.out.println("Modification was successful!");
								}
								catch(NoSuchElementException e){
									System.out.println("Contact was not found.");
								}
							}
							else{
								System.out.println("Contact does not exist.");
							}
						}
						else if(gAccessSelection==3){
							System.out.println("Enter the name of the contact you wish to remove:");
							String name = userIn.nextLine().trim();
							try{
								current.remove(name);
								System.out.println("Removal was successful!");
							}
							catch(NoSuchElementException e){
								System.out.println("Contact does not exist.");
							}
							
						}
						else if(gAccessSelection==4){
							System.out.println("Enter the name of the contact you wish to print:");
							String name = userIn.nextLine().trim();
							try{
								System.out.println(current.getContact(name));}
							catch(NoSuchElementException e){
								System.out.println("Contact does not exist.");
							}
						}
						else if(gAccessSelection==5){
							current.printAll();
						}
						else if(gAccessSelection > 6 || gAccessSelection < 1){
							System.out.println("Invalid range.");
						}

					}while(gAccessSelection!=6);
					
				}catch(IndexOutOfBoundsException I){
					System.out.println("Invalid range.");
				}
				
			}
			else if(mainSelection > 3 || mainSelection < 1){
				System.out.println("Invalid range. Input must be an integer between 1-3. Please try again.");
			}
			
		}while(mainSelection != 3);

		
	}
	
	private static void printMenu(){
		System.out.println("What would you like to do?\n1. Create a new group.  \n2. Access an existing group.\n3. Exit the program.");
	}
	private static void printGroups(){
		int i = 1;
		
		for(PhoneBook group : groups){
			System.out.println(i +". " + group.getPHName());
			i++;
		}
	}
	private static void printAccessOptions(){
		System.out.println("1. Add a contact.\n2. Edit a contact number.\n3. Remove a contact.\n4. Print a contact.\n5. Print this group.\n6. Return to main.");
	}
}
