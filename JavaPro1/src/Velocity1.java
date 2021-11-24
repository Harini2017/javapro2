import java.util.Scanner;
public class Velocity1 {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter initial velocity");
			double u=sc.nextDouble();
			System.out.println("Enter acceleration");
			double a=sc.nextDouble();
			System.out.println("Enter Displacement");
			double s=sc.nextDouble();
			double v = Math.sqrt(Math.pow(u,2)+2*a*s);
			System.out.println("Calculate Result"+v);
			
		}

	}

