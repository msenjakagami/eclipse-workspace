package edu.homework_4;
/**
 * Object that holds a task and its priority to be used in a priority queue
 * @author Gabriel
 *
 */
public class TaskOrder implements Comparable<Object>{

	private int priority;
	private String task;
	/**
	 * constructor, takes in arguments for the task and the priority
	 * @param p the priority value
	 * @param t the task
	 */
	public TaskOrder(int p, String t){
		priority = p;
		task = t;
	}
	/**
	 * accessor method returns the priority value
	 * @return priority
	 */
	public int getPriority(){
		return priority;
	}
	/**
	 * accessor method returns the task
	 * @return task
	 */
	public String getTask(){
		return task;
	}
	/**
	 * interface compares objects to one another by their priority values
	 */
	public int compareTo(Object otherObject){
		TaskOrder otherTask = (TaskOrder) otherObject;
		if(this.priority < otherTask.priority){
			return -1;
		}
		else if(this.priority == otherTask.priority){
			return 0;
		}
		else{
			return 1;
			}
	}
}
