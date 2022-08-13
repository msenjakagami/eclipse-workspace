package project_3;

public class Cube extends Square{
	/**
	 * default constructor
	 */
	public Cube() {
		super();
		Point3D d3 = new Point3D();
		setCenter(d3);
	}
/**
 * overloaded constructor
 * @param s side
 */
	public Cube(double s) {
		super(s);
		Point3D d3 = new Point3D();
		setCenter(d3);
	}
	/**
	 * toString method
	 * @return
	 */
	@Override
	public String toString()
	{
		String x = "Cube of color " + getColor();
		String y = "\nat " + getCenter().toString();
		String z = "\nwith Sides of length and width: " + side;
		return x + y + z;			
	}
	/**
	 * accessor
	 * @return surface area
	 */
	@Override
	public double getSurface() {
		return 6 * super.getSurface();
	}
	/**
	 * accessor
	 * @return volume
	 */
	@Override
	public double getVolume() {
		return super.getSurface() * side;
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
			Cube x = (Cube) obj;
			return x.getSurface() == this.getSurface() && x.getColor().equals(this.getColor()) && this.getVolume() == x.getVolume();
		}
	}
	
}
