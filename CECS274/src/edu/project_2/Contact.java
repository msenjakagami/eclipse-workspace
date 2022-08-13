package edu.project_2;

/**
 * a model for a contact that carries a name, number, email, and additional notes
 * @author Kian
 * @version - 1.0
 * @since 10/9/16
 *
 */
public class Contact implements Comparable<Object>{
	
	private String name;
	private String number;
	private String email;
	private String additional_notes;
	
	/**
	 * constructs a contact with no name, number, email, and notes
	 */
	public Contact(){
		name = " ";
		number = " ";
		email = " ";
		additional_notes = " ";
	}
	
	/**
	 * constructs a contact with a name and number
	 * @param name - the name of the contact
	 * @param number - the number of the contact
	 */
	public Contact(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	/**
	 * constructs a contact with a name, number, and email
	 * @param name - the name of the contact
	 * @param number - the number of the contact
	 * @param email - the email of the contact
	 */
	public Contact(String name, String number, String email){
		this.name = name;
		this.number = number;
		this.email = email;
	}
	
	/**
	 * constructs a contact with a name, number, email, and additional notes
	 * @param name - the name of the contact
	 * @param number - the number of the contact
	 * @param email - the email of the contact
	 * @param additional_notes - any additional notes for the contact
	 */
	public Contact(String name, String number, String email, String additional_notes){
		this.name = name;
		this.number = number;
		this.email = email;
		this.additional_notes = additional_notes;
	}
	
	/**
	 * sets the name for a contact
	 * @param name - the name of the contact
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * sets the number of the contact
	 * @param number - the number of the contact
	 */
	public void setNumber(String number){
		if(number.length() == 7){
			number = number.substring(0, 3) + "-" + number.substring(3);
			this.number = number;
		}
		else if(number.length() == 10){
			number = "(" + number.substring(0, 3) + ")" + number.substring(3, 6) + "-" + number.substring(6); 
			this.number = number;
		}
		else{
			System.out.println("Number is not valid.");
		}
	}
	
	/**
	 * sets the email of the contact
	 * @param email - the email of the contact
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
	/**
	 * adds additional notes to the contact
	 * @param additional_notes - any additional notes for the contact
	 */
	public void setAdditionalNotes(String additional_notes){
		this.additional_notes = additional_notes;
	}
	
	/**
	 * returns the name of the contact
	 * @return name - the name of the contact
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * returns the number of the contact
	 * @return number - the number of the contact
	 */
	public String getNumber(){
		return number;
	}
	
	/**
	 * returns the email of the contact
	 * @return email - the email of the contact
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * returns the additional notes of the contact
	 * @return additional_notes - the additional notes of the contact 
	 */
	public String getAdditionalNotes(){
		return additional_notes;
	}
	
	public int compareTo(Object otherObject){
		return this.name.compareTo(((Contact) otherObject).getName());
	}

}
