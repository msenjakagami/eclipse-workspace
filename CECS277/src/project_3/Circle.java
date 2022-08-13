package project_3;

public class Circle extends Shape implements Moveable {

	protected double radius;
	/**
	 * default constructor
	 */
	public Circle(){
		super();
		radius = 1;
	}
	/**
	 * overloaded constructor
	 * @param r radius
	 */
	public Circle(double r)
	{
		super();
		radius = r;
	}
	/**
	 * overloaded constructor
	 * @param color
	 */
	public Circle(String color) {
		super(color);
		radius = 1;
	}
	/**
	 * accessor 
	 * @return radius
	 */
	public double getRadius(){
		return radius;
	}
	/**
	 * mutator
	 * @param r radius
	 */
	public void setRadius(double r){
		radius = r;
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
		String x = "Circle of color " + getColor();
		String y = "\n at " + getCenter().toString();
		String z = "\n with Radius: " + radius;
		return x + y + z;			
	}

	/**
	 * accessor
	 * @return surface area
	 */
	@Override
	public double getSurface() {
		return radius * radius * Math.PI;
	}

	/**
	 * Accessor method
	 * @return volume 
	 */
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
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
