package project_3;

public abstract class Shape {
	private String color;
	private Point center;
	
	/**
	 * default constructor
	 */
	public Shape()
	{
		color = "Blue";
		center = new Point(0,0);
	}
	/**
	 * overloaded constructor
	 * @param color
	 */
	public Shape (String color) 
	{
		this.color = color;
		center = new Point(0,0);
	}
	/**
	 * overloaded constructor
	 * @param color 
	 * @param x coordinate
	 * @param y coordinate
	 */
	public Shape (String color, int x, int y) 
	{
		this.color = color;
		center = new Point(x,y);
	}
	/**
	 * mutator
	 * @param c color
	 */
	public void setColor(String c){
		color = c;
	}
	/**
	 * accessor
	 * @return color
	 */
	public String getColor(){
		return color;
	}
	/**
	 * accssor
	 * @return center coordinate
	 */
	public Point getCenter(){
		return center;
	}
	/**
	 * mutator
	 * @param  c coordinate
	 */
	public void setCenter(Point c){
		center = c;
	}
	/**
	 * toString
	 */
	@Override
	public String toString() {return "Shape of color=\"" + color + "\"" + " at " + center.toString();}
	/**
	 * accessor 
	 * @return surface area
	 */
	abstract public double getSurface();
	/**
	 * accessor 
	 * @return volume
	 */
	abstract public double getVolume();

}
