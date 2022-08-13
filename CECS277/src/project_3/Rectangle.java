package project_3;

public class Rectangle extends Shape implements Moveable {

	protected double length;
	protected double width;

	/**
	 * default constructor
	 */
	public Rectangle() {
		super();
		width = 1;
		length = 1;
	}

	/**
	 * overloaded constructor
	 * @param w width
	 * @param l length
	 */
	public Rectangle(double w, double l) {
		super();
		width = w;
		length = l;
	}

	/**
	 * overloade constructor
	 * @param color
	 */
	public Rectangle(String color) {
		super(color);
		width = 1;
		length = 1;
	}
	/**
	 * mutator
	 * @param w width
	 */
	public void setWidth(double w){
		width = w;
	}
	/**
	 * mutator
	 * @param l length
	 */
	public void setLength(double l){
		length = l;
	}
	/**
	 * accessor
	 * @return width
	 */
	public double getWidth(){
		return width;
	}
	/**
	 * accessor
	 * @return length
	 */
	public double getLength(){
		return length;
	}

	/**
	 * mutator moves point right
	 * @param a amount to move
	 */
	@Override
	public void right(int a) {
		Point temp = super.getCenter();
		temp.setX(temp.getX() + a);
		super.setCenter(temp);
	}
	/**
	 * mutator moves point left
	 * @param a amount to move
	 */
	@Override
	public void left(int a) {
		Point temp = super.getCenter();
		temp.setX(temp.getX() - a);
		super.setCenter(temp);
	}

	/**
	 * mutator moves point up
	 * @param a amount to move
	 */
	@Override
	public void up(int a) {
		Point temp = super.getCenter();
		temp.setY(temp.getY() + a);
		super.setCenter(temp);
	}

	/**
	 * mutator moves point down
	 * @param a amount to move
	 */
	@Override
	public void down(int a) {
		Point temp = super.getCenter();
		temp.setY(temp.getY() - a);
		super.setCenter(temp);	
	}	

	/**
	 * to string method
	 */
	@Override
	public String toString() 
	{
		String x = "Rectangle of color " + getColor();
		String y = "\nat " + getCenter().toString();
		String z = "\nwith Length: " + length + " & Width: " + width;
		return x + y + z;			
	}
	/**
	 * accessor
	 * @return surface area
	 */
	@Override
	public double getSurface() {
		return length * width;
	}

	/**
	 * Accessor method
	 * @return volume 
	 */
	@Override
	public double getVolume() {
		System.out.println("Error. Volume cannot be calculated");
		return 0;
	}

	/**
	 * equals method
	 * @param obj explicit
	 * @return if objects are the same
	 */
	@Override
	public boolean equals(Object obj){

		if(this == obj){return true;}
		else if(obj == null||obj.getClass() != this.getClass()){
			return false;
		}
		else{
			Square x = (Square) obj;
			return x.getSurface() == this.getSurface() && x.getColor().equals(this.getColor());
		}
	}
}
