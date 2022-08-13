package project_8;


public class Project8 {
	public static void main(String args[]){
		Hashtable<String> hash = new Hashtable<String>(10);
		hash.add("A");
		hash.print();
		hash.add("I");
		hash.print();
		hash.add("U");
		hash.print();
		hash.add("O");
		hash.print();
		hash.add("E");
		hash.print();
		hash.add("E");
		hash.add("U");
		hash.add("E");
		hash.remove("E");
		System.out.println();
		hash.print();
		System.out.println();
		System.out.println(hash.size());
		System.out.println();
		
		hash.add("H");
		hash.print();
//		hash.remove("Hi");
//		hash.print();
//		hash.remove("Hi");
//		hash.print();
//		hash.remove("Hi");
//		hash.print();
//		hash.remove("Hi");
//		hash.print();
//		hash.remove("Hi");
//		hash.print();
//		hash.remove("Hi");
	}
}
