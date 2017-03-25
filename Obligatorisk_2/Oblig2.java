public class Oblig3
{
	public static void main(String[] args)
	{
		int number, counter;
		counter = 1;
		number = 1;

	while( number <=182)
		{
			if ((counter >= 1 && counter <=12)
			|| (counter >= 15 && counter <=34)
			|| (counter >= 45 && counter <=56)
			|| (counter >= 75 && counter <=78)
			|| (counter >= 105 && counter <=108)
			|| (counter >= 127 && counter <=138)
			|| (counter >= 149 && counter <=168)
			|| (counter >= 171))
			{
				System.out.print(" ");
				counter = (counter + 1);
			}
			else
			{
				System.out.print("*");
				counter = (counter + 1);
			}

			if (number == 26
				|| number == 52
				|| number == 78
				|| number == 104
				|| number == 130
				|| number == 156
				|| number == 182)
			System.out.print(" \n");
			number = (number +1);
		}

	}
}