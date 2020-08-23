package Day4assign;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Interest Rate Set-up by RBI");
		Scanner value =new Scanner(System.in);
		double rate = value.nextDouble();

		InterestRate(rate);
	}

	public static void InterestRate(double a){
		System.out.println("Enter the ongoing Financial Quarter");
		Scanner val =new Scanner(System.in);
		int number = val.nextInt();

		double ir = a;
		double [] qtrfactor = {0.66,0.5,0.33,0.75};

		switch(number)
		{
			case 1:
				ir =  (ir * qtrfactor[number-1]);
				break;
			case 2:
				ir =  (ir * qtrfactor[number-1]);
				break;
			case 3:
				ir =  (ir * qtrfactor[number-1]);
				break;
			case 4:
				ir =  (ir * qtrfactor[number-1]);
				break;
			default:
				System.out.println("Error");
		}

		System.out.println("Interest rate for this Quarter setup by ICICI Bank is"+ " " + ir);

	}

}
