package lab;

public class Lab_3_Tester {

	public static void main(String[] args) {
		String f1 = "first";
		String s1 = "second";
		int f2 = 1;
		int s2 = 2;
		Person f3 = new Person("Kai", "(745) 553-2332");
		Person s3 = new Person("Mira", "(745) 421-5342");
		Pair<String> p1 = new Pair<String>(f1, s1);
		Pair<Integer> p2 = new Pair<Integer>(f2, s2);
		Pair<Person> p3 = new Pair<Person>(f3, s3);
		System.out.println("String(before):");
		System.out.println("First: " + p1.getFirst());
		System.out.println("Second: " + p1.getSecond());
		p1.swap();
		System.out.println("\nString(after):");
		System.out.println("First: " + p1.getFirst());
		System.out.println("Second: " + p1.getSecond());
		System.out.println();
		System.out.println("Integer(before):");
		System.out.println("First: " + p2.getFirst());
		System.out.println("Second: " + p2.getSecond());
		p2.swap();
		System.out.println("\nInteger(after):");
		System.out.println("First: " + p2.getFirst());
		System.out.println("Second: " + p2.getSecond());
		System.out.println();
		System.out.println("Person(before):");
		System.out.println("First: " + p3.getFirst().print());
		System.out.println("Second: " + p3.getSecond().print());
		p3.swap();
		System.out.println("\nPerson(after):");
		System.out.println("First: " + p3.getFirst().print());
		System.out.println("Second: " + p3.getSecond().print());
		
	
	
	}

}
