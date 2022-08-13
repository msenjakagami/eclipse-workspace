package lab;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**A car shape that can be positioned anywhere on the screen.*/
public class Car extends JPanel implements Runnable{
	int posA = 0;  
	int velA = 3;
	int posB = 2;
	int velB = 4;

	public void paint(Graphics g){
		super.paintComponents(g);
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 600, 400);
		
		g.setColor(Color.BLUE);
		g.fillRect(5 + posA, 230, 100, 50);
		
		g.setColor(Color.WHITE);
		g.fillRect(25 + posA, 235, 60, 20);
		
	
		
		g.setColor(Color.BLACK);
		g.fillOval(0 +posA, 265, 35, 35);
		g.fillOval(75 +posA, 265, 35, 35);

//		g.setColor(Color.GRAY);
//		g.fillOval(0 + x, 265, 17, 17);
//		g.fillOval(75+ x, 265, 17, 17);
		
		g.setColor(Color.RED);
		g.fillRect(50 + posB, 230, 100, 50);
		
		g.setColor(Color.WHITE);
		g.fillRect(70 + posB, 235, 60, 20);
		
		g.setColor(Color.BLACK);
		g.fillOval(45 +posB, 265, 35, 35);
		g.fillOval(120 +posB, 265, 35, 35);
//
//		g.setColor(Color.GRAY);
//		g.fillOval(45 + x2, 265, 17, 17);
//		g.fillOval(120 + x2, 265, 17, 17);
	}
	
	public void run(){
		while(true){
			if(posA < -50|| posA > 500){
				velA = -velA;
			}
			if(posB < -150||posB > 450){
				velB = -velB;
			}

			posB += velB;
			posA += velA;
			repaint();

			try{
				Thread.sleep(10);
			} 
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
