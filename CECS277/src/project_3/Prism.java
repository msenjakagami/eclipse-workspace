package project_3;

public class Prism extends Rectangle{

	private double height;

	public Prism() {
		super();
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = 1;
	}

	public Prism(double h){
		super();
		Point3D d3 = new Point3D();
		setCenter(d3);
		height = h;
	}
	public Prism(double w, double l) {
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
		String x = "Prism of color " + getColor();
		String y = "\nat " + getCenter().toString();
		String z = "\nwith Length: " + length + ", Width: "+ width  + ", & Height: " + height;
		return x + y + z;			
	}

	@Override
	public double getSurface() {
		return  2 * (super.getSurface() + length * height + width * height);
	}

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
			Prism x = (Prism) obj;
			return x.getSurface() == this.getSurface() && x.getColor().equals(this.getColor()) && this.getVolume() == x.getVolume();
		}
	}
}

