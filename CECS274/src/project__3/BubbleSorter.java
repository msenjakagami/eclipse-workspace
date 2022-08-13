package project__3;
/**
 * Algorithm for creating a Bubble Sort method
 * @author Gabriel
 * @version 1.0
 * @since 2016-10-31
 */
public class BubbleSorter{
	/**
	 * Bubblesort algorithm 
	 * @param a - the array to be sorted
	 */
	public static void sort(double[] a){
		boolean finished = false;
		do{	
			int timesSwitched = 0;
			for(int i = 0; i < a.length - 1; i++){
				if(a[i] > a[i + 1]){
					swap(a, i, i+1);
					timesSwitched++;
				}
			}
			if (timesSwitched == 0){finished = true;}
		}while(!finished);
	}

	private static void swap(double[] a, int i, int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

	/**
	 * Bubblesort algorithm 
	 * @param a - the array to be sorted
	 */
	public static void sort(int[] a){
		boolean finished = false;
		do{	
			int timesSwitched = 0;
			for(int i = 0; i < a.length - 1; i++){
				if(a[i] > a[i + 1]){
					swap(a, i, i+1);
					timesSwitched++;
				}
			}
			if (timesSwitched == 0){
				finished = true;
			}
		}while(!finished);
	}

	private static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
}



