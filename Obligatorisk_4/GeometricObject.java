public abstract class GeometricObject
{
	private String material;
	private double thickness;

	public GeometricObject(String m, double t)
	{
		material = m;
		thickness = t;
	}

	void setMaterial(String newMaterial)
	{
		material=newMaterial;
	}

	public String getMaterialName()
	{
			return material;
	}

	public double getMaterialWeight()
	{
		double weight;

		if (material.equals("aluminum"))
			weight=2.7;
		else if (material.equals("iron"))
			weight=7.8;
		else if (material.equals("copper"))
			weight=8.9;
		else if (material.equals("tin"))
			weight=7.3;
		else
			weight=0;

		return weight;
	}

	void setThickness(double newThickness)
	{
		thickness=newThickness;
	}

	public double getThickness()
	{
		return thickness;
	}

	public abstract double findArea();

	public abstract double findInnerArea();

	public abstract double findCircumference();

	public abstract double findSurfaceArea();

	public abstract double findVolume();

	public abstract double findInnerVolume();

	public abstract double findWeight();

	public abstract String toString();

}