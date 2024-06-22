import java.util.*;
public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int x,y,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		x=sc.nextInt();
		y=sc.nextInt();
		p=x/y;
		System.out.println(p);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second no zero");
		}
		catch(InputMismatchException ex)
		{
			System.out.println("wrong type");
		}
		finally
		{
			System.out.println("the end");
		}
	}

}
