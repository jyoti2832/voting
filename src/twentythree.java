import java.util.Scanner;
public class twentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		if (age>=18)
			System.out.println("Vote");
		else
			System.out.println("Not Vote");
		
	}

}
