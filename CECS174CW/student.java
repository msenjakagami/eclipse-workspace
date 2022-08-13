
public class student {
	String name;
	int credits;
	double gpa;
}

public class studentdb
{
	public static void main(String[] args) 
	{
		student[] db;
		db = new student[3];
		
		db[0] = new student();
		db[0].name ="John";
		db[0].credits = 40;
		db[0].gpa = 2.1;
		
		db[1] = new students();
		db[1].name = "Michelle";
		db[1].credits = 90;
		db[1].gpa = 3.5;
		
		db[2] = new student();
		db[2].name = "Dave";
		db[2].credits = 60;
		db[2].gpa = 3.0;
		
		for (int i = 0; i <db.length; i++) 
		{
			System.out.println("Name: " + db[i].name);
			System.out.println("\tCredits: " + db[i].credits);
			System.out.println("\tGPA: " + db[i].gpa);
		}
	}
}
