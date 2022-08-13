package edu.homework_4;

import java.util.PriorityQueue;
import java.util.Scanner;
public class Homework_4_PriorityQueue {

	static PriorityQueue<TaskOrder> todoList = new PriorityQueue<TaskOrder>();
	static Scanner in = new Scanner(System.in);

	public static void main(String args[]){
		pt2Tester();
	}

	public static void pt2Tester(){
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
		boolean prior = false;
		int priority = 1;
		String task = "";
		while(!prior){
			System.out.print("Enter the priority of the task\n>>");
			priority = in.nextInt();
			if(priority <= 9 && priority >= 1){
				in = new Scanner(System.in);
				System.out.print("Enter the task\n>>");
				task = in.nextLine();
				prior = true;
			}
		}
		todoList.add(new TaskOrder(priority, task));
	}
}
