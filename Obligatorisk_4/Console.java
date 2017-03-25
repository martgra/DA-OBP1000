import java.util.Scanner;
import java.lang.Math;
public  class Console
{
	public static void main(String []args)
	{
		String coneMaterial="0", cylinderMaterial="0", sphereMaterial="0", boxMaterial="0", selector="y";
		double sphereRadius=0, coneRadius=0, cylinderRadius=0, coneHeight=0, cylinderHeight=0, boxWidth=0, boxLength=0, boxHeight=0, sphereThickness=0, coneThickness=0, cylinderThickness=0, boxThickness=0;
		int i=0;
		Scanner input = new Scanner (System.in);

		while (selector.equals("y"))
		{
			System.out.println("Do you want to create a cone?\nPress y for yes and n for no");
			selector = input.next();

			while (selector.equals("y"))
			{
				System.out.println("Enter one of the following materials to create your cone of\naluminum\niron\ncopper\ntin");
				coneMaterial = input.next();
				System.out.println("Enter the radius of the cone in decimeters");
				coneRadius = input.nextDouble();
				System.out.println("Enter the height of the cone in decimeters");
				coneHeight = input.nextDouble();
				double warning=findMaxThicknessCone(coneHeight, coneRadius);
				System.out.println("Enter the thickness of the cone in decimeters");
				coneThickness = input.nextDouble();

				i=0;




				System.out.println("You have created a cone with attributes:\n\nMaterial: "+coneMaterial+"\nRadius of " +coneRadius+"dm\nHeight of: "+coneHeight+"dm\nThickness of "+coneThickness+"dm\n\nAre you happy with your cone?\nYou can create a new cone by pressing y or continue by pressing n");
				selector = input.next();


			}

			System.out.println("Do you want to create a sphere?\nPress y for yes and n for no");
			selector = input.next();

			while (selector.equals("y"))
			{
				System.out.println("Enter one of the following materials to create your sphere of\naluminum\niron\ncopper\ntin");
				sphereMaterial = input.next();
				System.out.println("Enter the radius of the sphere in decimeters");
				sphereRadius = input.nextDouble();
				System.out.println("Enter the thickness of the sphere in decimeters\nWARNING The thickness of cylinder can not exceed "+sphereRadius+"dm");
				while (i < 1)
				{
					sphereThickness = input.nextDouble();
					if (sphereThickness > sphereRadius)
						{
						System.out.println("The thickness entered exceeds "+sphereRadius+"dm. Please enter a new thickness");
							i=0;
						}
					else
						i=1;
				}
				i=0;
				System.out.println("You have created a sphere with attributes:\n\nMaterial: "+sphereMaterial+"\nRadius of " +sphereRadius+"dm\nThickness of "+sphereThickness+"dm\n\nAre you happy with your sphere?\nYou can create a new sphere by pressing y or continue by pressing n");
				selector = input.next();
			}



			System.out.println("Do you want to create a cylinder?\nPress y for yes and n for no");
			selector = input.next();

			while (selector.equals("y"))
			{
				System.out.println("Enter one of the following materials to create your cylinder of\naluminum\niron\ncopper\ntin");
				cylinderMaterial = input.next();
				System.out.println("Enter the radius of the cylinder in decimeters");
				cylinderRadius = input.nextDouble();
				System.out.println("Enter the height of the cone in decimeters");
				cylinderHeight = input.nextDouble();
				double cylinderMassiveHeight = cylinderHeight/2;
				double warning = Math.min(cylinderRadius, cylinderMassiveHeight);
				System.out.println("Enter the thickness of the sphere in decimeters\nWARNING The thickness of cylinder can not exceed "+warning+"dm" );

				while (i < 1)
				{
					cylinderThickness = input.nextDouble();
					if (cylinderThickness > warning)
						{
							System.out.println("The thickness entered exceeds "+warning+"dm. Please enter a new thickness" );
							i=0;
						}
					else
						i=1;
				}
				i=0;

				System.out.println("You have created a cylinder with attributes:\n\nMaterial: "+cylinderMaterial+"\nRadius of " +cylinderRadius+"dm\nHeight of: "+cylinderHeight+"dm\nThickness of "+cylinderThickness+"dm\n\nAre you happy with your cylinder?\nYou can create a new box by pressing y or continue by pressing n");
				selector = input.next();
			}


			System.out.println("Do you want to create a box?\nPress y for yes and n for no");
			selector = input.next();

			while (selector.equals("y"))
			{
				System.out.println("Enter one of the following materials to create your box of\naluminum\niron\ncopper\ntin");
				boxMaterial = input.next();
				System.out.println("Enter the width of the box in decimeters");
				boxWidth = input.nextDouble();
				System.out.println("Enter the length of the box in decimeters");
				boxLength = input.nextDouble();
				System.out.println("Enter the height of the box in decimeters");
				boxHeight = input.nextDouble();
				double warning = findMaxThicknessBox(boxHeight, boxWidth, boxLength);
				System.out.println("Enter the thickness of the box in decimeters\nWARNING The thickness of box can not exceed "+warning+"dm");

				while (i < 1)
				{
					boxThickness = input.nextDouble();
					if (boxThickness > warning)
					{
						System.out.println("The thickness entered exceeds "+warning+"dm. Please enter a new thickness" );
						i=0;
					}
					else
						i=1;
				}



				System.out.println("You have created a box with attributes:\n\nMaterial: "+boxMaterial+"\nwidth of " +boxWidth+"dm\nLength of: "+boxLength+"dm\nThickness of "+boxThickness+"dm\n\nAre you happy with your box?\nYou can create a new box by pressing y or continue by pressing n");
				selector = input.next();
			}



		Cone cone = new Cone(coneMaterial, coneThickness, coneRadius, coneHeight);
		Sphere sphere = new Sphere(sphereMaterial, sphereThickness, sphereRadius);
		Box box = new Box(boxMaterial, boxThickness, boxWidth, boxLength, boxHeight);
		Cylinder cylinder = new Cylinder(cylinderMaterial, cylinderThickness, cylinderRadius,cylinderHeight);
		if (cone.getRadius()>0)
			System.out.println("\nWe have calculated the following attributes of your cone" +cone.toString()+"\n");
		if (sphere.getRadius()>0)
			System.out.println("\nWe have calculated the following attributes of your sphere"+sphere.toString()+"\n");
		if (cylinder.getRadius()>0)
			System.out.println("\nWe have calculated the following attributes of your cylinder"+cylinder.toString()+"\n");
		if (box.getWidth()>0)
			System.out.println("\nWe have calculated the following attributes of your box"+box.toString()+"\n");

		}
	}
public static double findMaxThicknessCone(double Height, double Radius)
{
	double warning;
	double tempThickness=2;
	double x = (Height*tempThickness)/Radius;
	double y = Math.sqrt(Math.pow(x, 2)+Math.pow(2,2));
	double forholdMellomXOGY = y/tempThickness;
	double maxHoyde = forholdMellomXOGY*Height;
	double indrehoyde=Height-tempThickness-y;
	double litenRadius=(indrehoyde*Radius)/Radius;
	double tykkelseRadius=Radius-litenRadius;
	double forholdMellomTykkelseogtykkeleRadius=tykkelseRadius/tempThickness;
	double maxRadius = Radius/forholdMellomTykkelseogtykkeleRadius;
	return warning = Math.min(maxRadius, maxHoyde);

}
public static double findMaxThicknessBox(double height, double width, double length)
{
	double boxHeightMassive = height/2;
	double boxLengthMassive = length/2;
	double boxWidthMassive = width/2;
	double warning = Math.min(boxLengthMassive, boxWidthMassive);
	return warning = Math.min(warning, boxHeightMassive);
}
}



