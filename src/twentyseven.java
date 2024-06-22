import java.util.Scanner;
public class twentyseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p;
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 number");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Enter operator");
		p=sc.next();
		switch(p)
		{
			case "+": System.out.print(x+y);
					break;
			case "-": System.out.print(x-y);
			break;
			case "*": System.out.print(x*y);
			break;
			case "/": System.out.print(x/y);
			break;
			
		}
	}

}
