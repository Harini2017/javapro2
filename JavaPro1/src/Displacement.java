import java.util.Scanner;



public class Displacement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter intial velocity");
		double u=sc.nextDouble();
		System.out.println("Enter time");
		double t=sc.nextDouble();
		System.out.println("Enter acceleration");
		double a=sc.nextDouble();
		double s=(u*t)+ Math.pow((1/2*a*t),2);
		System.out.println("Calculated Displacement:"+s);
		

	}


}
