public class Cone extends Circle
{
	private double height;

	public Cone (String material,double thickness, double radius, double h)
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
		double sideOfCone=Math.sqrt((Math.pow(getRadius(), 2))+(Math.pow(height, 2)));
		return (Math.PI*getRadius()*sideOfCone+findArea());
	}

	public double findInnerVolume()
	{
		double x = (height*getThickness())/getRadius();
		double y = Math.sqrt(Math.pow(x, 2)+Math.pow(getThickness(),2));
		double innerHeightOfCone=height-getThickness()-y;

		double innerRadiusOfCone = (innerHeightOfCone*getRadius())/height;
		double innerAreaOfCone = Math.pow(innerRadiusOfCone, 2)*Math.PI;

		return (innerAreaOfCone*innerHeightOfCone)/3;
	}

	public double findVolume()
	{
		return (findArea()*height)/3;
	}

	public double findWeight()
	{
		return getMaterialWeight()*(findVolume()-findInnerVolume());
	}

	public String toString()
	{
		return "\nCreated a Cone with the following attributes:\nMaterial: "+ getMaterialName()+" \nThickness of: " + getThickness() + "dm\nRadius of: " + getRadius() +"dm\nHeight of: "+height+"dm\nVolume of: "+findVolume()+  "dm^3\nWeight of: " + findWeight()+"kg";
	}

}