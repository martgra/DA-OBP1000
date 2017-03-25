public class Cylinder extends Circle
{
	private double height;

	public Cylinder (String material, double thickness, double radius, double h)
	{
		super(material,thickness, radius);
		height=h;
	}

	void setHeight(double newHeight)
	{
			height=newHeight;
	}

	public double getHeight()
	{
		return height;
	}

	public double findSurfaceArea()
	{
		return (2*findArea())+(findCircumference()*height);
	}

	public double findVolume()
	{
		return findArea()*height;
	}

	public double findInnerVolume()
	{
		double innerHeight = height-(2*getThickness());
		return findInnerArea()*innerHeight;
	}

	public double findWeight()
	{
		return getMaterialWeight()*(findVolume()-findInnerVolume());
	}

	public String toString()
	{
		return "\nCreated a Cylinder with the following attributes:\nMaterial: "+ getMaterialName()+" \nThickness of: " + getThickness() + "dm\nRadius of: " + getRadius() +"dm\nHeight of: "+getHeight()+"dm\nVolume of: "+findVolume()+  "dm^3\nWeight of: " + findWeight()+"kg";
	}

}