import java.util.Scanner;
public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		x=sc.nextInt();
		if(x<10)
			throw new Exception();
		else 
			System.out.println("ok");
		}
		catch(Exception e)
		{
			System.out.println("ok");
		}
		
		
	}

}
