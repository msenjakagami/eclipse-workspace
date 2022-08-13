//package edu.midterm_3;
///**
// * Static methods to find the indices of the max and min values
// * Doesn't work, I'm sorry
// * @author Gabriel
// *
// */
//public class ComparableUtilGabrielE implements Comparable{
//
//	public static int min(Comparable[] objects){
//		
//		return minHelper(objects, 0, 1);
//	}
//	
//	public static int max(Comparable[] objects){
//		
//		return maxHelper(objects, 0, 1);
//	}
//	
//	public static int minHelper(Comparable[] objects, int min, int comp){
//		Comparable minimum = objects[min];
//		Comparable compare = objects[comp];
//		if(objects.length <= 1){
//			return min;
//		}
//		if(minimum > compare){
//			min = comp;
//			return min;
//		}
//		else{
//			min =
//			return minHelper(objects, min, comp);
//		}
//	
//	}
//	public static int maxHelper(Comparable[] objects, int max, int comp){
//		Comparable maximum = objects[max];
//		Comparable compare = objects[comp];
//		if(objects.length <= 1){
//			return max;
//		}
//		if(maximum < compare){
//			max = comp;
//			return max;
//		}
//		else{
//			max = 
//			return minHelper(objects, max, comp);
//		}
//	}
//	
//	
////	private static int minHelper(Comparable[] objects, int current, int next){
////		int minimum = 0;
////		if(next == objects.length + 1 && objects[current].compareTo(objects[next]) == 1){
////			minimum = next;
////		}
////		else if(next == objects.length + 1 && objects[current].compareTo(objects[next]) == -1){
////			minimum = current;
////		}
////		else if(next == objects.length + 1 && objects[current].compareTo(objects[next]) == 0){
////			minimum = current;
////		}
////		else{
////			if(objects[current].compareTo(objects[next]) == 1){
////				minimum = minHelper(objects, next, next + 1);
////			}
////			else if(objects[current].compareTo(objects[next]) == -1){
////				minimum = minHelper(objects, current, next + 1);
////			}
////			else if(objects[current].compareTo(objects[next]) == 0){
////				minimum = minHelper(objects, current, next + 1);
////			}
////		}
////		return minimum;
////	}
////	private static int maxHelper(Comparable[] objects, int current, int next){
////		int maximum = 0;
////		if(next == objects.length + 1 && objects[current].compareTo(objects[next]) == 1){
////			maximum = next;
////		}
////		else if(next == objects.length + 1 && objects[current].compareTo(objects[next]) == -1){
////			maximum = current;
////		}
////		else if(next == objects.length + 1 && objects[current].compareTo(objects[next]) == 0){
////			maximum = current;
////		}
////		else{
////			if(objects[current].compareTo(objects[next]) == -1){
////				maximum =  minHelper(objects, current, next + 1);
////			}
////			else if(objects[current].compareTo(objects[next]) == 1){
////				maximum =  minHelper(objects, next, next + 1);
////			}
////			else if(objects[current].compareTo(objects[next]) == 0){
////				maximum =  minHelper(objects, current, next + 1);
////			}
////		}
////		return maximum;
////	}
//
//	
//
//}
