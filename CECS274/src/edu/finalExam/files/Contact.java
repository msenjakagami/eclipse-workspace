package edu.finalExam.files;
/**
 * Creates contact objects with an associated name, number, and email
 * @author Katherine Varela
 * */
public class Contact implements Comparable<Object>{
	
	private String name;
	private String number;
	private String email;
	
	/**
	 * Default constructor.
	 * */
	public Contact(){
		name = "No name";
		number = "0";
		email = "N/A";
	}
	
	/**
	 * Overloaded constructor.
	 * Creates objects with a given name
	 * @param name - the name of the new contact
	 * */
	public Contact(String name){
		this.name = name;
	}
	
	/**
	 * Overloaded constructor.
	 * Creates objects with a given name and number
	 * @param name - the name of the new contact
	 * @param number - the number of the new contact
	 * */
	public Contact(String name, String number){
		this.name = name;
		this.number = formatNumber(number);
	}
	
	
	/**
	 * Overloaded constructor.
	 * Creates objects with a given name, number, and email address
	 * @param name - the name of the new contact
	 * @param number - the number of the new contact
	 * @param email - the email of the new contact
	 * */
	public Contact(String name, String number, String email){
		this.name = name;
		this.email = email;
		this.number = formatNumber(number);
	}
	/**
	 * compares one contact object to another, 
	 * returns -1 if the name of this contact comes before the name of the other contact, 
	 * 0 if they are same, 1 otherwise
	 * @return an integer outcome of the comparison
	 * */
	public int compareTo(Object data) {
		Contact other = (Contact) data;
		return this.name.compareTo(other.name);
	}
	
	/**
	 * gets the name of this contact
	 * @return the name as a string
	 * */
	public String getName(){	
		return name;
	}
	/**
	 * gets the phone number of this contact
	 * @return the number as a string
	 * */
	public String getNumber(){
		
		return number;
	}
	
	/**
	 * gets the email address of this contact
	 * @return the email address as a string
	 * */
	public String getEmail(){
		return email;
	}
	
	/**
	 * sets the name of this contact
	 * @param the name as a string
	 * */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * sets the phone number of this contact
	 * @param the number as a string
	 * */
	public void setNumber(String number){
		this.number = formatNumber(number);
	}
	
	/**
	 * sets the email address of this contact
	 * @param email - email address as a string
	 * */
	public void setEmail(String email){
		this.email = email;
	}
	/**
	 * formats the contact object for printing
	 * @return a string with the contact object information
	 * */
	public String toString(){
		boolean condition1 = this.number == null || this.number.equals("");
		boolean condition2 = this.email == null || this.email.equals("");
		
		if(condition1 && condition2){return "***************\nName: "  + this.name ;}
		else if(condition1){return "***************\nName: "  + this.name + "\nEmail: " + this.email; }
		else if(condition2){return "***************\nName: "  + this.name + "\nNumber: " + this.number;}	
		else{return "\n***************Name: "  + this.name +"\nNumber: " + this.number + "\nEmail: " + this.email;}
		
	}
	// formats the string before storing it as the given phone number
	private String formatNumber(String number){
		number = number.trim();
		number = number.replaceAll("\\s", "");
		if(number.length() == 10){
			return "(" + number.substring(0,3) + ") " + number.substring(3, 6) + "-" + number.substring(6);
		}
		else if(number.length() == 7){
			return number.substring(0,3) + "-" + number.substring(3);
		}	
		else{
			return number;
		}
	}
	

}
