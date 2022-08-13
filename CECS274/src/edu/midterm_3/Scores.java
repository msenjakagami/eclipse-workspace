package edu.midterm_3;
/**
 * Object that assigns a numeric score to a name 
 * @author Gabriel
 *
 */
public class Scores implements Comparable{

	private String name;
	private int score;
	/**s
	 * default constructor
	 * @param name name argument
	 * @param score score argument
	 */
	public Scores(String name, int score){
		this.name = name;
		this.score = score;
	}
	/**
	 * Accessor method
	 * @return name
	 */
	public String getName(){
		return name;
	}
	/**
	 * Accessor method
	 * @return score
	 */
	public int getScore(){
		return score;
	}
	/**
	 * compares scores
	 */
	public int compareTo(Object object) {
		Scores other = (Scores) object;
		if(this.score > other.score){return -1;}
		else if(this.score < other.score){return 1;}
		else{return 0;}
	}
	
}
