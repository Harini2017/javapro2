import java.util.Scanner;


public class Si {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		double P=sc.nextDouble();
		System.out.println("Enter the Rate of Intrest ");
		double R=sc.nextDouble();
		System.out.println("Enter the Time Period");
		double T=sc.nextDouble();
		double si=P*R*T/100;
		System.out.println("The Intrest Earned is:"+si);

	}

}



