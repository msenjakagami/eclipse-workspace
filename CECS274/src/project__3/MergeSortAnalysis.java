package project__3;

public class MergeSortAnalysis {
	
public static void main(String[] args){
		
		double [] randomInts1 = ArrayUtil.randomDoubleArray(10000, 10000);
		double[] randomInts2 = ArrayUtil.randomDoubleArray(20000, 20000);
		double[] randomInts3 = ArrayUtil.randomDoubleArray(30000, 30000);
		double[] randomInts4 = ArrayUtil.randomDoubleArray(40000, 40000);
		double[] randomInts5 = ArrayUtil.randomDoubleArray(50000, 50000);
		double[] randomInts6 = ArrayUtil.randomDoubleArray(60000, 60000);
		
		StopWatch s = new StopWatch();
		s.start();
		MergeSorter.sort(randomInts1);
		s.stop();
		System.out.println("Length: "+ randomInts1.length + ",   Milliseconds Elapsed: " + s.getMilliSecondsElapsed());
		s.reset();
		
		s.start();
		MergeSorter.sort(randomInts2);
		s.stop();
		System.out.println("Length: "+ randomInts2.length + ",   Milliseconds Elapsed: " + s.getMilliSecondsElapsed());
		s.reset();
		
		s.start();
		MergeSorter.sort(randomInts3);
		s.stop();
		System.out.println("Length: "+ randomInts3.length + ",   Milliseconds Elapsed: " + s.getMilliSecondsElapsed());
		s.reset();
		
		s.start();
		MergeSorter.sort(randomInts4);
		s.stop();
		System.out.println("Length: "+ randomInts4.length + ",   Milliseconds Elapsed: " + s.getMilliSecondsElapsed());
		s.reset();
		
		s.start();
		MergeSorter.sort(randomInts5);
		s.stop();
		System.out.println("Length: "+ randomInts5.length + ",   Milliseconds Elapsed: " + s.getMilliSecondsElapsed());
		s.reset();
		
		s.start();
		MergeSorter.sort(randomInts6);
		s.stop();
		System.out.println("Length: "+ randomInts6.length + ",   Milliseconds Elapsed: " + s.getMilliSecondsElapsed());
		s.reset();

		
		
	}

}
