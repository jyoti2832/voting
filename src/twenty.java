import java.util.Scanner;
public class twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,x;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter age");
		age=sc.nextInt();
		x=age>=18?"Vote":"No Vote";
		System.out.println(x);
	}

}
