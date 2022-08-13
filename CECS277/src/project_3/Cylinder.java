package project_3;

public class Cylinder extends Circle{

	private double height;
/**
 * Default Constructor
 */
	public Cylinder(){
		super();
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = 1;
	}
	/**
	 * overloaded constructor
	 * @param h height
	 */
	public Cylinder(double h){
		super();
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = h;
	}

	/**
	 * overloaded constructor
	 * @param r radius
	 * @param h height
	 */
	public Cylinder(double r, double h){
		super(r);
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = h;
	}
	
	/**
	 * mutator
	 * @param h height
	 */
	public void setHeight(double h){
		height = h;
	}
/**
 * accesor
 * @return height
 */
	public double getHeight(){
		return height;
	}
/**
 * toString method
 */
	@Override
	public String toString()
	{
		String x = "Cylinder of color " + getColor();
		String y = "\nat " + getCenter().toString();
		String z = "\nwith Radius: " + radius + " & Height: " + height;
		return x + y + z;			
	}
	/**
	 * accessor method
	 * @return surface area
	 */
	@Override
	public double getSurface() {
		return  (2 * Math.PI * radius * height) + (2 * super.getSurface());
	}

	/**
	 * accessor method
	 * @return volume
	 */
	@Override
	public double getVolume() {
		return super.getSurface() * height;
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
			Cylinder x = (Cylinder) obj;
			return x.getSurface() == this.getSurface() && x.getColor().equals(this.getColor()) && this.getVolume() == x.getVolume();
		}
	}
}
