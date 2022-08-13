package project_3;

public class Square extends Shape implements Moveable {

	protected double side;

	/**
	 * default constructor
	 */
	public Square() {
		super();
		side = 1;
	}

	/**
	 * overloaded constructor
	 * @param color
	 */
	public Square(String color) {
		super(color);
		side = 1;
	}

	/**
	 * overloaded constructor
	 * @param s side
	 */
	public Square(double s) {
		super();
		side = s;
	}

	/**
	 * Mutator
	 * @param s side
	 */
	public void setSide(double s){
		side = s;
	}

	/**
	 * Accessor
	 * @return side
	 */
	public double getSide(){
		return side;
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

	@Override
	public String toString() 
	{
		String x = "Square of color " + getColor();
		String y = "\nat " + getCenter().toString();
		String z = "\nwith Side length: " + side;
		return x + y + z;			
	}

	/**
	 * Accessor
	 * @return surface area
	 */
	@Override
	public double getSurface() {
		return side * side;
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
