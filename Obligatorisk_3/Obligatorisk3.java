import java.util.Scanner;
public class Lottosmotto//utviklet av Martin Gran - all rights reserved
{
	public static void main(String[ ] args)
	{
		int spilltype = typeSpill(); //metode velger spilltype
		int antallrekker = lesInn(); //metode velger antall rekker
		int k;
		for (k=0; k<antallrekker; k++)
		{
			int [ ] lottotabell = new int [spilltype];
			trekk (lottotabell, spilltype); //metode som genererer tallrekke
			bubbleSort (lottotabell); //metode sorterer tallrekke i stigende rekkefølge
			skrivUt(lottotabell); //skriver ut antall rekker!
		}
	}//main

	static int typeSpill()
	{
		int spillvalg=0;//variabel som bestemmer om man velger lotto, viking eller starter valgprosessen på nytt hvis !=1^2
		int x, spillvalg2=0; //variabel som tolker brukers ønske om spill.
		Scanner input = new Scanner (System.in);

		while (spillvalg<6)
		{
			if (spillvalg==1)
				System.out.println("\nUGYLDIG VALG!\n\nVelg enten lotto eller vikinglotto!!\n1 for vikinglotto\n2 for vanlig lotto\n");
			else
				System.out.println("##################################\n\n Hei og velkommen til LuringLOTTO\n\n##################################\n*Vinnersannsynlighet 1/96 millioner, tilbakebetalingsprosent 50%\n\n\nHva vil du spille?\n\nFor VIKINGLOTTO trykk 1\n------------------------\nFor LOTTO trykk 2");

			x = input.nextInt();

			if (x==1) //hvis 1 blir det vikinglotto
			{
				spillvalg=6;
				spillvalg2=48;
				System.out.println("Du har valgt VIKINGLOTTO!\n");
			}

			else if (x==2) //hvis 2 vanlig lotto
			{
				spillvalg=7;
				System.out.println("Du har valgt LOTTO!\n");
			}

			else //hvis annet tall enn 1/2 velges, fortsetter whileloopen
					spillvalg=1;
		}
		return spillvalg;
	}//type spill

	static int lesInn()
	{
		int antallrekker;
		Scanner input = new Scanner (System.in);
		System.out.println("En rekke koster 5kr.\nHvor mange rekker ønsker du å spille?");


		antallrekker = input.nextInt();

		if (antallrekker == 1)
			System.out.println("Du har  kjøpt " + antallrekker + " rekke for tilsammen "+ antallrekker*5 +"kr\n");
		else
			System.out.println("Du har kjøpt " + antallrekker + " rekker for tilsammen "+ antallrekker*5 +"kr\n");

		return antallrekker;
	}//lesinn

	static void trekk(int []y, int n)
	{
		int verdi, x=0, temp;
		double antalltall;
		if (n==6)
			antalltall = 48;
		else
			antalltall = 34;

		for ( int j = 0; j < n; j++)
		{
			verdi = (int) ( Math.random() * antalltall ) + 1;
			y[j] = verdi;
			temp=j;

			for (x=0; x<temp; x++)
			{
				if (y[x]==verdi)
				j=j-1;
			}
		}
	}//trekk
	static void bubbleSort (int[]y)
	{
		int temp, pass, i;
		for ( pass=1; pass < y.length; pass++ )
			for( i=0; i < y.length-1; i++ )
				if( y[ i ] > y[ i+1 ] )
				{
					temp     = y[ i ];
					y[ i ]      = y[ i+1 ];
					y[ i+1 ]  = temp;
				}
	}//bubblesort
	static void skrivUt(int [ ] z )
	{
		for(int k=0; k < z.length; k++)
		{
			if (z[k] <10)
				System.out.print("  "+ z[ k]+ " ");
			else
				System.out.print(" "+ z[ k]+ " ");
		}
		System.out.print("\n");
	}//skrivUt
}//class