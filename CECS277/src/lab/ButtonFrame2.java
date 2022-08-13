package lab;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonFrame2 extends JFrame {

	private JButton button;
	private JLabel label;
	
	private JButton button1;
	private JLabel label1;
	
	public static int count;
	public static int count1;
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;

	public ButtonFrame2(){
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	class ClickListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			count++;
			label.setText("I was clicked " + count + " times");
		}
	}
	
	class ClickListener1 implements ActionListener{
		public void actionPerformed(ActionEvent event){
			count1++;
			label1.setText("I was clicked " + count1 + " times");
		}
	}
	
	private void createComponents(){
		button = new JButton("Click me");
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		
		label = new JLabel("Hello");
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		add(panel);
		
		button1 = new JButton("Click me");
		ActionListener listener1 = new ClickListener1();
		button1.addActionListener(listener1);
		
		label1 = new JLabel("Hello");
		//JPanel panel1 = new JPanel();
		panel.add(button1);
		panel.add(label1);
		add(panel);
	}

}

