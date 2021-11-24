import java.util.Scanner;

public class Disp {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		double l=sc.nextDouble();
		System.out.println("Enter Breadth");
		double b=sc.nextDouble();
		System.out.println("Enter Height");
		double h=sc.nextDouble();
		double d = Math.sqrt(Math.pow(l, 2)+Math.pow(b, 2)+Math.pow(h,2));
		System.out.println("Calculated Result:"+d);
		

	}

}

