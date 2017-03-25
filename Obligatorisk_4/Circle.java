public abstract class Circle extends GeometricObject
{
	private double radius;
	public Circle (String material,double thickness, double r)
	{
		super(material, thickness);
		radius=r;

	}

	void setRadius(double newRadius)
	{
		radius=newRadius;
	}

	public double getRadius()
	{
		return radius;
	}

	public double findArea()
	{
		return Math.pow(radius, 2)*Math.PI;
	}

	public double findInnerArea()
	{
		double innerRadius = radius-getThickness();
		return Math.pow(innerRadius, 2);
	}

	public double findCircumference()
	{
		return 2*radius*Math.PI;
	}

}

