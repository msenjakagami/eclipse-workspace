package dNd;
import java.util.Random;
public class XdY {

	private int max;
	private final int min = 1;
	private int lastroll;
	Random rand = new Random();
	public XdY(int max) {
		this.max = max;
	}
	
	public int roll(){
		lastroll = rand.nextInt(max) + min;
		return lastroll;
	}
	
	public void print(){
		System.out.println(lastroll);
	}
}
