package project_3;

public class Cone extends Circle{

	private double height;
	/**
	 * default constructor
	 */
	public Cone() {
		super();
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = 1;
	}
/**
 * overloaded constructor
 * @param h height
 */
	public Cone(double h) {
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
	public Cone(double r, double h){
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
	 * accessor
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
		return super.getSurface()/radius * (radius + Math.sqrt((height * height) + (radius * radius)));
	}
	/**
	 * accessor method
	 * @return volume
	 */
	@Override
	public double getVolume() {
		return super.getSurface() * (height/3);
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
			Cone x = (Cone) obj;
			return x.getSurface() == this.getSurface() && x.getColor().equals(this.getColor()) && this.getVolume() == x.getVolume();
		}
	}
}
