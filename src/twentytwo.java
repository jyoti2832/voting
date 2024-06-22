import java.util.Scanner;
public class twentytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		a=sc.nextInt();
		if (a%2==0)
			System.out.println("Even");
		else 
			System.out.println("Odd");
	}

}
