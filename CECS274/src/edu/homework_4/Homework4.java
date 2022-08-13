package edu.homework_4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.InputMismatchException;
import edu.project_2.Contact;
/**
 * Homework 4
 * @author Gabriel 014487796
 * @version 1.0
 * @since 11/9/15
 */
public class Homework4 {
	
	private static PriorityQueue<TaskOrder> todoList = new PriorityQueue<TaskOrder>();
	
	public static void main(String args[]){
		System.out.println("Part 1:");
		pt1();
		System.out.println("Part 2: ");
		pt2();
		System.out.println("Part 3: ");
		pt3();
	}
	
	public static void pt1(){
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
		System.out.println();
		
	}

	public static void pt2(){
		Scanner in = new Scanner(System.in);
		boolean run = false;

		while(!run){
			in = new Scanner(System.in);
			System.out.print("1. Add task\n2. Next task\n3. Quit\n>>");
			int choice = in.nextInt();
			if(choice == 1){
				addTask();
			}
			else if(choice == 2){
				if(!todoList.isEmpty()){
					TaskOrder next = todoList.peek();
					System.out.println(next.getPriority() + ". " + next.getTask() + "\n");
					todoList.remove();
				}
				else{
					System.out.println("To-do-list is empty");
					System.out.println();
				}
			}
			else if(choice == 3){
				run = true;
				System.out.println("Bye!");
			}
			else{
				run = false;
			}
		}

	}
	public static void addTask(){
		Scanner in = new Scanner(System.in);
		boolean prior = false;
		int priority = 1;
		String task = "";
		while(!prior){
			boolean error = true;
			do{
				try{
					System.out.print("Enter the priority of the task\n>>");
					priority = in.nextInt();
					error = false;
				}
				catch(InputMismatchException e){
					System.out.println("Not a number");
					in.nextLine();
				}
			}while(error);
			in.nextLine();
			if(priority <= 9 && priority >= 1){
				System.out.print("Enter the task\n>>");
				task = in.nextLine();
				prior = true;
			}
			else{
				System.out.println("Invalid priority");
			}
		}
		todoList.add(new TaskOrder(priority, task));
	}

	public static void pt3(){
		Scanner in = new Scanner(System.in);
		
		Contact zak = new Contact("zak", "562");
		Contact marc = new Contact("marc","274");
		Contact cas = new Contact("cas", "124");
		Contact adri = new Contact("adri", "098");
		Contact nia = new Contact("nia", "124");
		Contact rico = new Contact("rico", "212");
		
		LinkedList<Contact> contacts = new LinkedList<Contact>();
		
		contacts.add(zak);
		contacts.add(marc);
		contacts.add(cas);
		contacts.add(adri);
		contacts.add(nia);
		contacts.add(rico);
		
		int ind = 1;
		for(Contact i: contacts){
			System.out.println(ind + ". " + i.getName());
			ind++;
		}
		System.out.println();
		
		System.out.print("Enter a number to remove\n>>");
		int n = in.nextInt();
		downsize(contacts, n);
		System.out.println();
		ind = 1;
		for(Contact i: contacts){
			System.out.println(ind + ". "  + i.getName());
			ind++;
		}
		
	}
	public static void downsize(LinkedList<Contact> contacts, int n){
		ListIterator<Contact> iter = contacts.listIterator();
		for(int i = 1; i <= contacts.size(); i++){
			iter.next();
			if(i == n){
				iter.remove();
			}
		}
	}
}
