package lab;
/**
 * models a perosn with a name and phone number
 * @author Gabriel
 *
 */
public class Person {

	private String name;
	private String phonenumber;
	/**
	 * constructor
	 * @param n name
	 * @param p phone#
	 */
	public Person(String n, String p){
		name = n;
		phonenumber = p;
	}
	/**
	 * returns name and phone# as a string
	 * @return name and phone#
	 */
	public String print(){
		return "Name: " + name + "\nPhone#: " + phonenumber;
	}
}
