package project_6;
/**
 * Project 6 class. Models a student with a first and last name and a student ID
 * @author Gabriel
 *
 */
public class Student implements Comparable<Object>{

	private String first;
	private String last;
	private int ID;
	private static int id = 1000;
	/**
	 * constructor
	 * @param f first name
	 * @param l last name
	 * @param i ID
	 */
	public Student(String f, String l){
		first = f;
		last = l;
		ID = id++;
	}
	/**
	 * Accessor returns ID number
	 * @return ID
	 */
	public int getID(){
		return ID;
	}
	/**
	 * Accessor. Returns first name
	 * @return first
	 */
	public String getfirst(){
		return first;
	}

	/**
	 * Accessor. Returns last name
	 * @return
	 */
	public String getlast(){
		return last;
	}
	/**
	 * Comparable method. Compares last names. if equal, compares first names. if equal, compares IDs
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		if(this.last.compareTo(other.last) < 0){
			return -1;
		}
		else if(this.last.compareTo(other.last) > 0){
			return 1;
		}
		else{
			if(this.first.compareTo(other.first) < 0){
				return -1;
			}
			else if(this.first.compareTo(other.first) > 0){
				return 1;
			}
			else{
				if(this.ID > other.ID){
					return 1;
				}
				else if(this.ID == other.ID){
					return 0;
				}
				else{
					return -1;
				}
			}
		}
	}

	/**
	 * to string method
	 */
	@Override
	public String toString(){
		String line1 = String.format("%10s", "Last: ") + last;
		String line2 = String.format("%10s", "First: ") + first;
		String line3 = String.format("%10s", "ID: ") + ID; 
		return line1 + "\n" + line2 + "\n" + line3 + "\n";
	}
	
}
