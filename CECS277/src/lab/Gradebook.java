package lab;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
/**
 A program to add, remove, modify or print
 student names and grades.
 */
public class Gradebook
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		TreeMap<String, String> students = new TreeMap<String, String>();
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
				System.out.println("Enter name of student");
				String name = in.next();
				System.out.println("Enter grade of student");
				String grade = in.next();
				students.put(name, grade);
				//in.next();
			}
			//remove student
			else if (input.equals("R"))
			{
				System.out.println("Enter name of student");
				String rName = in.next();
				if(students.get(rName) == null){
					System.out.println("Name not found");
				}
				else{
					students.remove(rName);
				}
			}
			//modify student grade
			else if (input.equals("M"))
			{
				System.out.println("Enter name of student");
				String mName = in.next();
				if(students.get(mName) == null){
					System.out.println("Name not found");
				}
				else{
					System.out.println("Enter the new grade");
					String mGrade = in.next();
					students.put(mName, mGrade);
				}
			}
			//print students
			else if (input.equalsIgnoreCase("P"))
			{
				Set set = students.entrySet();
				Iterator i = set.iterator();
				while(i.hasNext()){
					Map.Entry x = (Map.Entry)i.next();
					System.out.print(x.getKey() + ":" + x.getValue() + " ");
				}
				System.out.println();
			}
			//exits program
			else
			{
				done = true;
			}

		}
	}
}