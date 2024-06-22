import java.util.Scanner;

public class twentyfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no");
		x=sc.nextInt();
		switch(x)
		{case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Fev");
			break;
		case 3:
			System.out.println("Mar");
			break;
		default:
			System.out.println("Wrong");
		}	
	}

}
