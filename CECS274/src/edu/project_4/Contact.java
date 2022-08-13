package edu.project_4;

public class Contact implements Comparable<Object>{
	
	private String name;
	private String number;
	private String email;
	
	public Contact(){
		name = "No name";
		number = "0";
		email = "N/A";
	}
	
	public Contact(String name){
		this.name = name;
	}
	
	public Contact(String name, String number, String email){
		this.name = name;
		this.email = email;
		this.number = formatNumber(number);
	}
	
	public int compareTo(Object data) {
		Contact other = (Contact) data;
		return this.name.compareTo(other.name);
	}
	
	public String getName(){
		
		return name;
	}
	public String getNumber(){
		
		return number;
	}
	public String getEmail(){
		return email;
	}
	

	
	public void setName(String name){
		this.name = name;
	}
	
	
	public void setNumber(String number){
		this.number = formatNumber(number);
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString(){
		boolean condition1 = this.number == null || this.number.equals("");
		boolean condition2 = this.email == null || this.email.equals("");
		
		if(condition1 && condition2){return "Name: "  + this.name;}
		else if(condition1){return "Name: "  + this.name + "\nEmail: " + this.email; }
		else if(condition2){return "Name: "  + this.name + "\nNumber: " + this.number;}	
		else{return "Name: "  + this.name +"\nNumber: " + this.number + "\nEmail: " + this.email;}
		
	}
	
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
	
	public static void main(String args[]){
		Contact k = new Contact("kathy", "5 6 2 555   34 05", "");
		
		System.out.println(k);
		
	}



}
