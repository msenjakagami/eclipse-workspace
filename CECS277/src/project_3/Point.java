package project_3;

public class Point
{// Private member variables
	private int x;
	private int y;   
	public Point(int x, int y) 
	{
		this.x = x;
		this.y = y;}
	public Point() {    // default(no-arg) constructor
		x = 0;
		y = 0;
	}
	
	public int getX() { return x; }
	public void setX(int x) { this.x = x; }
	public int getY() { return y;}
	public void setY(int y) { this.y = y; }
	public String toString() { return "(" + x + "," + y + ")"; }
}