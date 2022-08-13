package project_3;

public class Pyramid extends Rectangle{

	private double height;
	
	public Pyramid() {
		super();
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = 1;
	}

	public Pyramid(double h) {
		super();
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = h;
	}
	
	public Pyramid(double w, double l) {
		super(w, l);
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = 1;
	}

	/**
	 * Mutator method
	 * @param h height 
	 */
	public void setHeight(double h){
		height = h;
	}
	/**
	 * Accessor method
	 * @return height 
	 */
	public double getHeight(){
		return height;
	}

	@Override
	public String toString()
	{
		String x = "Pyramid of color " + getColor();
		String y = "\nat " + getCenter().toString();
		String z = "\nwith Length: " + length + ", Width: "+ width  + ", & Height: " + height;
		return x + y + z;			
	}

	/**
	 * Accessor method
	 * @return surface area 
	 */
	@Override
	public double getSurface() {
		return super.getSurface() + length* Math.sqrt((width/2)*(width/2) + height * height) + width * Math.sqrt((length/2)*(length/2) + height * height);
	}

	/**
	 * Accessor method
	 * @return volume 
	 */
	@Override
	public double getVolume() {
		return (super.getSurface() * height)/3;
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
			Pyramid x = (Pyramid) obj;
			return x.getSurface() == this.getSurface() && x.getColor().equals(this.getColor()) && this.getVolume() == x.getVolume();
		}
	}

}
