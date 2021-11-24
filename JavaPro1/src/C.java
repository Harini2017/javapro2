import java.util.Scanner;

public class C{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Farenheit Value");
		double f=sc.nextDouble();
		double c = (f-32)*5/9;
		System.out.println("Calculate Value"+c);
		

	}

}
