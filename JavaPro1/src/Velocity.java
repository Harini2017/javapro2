import java.util.Scanner;
public class Velocity {


		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter intial velocity");
			double u=sc.nextDouble();
			System.out.println("Enter acceleration");
			double a=sc.nextDouble();
			System.out.println("Enter time");
			double t=sc.nextDouble();
			double v=u+a*t;
			System.out.println("Final velocity:"+v);
			
		}

	}



