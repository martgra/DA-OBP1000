public class Sphere extends Circle
{
	private double height;

	public Sphere (String material, double thickness, double radius)
	{
		super(material, thickness, radius);
	}

	public double findSurfaceArea()
	{
		return 4*findArea();
	}

	public double findInnerVolume()
	{
		double innerRadiusOfSphere = getRadius()-getThickness();
		return (4*Math.PI*(Math.pow(innerRadiusOfSphere, 3))/3);
	}

	public double findVolume()
	{
		return 4*Math.PI*(Math.pow(getRadius(), 3))/3;
	}

	public double findWeight()
	{
	return getMaterialWeight()*(findVolume()-findInnerVolume());
	}

	public String toString()
	{
		return "\nCreated a Sphere with the following attributes:\nMaterial: "+ getMaterialName()+" \nThickness of: " + getThickness() + "dm\nRadius of: " + getRadius() +"dm\nVolume of: "+findVolume()+  "dm^3\nWeight of: " + findWeight()+"kg";
	}

}