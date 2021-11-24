
import java.util.Scanner;

public class Volume {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		double r=sc.nextDouble();
		System.out.println("Enter Height");
		double h=sc.nextDouble();
		double v = (Math.PI*Math.pow(r, 2)*h)*1/3;
		System.out.println("Calculated Value: "+v);

	}

}

