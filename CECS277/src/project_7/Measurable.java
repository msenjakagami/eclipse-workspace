package project_7;
import java.util.ArrayList;
/**

 */
public interface Measurable<U>
{
	/**
 	Computes the measure of the object.
 	@return the measure
	 */
	public double getMeasure();
	/**
	 * returns largest value in arraylist of generic type
	 * @param x array list
	 * @return largest value based on measure
	 */
	public static <U extends Measurable<?>> U largest(ArrayList<U> x){
		U largest = x.get(0);
		for(int i = 0; i < x.size(); i++){
			U n = x.get(i);
			if(n.getMeasure() > largest.getMeasure()){
				largest = n;
			}
		}
		return largest;
	}
	
}