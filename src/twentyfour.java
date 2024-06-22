import java.util.Scanner;
public class twentyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		if (x>=0 && x<=100)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
