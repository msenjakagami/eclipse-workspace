package workTest;

public class fadsfasd {
	public static void main(String args[]){
		String current = "aaa";
		String curnext = "ccc";
		String insert = "bbb";
		System.out.println(test(current, insert)); // A less-than B -> [negative]
		//System.out.println(test(1, 5));
		System.out.println(test(curnext, insert)); // A greater-than B [positive]
		//System.out.println(test(10, 5));
		System.out.println(test("bbb", "bbb")); // A equals B [zero]
	}
	
	public static int test(Comparable ob1, Comparable ob2){
		return ob1.compareTo(ob2);
	}
}
