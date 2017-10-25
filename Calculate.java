//package com.tutorialspoint;

public class Calculate {

	public Calculate()
	{
		System.out.println("Bonjour");
		char[] Tablecar = {'a','b','c','d','e','f'};
		int i,j;
		System.out.println("Tableau avant : " + String.valueOf(Tablecar));
		for(i=0, j=5; i<j; i++,j--)
	     { 
		   char car ;
	       car = Tablecar[i];
	       Tablecar[i ]= Tablecar[j];
	       Tablecar[j] = car;
	     }
		 System.out.println("tableau après : " + String.valueOf(Tablecar));
	}
	public double Sqrt(double a)
	{
		if (a > 0)
		{
			return Math.sqrt(a);
		}
		return -1;
	}

}
