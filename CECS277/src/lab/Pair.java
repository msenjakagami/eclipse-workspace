package lab;

public class Pair <T>{
	private T first;
	private T second;
	/**
	 * constructor
	 * @param f first value
	 * @param s second value
	 */
	public Pair(T f, T s){
		setPair(f, s);
	}
	/**
	 * sets value of pair
	 * @param f first value
	 * @param s second value
	 */
	public void setPair(T f, T s){
		first = f;
		second = s;
	}
	/**
	 * returns value of first
	 * @return first
	 */
	public T getFirst(){
		return first;
	}
	/**
	 * returns value of second
	 * @return second
	 */
	public T getSecond(){
		return second;
	}
	/**
	 * swaps pair values
	 */
	public void swap(){
		T temp = first;
		first = second;
		second = temp;
	}
	/**
	 * prints the pair
	 */
	public void print(){
		System.out.println("\tFirst: " + first);
		System.out.println("\tSecond: " + second);
		
	}
}
