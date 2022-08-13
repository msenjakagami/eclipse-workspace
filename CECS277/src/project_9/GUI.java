package project_9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class GUI extends JFrame{

	private JTextField textField;
	private JTextField errorText;
	private JButton ichi, ni, san, shi, go, roku, shichi, hachi, kyuu, zero, add, sub, multi, div, equals, clear, space;
	private String temp1, temp2;
	private JPanel control;
	private double answer = 0;
	private boolean equalsChosen = false;
	private boolean spacePressed = true;
	private Stack<String> stack = new Stack<String>();

	public GUI() {
		super("Calculator");
		textField = new JTextField(null, 20);
		errorText = new JTextField(null, 15);
		textField.setEditable(false);
		errorText.setEditable(false);

		initializeButtons();

		Number n = new Number();
		Equals e = new Equals();

		ichi.addActionListener(n);
		ni.addActionListener(n);
		san.addActionListener(n); 
		shi.addActionListener(n);
		go.addActionListener(n);
		roku.addActionListener(n);
		shichi.addActionListener(n);
		hachi.addActionListener(n);
		kyuu.addActionListener(n);
		zero.addActionListener(n);
		clear.addActionListener(n);
		space.addActionListener(n);
		add.addActionListener(n);
		sub.addActionListener(n);
		multi.addActionListener(n);
		div.addActionListener(n);
		equals.addActionListener(e);

		control = new JPanel();
		control.setLayout(new FlowLayout());
		setColor();

		control.add(textField, BorderLayout.SOUTH);
		control.add(errorText, BorderLayout.EAST);
		control.add(ichi);
		control.add(ni);
		control.add(san);
		control.add(shi);
		control.add(go);
		control.add(roku);
		control.add(shichi);
		control.add(hachi);
		control.add(kyuu);
		control.add(zero);
		control.add(space);
		control.add(add);
		control.add(sub);
		control.add(multi);
		control.add(div);
		control.add(equals);

		control.add(clear);
		this.setContentPane(control);
	}

	private void setColor(){
		control.setBackground(Color.black);
		Color back = new Color(235, 169, 27);
		ichi.setBackground(back);
		ni.setBackground(back); 
		san.setBackground(back);
		shi.setBackground(back); 
		go.setBackground(back); 
		roku.setBackground(back); 
		shichi.setBackground(back); 
		hachi.setBackground(back);
		kyuu.setBackground(back);
		zero.setBackground(back);
		add.setBackground(back); 
		sub.setBackground(back);
		multi.setBackground(back); 
		div.setBackground(back); 
		equals.setBackground(back);
		clear.setBackground(back); 
		space.setBackground(back);
	}

	private void initializeButtons(){
		ichi = new JButton("1");
		ni= new JButton("2");
		san= new JButton("3");
		shi= new JButton("4");
		go= new JButton("5");
		roku= new JButton("6");
		shichi =new JButton("7");
		hachi =new JButton("8");
		kyuu =new JButton("9");
		zero =new JButton("0");
		add =new JButton("+");
		sub =new JButton("-");
		multi= new JButton("*");
		div =new JButton("/");
		equals=new JButton("=");
		clear=new JButton("C");
		space=new JButton("_");

		Dimension d =  new Dimension(75, 25);
		ichi.setPreferredSize(d);
		ni.setPreferredSize(d);
		san.setPreferredSize(d); 
		shi.setPreferredSize(d); 
		go.setPreferredSize(d); 
		roku.setPreferredSize(d); 
		shichi.setPreferredSize(d); 
		hachi.setPreferredSize(d); 
		kyuu.setPreferredSize(d); 
		zero.setPreferredSize(d); 
		add.setPreferredSize(new Dimension(225, 25)); 
		sub.setPreferredSize(new Dimension(225, 25));
		multi.setPreferredSize(new Dimension(225, 25)); 
		div.setPreferredSize(new Dimension(225, 25)); 
		equals.setPreferredSize(new Dimension(100, 50)); 
		clear.setPreferredSize(new Dimension(100, 50));
		space.setPreferredSize(new Dimension(150, 25));

	}

	class Number implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton source = (JButton) event.getSource();

			if(!equalsChosen){
				textField.setText(temp1);
			}

			if(source.equals(ichi)){
				if(temp1 == null){
					temp1 = "1";
					temp2 = "1";
				}
				else{
					temp1 += "1";
					temp2 += "1";
				}
				errorText.setText("");
				spacePressed = false;
			}
			if(source.equals(ni)){
				if(temp1 == null){
					temp1 = "2";
					temp2 = "2";
				}
				else{
					temp1 += "2";
					temp2 += "2";
				}
				errorText.setText("");
				spacePressed = false;
			}
			if(source.equals(san)){
				if(temp1 == null){
					temp1 = "3";
					temp2 = "3";
				}
				else{
					temp1 += "3";
					temp2 += "3";
				}
				errorText.setText("");
				spacePressed = false;
			}
			if(source.equals(shi)){
				if(temp1 == null){
					temp1 = "4";
					temp2 = "4";
				}
				else{
					temp1 += "4";
					temp2 += "4";
				}
				errorText.setText("");
				spacePressed = false;
			}
			if(source.equals(go)){
				if(temp1 == null){
					temp1 = "5";
					temp2 = "5";
				}
				else{
					temp1 += "5";
					temp2 += "5";
				}
				errorText.setText("");
				spacePressed = false;
			}
			if(source.equals(roku)){
				if(temp1 == null){
					temp1 = "6";
					temp2 = "6";
				}
				else{
					temp1 += "6";
					temp2 += "6";
				}
				errorText.setText("");
				spacePressed = false;
			}

			if(source.equals(shichi)){
				if(temp1 == null){
					temp1 = "7";
					temp2 = "7";
				}
				else{
					temp1 += "7";
					temp2 += "7";
				}
				errorText.setText("");
				spacePressed = false;
			}

			if(source.equals(hachi)){
				if(temp1 == null){
					temp1 = "8";
					temp2 = "8";
				}
				else{
					temp1 += "8";
					temp2 += "8";
				}
				errorText.setText("");
				spacePressed = false;
			}

			if(source.equals(kyuu)){
				if(temp1 == null){
					temp1 = "9";
					temp2 = "9";
				}
				else{
					temp1 += "9";
					temp2 += "9";
				}
				errorText.setText("");
				spacePressed = false;
			}
			if(source.equals(zero)){
				if(temp1 == null){
					temp1 = "0";
					temp2 = "0";
				}
				else{
					temp1 += "0";
					temp2 += "0";
				}
				errorText.setText("");
				spacePressed = false;
			}

			if(source.equals(space)){
				if(!spacePressed && !temp2.equals("")){
					stack.push(temp2);
					temp1 += " ";
					temp2 = "";
					spacePressed = true;
					errorText.setText("Space Pressed");
				}
			}

			if(source.equals(clear)){
				temp1 = "";
				temp2 = "";
				stack.clear();
				errorText.setText("");
				spacePressed = false;
			}

			if(source.equals(add)){
				if(stack.size() % 2 == 0 && stack.size() != 0){
					temp1 += " + ";
					double num2 = Double.valueOf(stack.pop());
					double num1 = Double.valueOf(stack.pop());
					answer = num1 + num2;
					stack.push(String.valueOf(answer));
					errorText.setText("");
					spacePressed = false;
				}
				else{
					if(stack.size() <= 1)
					{
						errorText.setText("Not enough numbers");
					}
					else{
						errorText.setText("Space has not been pressed");
					}
				}
			}
			if(source.equals(sub)){
				if(stack.size() % 2 == 0 && stack.size() != 0){
					temp1 += " - ";
					double num2 = Double.valueOf(stack.pop());
					double num1 = Double.valueOf(stack.pop());
					answer = num1 - num2;
					stack.push(String.valueOf(answer));
					errorText.setText("");
					spacePressed = false;
				}
				else{

					if(stack.size() <= 1)
					{
						errorText.setText("Not enough numbers");
					}
					else{
						errorText.setText("Space has not been pressed");
					}
				}
			}
			if(source.equals(multi)){
				if(stack.size() % 2 == 0 && stack.size() != 0){
					temp1 += " * ";
					double num2 = Double.valueOf(stack.pop());
					double num1 = Double.valueOf(stack.pop());
					answer = num1 * num2;
					stack.push(String.valueOf(answer));
					errorText.setText("");
					spacePressed = false;
				}
				else{

					if(stack.size() <= 1)
					{
						errorText.setText("Not enough numbers");
					}
					else{
						errorText.setText("Space has not been pressed");
					}
				}
			}
			if(source.equals(div)){
				if(stack.size() % 2 == 0 && stack.size() != 0){
					temp1 += " / ";
					double num2 = Double.valueOf(stack.pop());
					double num1 = Double.valueOf(stack.pop());
					answer = num1 / num2;
					stack.push(String.valueOf(answer));
					errorText.setText("");
					spacePressed = false;
				}
				else{

					if(stack.size() <= 1)
					{
						errorText.setText("Not enough numbers");
					}
					else{
						errorText.setText("Space has not been pressed");
					}
				}
			}
			textField.setText(temp1);
			System.out.println("_Stack_");
			for(String x: stack){
				System.out.println(x);
			}
			System.out.println("_Stack_");
			System.out.println( "temp1: "+ temp1);
		}
	}
	class Equals implements ActionListener{
		public void actionPerformed(ActionEvent event){

			if(stack.isEmpty()){
				textField.setText("Empty Field");
				System.out.println("Empty");
			}
			else{
				textField.setText(stack.peek());
				spacePressed = false;;
			}
			
		}
	}

}
