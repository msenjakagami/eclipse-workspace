package project_7;

public class Country implements Measurable<Country>
{
	private String name;
	private double area;
	public Country(String aName, double anArea)
	{
		name = aName;
		area = anArea;
	}
	public String getName() { return name; }
	public double getArea() { return area; }
	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		return area;
	}

}
