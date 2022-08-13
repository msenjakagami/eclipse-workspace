package dNd;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class XdYTest {

	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		XdY d10 = new XdY(10);
		XdY d4 = new XdY(4);
		XdY d20 = new XdY(20);
		boolean run = false;
		String x = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		do{
			System.out.print(">>");
			x = in.next();
			
			if(x.equals("0")){
				run = true;
			}
			else{
				x = "";
				list.add(d10.roll());
			}
		}while(!run);
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
			System.out.print(", ");
		}
	}

}
