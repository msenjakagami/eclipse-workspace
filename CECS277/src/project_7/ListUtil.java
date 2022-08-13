package project_7;

import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
public class ListUtil
{
/**
 * returns a list of pairs from a given list
 * @param values list
 * @param f function
 * @return arraylist with function applied to elements
 */
 public static <T,R> List<Pair <T,R>> map(List <T> values, Function <T,R> f)
 {
	 List<Pair <T, R>> map = new ArrayList<Pair<T, R>>();
	 for(T x: values){
		 Pair<T,R> pa = new Pair<T, R>(x, f.apply(x));
		 map.add(pa);
	 }
	 return map;
 }
}