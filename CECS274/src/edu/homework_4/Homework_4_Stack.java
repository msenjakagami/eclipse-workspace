package edu.homework_4;
import java.util.Stack;
import java.util.Scanner;

public class Homework_4_Stack {
	public static void main(String args[]){
		pt1Tester();
	}
	public static void pt1Tester(){
		Scanner in = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		System.out.print("Enter a number \n>>");
		String num = in.next();
		int len = num.length();
		for(int i = 0; i < num.length(); i++){
			s.push(num.charAt(len - 1));
			len--;
		}
		
		while(s.size() > 0){
			System.out.print(" |" + s.pop() + "| ");

		}
		in.close();
	}
}
