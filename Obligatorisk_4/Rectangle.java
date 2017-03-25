public abstract class Rectangle extends GeometricObject
{
	private double length, width;
	public Rectangle (String material,double thickness, double wi, double l)
	{
		super(material, thickness);
		length=l;
		width=wi;

	}


	void setLength(double newLength)
	{
		length=newLength;
	}

	public double getLength()
	{
		return length;
	}

	void setWidth(double newWidth)
	{
		width=newWidth;
	}

	public double getWidth()
	{
		return width;
	}

	public double findArea()
	{
		return length*width;
	}

	public double findInnerArea()
	{
		double innerWidth=width-(2*getThickness());
		double innerLength=length-(2*getThickness());
		return innerWidth*innerLength;
	}

	public double findCircumference()
	{
		return 2*length+2*width;
	}
}
