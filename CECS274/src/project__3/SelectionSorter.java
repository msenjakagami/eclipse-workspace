package project__3;

import java.util.Arrays;


public class SelectionSorter {
	
	public static void main(String[] args){
		
//		int[] randomInts1 = ArrayUtil.randomIntArray(10000, 10000);
//		int[] randomInts2 = ArrayUtil.randomIntArray(20000, 20000);
//		int[] randomInts3 = ArrayUtil.randomIntArray(30000, 30000);
//		int[] randomInts4 = ArrayUtil.randomIntArray(40000, 40000);
//		int[] randomInts5 = ArrayUtil.randomIntArray(50000, 50000);
//		int[] randomInts6 = ArrayUtil.randomIntArray(60000, 60000);
//		
//		StopWatch s = new StopWatch();
//		s.start();
//		SelectionSorter.sort(randomInts1);
//		s.stop();
//		System.out.println("Length: "+ randomInts1.length + ",   Milliseconds Elapsed: " + s.getMilliSecondsElapsed());
//		s.reset();
//		
//		s.start();
//		SelectionSorter.sort(randomInts2);
//		s.stop();
//		System.out.println("Length: "+ randomInts2.length + ",   Seconds Elapsed: " + s.getMilliSecondsElapsed());
//		s.reset();
//		
//		s.start();
//		SelectionSorter.sort(randomInts3);
//		s.stop();
//		System.out.println("Length: "+ randomInts3.length + ",   Seconds Elapsed: " + s.getMilliSecondsElapsed());
//		s.reset();
//		
//		s.start();
//		SelectionSorter.sort(randomInts4);
//		s.stop();
//		System.out.println("Length: "+ randomInts4.length + ",   Seconds Elapsed: " + s.getMilliSecondsElapsed());
//		s.reset();
//		
//		s.start();
//		SelectionSorter.sort(randomInts5);
//		s.stop();
//		System.out.println("Length: "+ randomInts5.length + ",   Seconds Elapsed: " + s.getMilliSecondsElapsed());
//		s.reset();
//		
//		s.start();
//		SelectionSorter.sort(randomInts6);
//		s.stop();
//		System.out.println("Length: "+ randomInts6.length + ",   Seconds Elapsed: " + s.getMilliSecondsElapsed());
//		s.reset();

	}
	
	public static void sort(double[] a){
		
		for(int i = 0; i < a.length; i++){
			//Find the position of minimum element beginning at i
			int minPos = minimumPosition(a, i);
			//Swap the i-th element with the minimum element
			swap(a, minPos, i);

		}
	}
	
	/**
	 * Returns the position of the minimum element
	 * */
	private static int minimumPosition(double[] a, int startingIdx){
		int minPos = startingIdx;
		for(int i = startingIdx+1; i < a.length; i++){
			if(a[minPos] > a[i]){
				minPos = i;
			}
		}
		return minPos;
	}

	public static void swap(double[] a, int i, int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

	
	public static void sort(int[] a){
		
		for(int i = 0; i < a.length; i++){
			//Find the position of minimum element beginning at i
			int minPos = minimumPosition(a, i);
			//Swap the i-th element with the minimum element
			swap(a, minPos, i);

		}
	}
	
	/**
	 * Returns the position of the minimum element
	 * */
	private static int minimumPosition(int[] a, int startingIdx){
		int minPos = startingIdx;
		for(int i = startingIdx+1; i < a.length; i++){
			if(a[minPos] > a[i]){
				minPos = i;
			}
		}
		return minPos;
	}

	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
