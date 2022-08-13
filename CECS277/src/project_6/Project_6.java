package project_6;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class Project_6 {
	static Scanner in = new Scanner(System.in);
	static Map<Student, String> students1 = new TreeMap<Student, String>();
	static Map<Integer, String> students2 = new TreeMap<Integer,String>();
	
	public static void main(String[] args){
		boolean done = false;
		while(!done)
		{
			System.out.println("A)dd R)emove M)odify P)rint Q)uit");
			String input = in.next().toUpperCase();
			//exit program
			if (input.equals("Q"))
			{
				done = true;
			}
			//add students
			else if (input.equals("A"))
			{
				add();
			}
			//remove student
			else if (input.equals("R"))
			{
				remove();
			}
			//modify student grade
			else if (input.equals("M"))
			{
				modify();
			}
			//print students
			else if (input.equalsIgnoreCase("P"))
			{
				Set set = students1.entrySet();
				Iterator i = set.iterator();
				while(i.hasNext()){
					Map.Entry x = (Map.Entry)i.next();
					System.out.print(x.getKey().toString());
					System.out.println(String.format("%10s", "Grade: ") + x.getValue() + "\n----------------------------------");
				}
				System.out.println();
			}
			//exits program
			else
			{
				System.out.println("Invalid");
			}

		}
	}
	//method to add student to treemap
	public static void add(){
		System.out.println("Enter first name of student");
		String namef = in.next();
		System.out.println("Enter last name of student");
		String namel = in.next();
		Student n = new Student(namef, namel);
		String grade = checkGrade();
		students1.put(n, grade);
		students2.put(n.getID(), grade);
	}
	//Method to remove students from treemap
	public static void remove(){
		int id = 0;
		boolean x = false;
		while(!x){
			System.out.println("Enter student ID");
			if(in.hasNextInt()){
				id = in.nextInt();
				x = true;
			}
			else{
				in.next();
			}
		}
		if(students2.get(id) == null){
			System.out.println("Student not found");
		}
		else{
			students2.remove(id);
			Set n = students1.keySet();
			Object[] students = n.toArray();
			for(Object s: students){
				Student f = (Student) s;
				if(f.getID() == id){
					students1.remove(f);
				}
			}
		}
	}
	//Method to modify student grades in treemap
	public static void modify(){
		int id = 0;
		boolean x = false;
		while(!x){
			System.out.println("Enter student ID");
			if(in.hasNextInt()){
				id = in.nextInt();
				x = true;
			}
			else{
				in.next();
			}
		}
		if(students2.get(id) == null){
			System.out.println("Student not found");
		}
		else{
			String mGrade = checkGrade();
			students2.put(id, mGrade);
			
			Set n = students1.keySet();
			Object[] students = n.toArray();
			for(Object s: students){
				Student f = (Student) s;
				if(f.getID() == id){
					students1.put(f, mGrade);
				}
			}
		}
	}
	

	public static String checkGrade(){
		boolean run = false;
		String x = "";
		while(!run){
			System.out.println("Enter grade of student");
			x = in.next();
			if(x.equalsIgnoreCase("a")||x.equalsIgnoreCase("a-")||x.equalsIgnoreCase("a+")){
				x.toUpperCase();
				run = true;
			}
			else if(x.equalsIgnoreCase("b")||x.equalsIgnoreCase("b-")||x.equalsIgnoreCase("b+")){
				x.toUpperCase();
				run = true;
			}
			else if(x.equalsIgnoreCase("c")||x.equalsIgnoreCase("c-")||x.equalsIgnoreCase("c+")){
				x.toUpperCase();
				run = true;
			}
			else if(x.equalsIgnoreCase("d")||x.equalsIgnoreCase("d-")||x.equalsIgnoreCase("d+")){
				x.toUpperCase();
				run = true;
			}
			else if(x.equalsIgnoreCase("f")){
				x.toUpperCase();
				run = true;
			}
			else{
				System.out.println("Invalid");
			}
		}
		return x;

	}
}

