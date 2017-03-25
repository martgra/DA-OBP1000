public class Box extends Rectangle
{
	private double height;
	public Box (String material,double thickness, double width, double length, double h)
	{
		super(material, thickness, width, length);
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
			return 2*findArea()+2*(getLength()*height)+2*(getWidth()*height);
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
		return "\nCreated a Box with the following attributes:\nMaterial: "+ getMaterialName()+" \nThickness of: " + getThickness() + "dm\nWidth of: " + getWidth() +"dm\nLength of: " + getLength() +"dm\nHeight of: " + height +"dm\nVolume of: "+findVolume()+  "dm^3\nWeight of: " + findWeight()+"kg";
	}

}