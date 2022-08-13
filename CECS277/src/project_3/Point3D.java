package project_3;

public class Point3D extends Point {

	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		// TODO Auto-generated constructor stub
	}

	public Point3D() {
		super();
		z = 0;
		// TODO Auto-generated constructor stub
	}
	
	public int getZ() { return z;}
	public void setZ(int z) { this.z = z; }
	@Override
	public String toString() { return "(" + super.getX() + "," + super.getY()  + "," + z + ")"; }

}
