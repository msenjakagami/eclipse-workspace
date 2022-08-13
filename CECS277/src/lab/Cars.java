package lab;
import javax.swing.JFrame;

public class Cars{
	public static void main(String[] args){
		Car c = new Car();
		
		JFrame frame = new JFrame();
		
		frame.setTitle("Car Animation");
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(c);
		
		Thread t = new Thread(c);
		t.start();
	}
}