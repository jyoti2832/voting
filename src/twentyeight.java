import java.util.Scanner;
public class twentyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no");
		x=sc.nextInt();
		y=sc.nextInt();
		switch(x)
		{
		case 1: switch(y)
		{case 1: System.out.println("CL");
		break;
		case 2: System.out.println("HL");
		break;
		}
		case 2: switch(y)
		{case 1: System.out.println("Account");
		break;
		case 2: System.out.println("Loon");
		break;
		default:
			System.out.println("Wrong");
		}
		}
	}

}
