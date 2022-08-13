package lab;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonFrame3 extends JFrame {

	private JButton buttonA;
	private JLabel labelA;
	
	private JButton buttonB;
	private JLabel labelB;
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;

	public ButtonFrame3(){
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	class ClickListenerA implements ActionListener{
		
		private char AoB;
	
		public ClickListenerA(char x){
			AoB = x;
		}
		public void actionPerformed(ActionEvent event){
			if(AoB == 'A'){
				labelA.setText("A was clicked.");
				labelB.setText("");
			}
			else{
				labelB.setText("B was clicked.");
				labelA.setText("");

			}
			
		//	labelA.setText(AoB + " was clicked.");
		}
	}
	
	private void createComponents(){
		buttonA = new JButton("A");
		ActionListener listener = new ClickListenerA('A');
		buttonA.addActionListener(listener);
		
		labelA = new JLabel("Hello");
		JPanel panel = new JPanel();
		panel.add(labelA);
		panel.add(buttonA);
		
		add(panel);
		
		buttonB = new JButton("B");
		ActionListener listener1 = new ClickListenerA('B');
		buttonB.addActionListener(listener1);
		
		labelB = new JLabel();
		//JPanel panel1 = new JPanel();
		panel.add(buttonB);
		panel.add(labelB);
		add(panel);
	}

}

