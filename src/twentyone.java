import java.util.Scanner;
public class twentyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int a,b,c,t;
		float p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter maths marks");
		a=sc.nextInt();
		System.out.println("Enter english marks");
		b=sc.nextInt();
		System.out.println("Enter computer marks");
		c=sc.nextInt();
		t=a+b+c;
		p=(t*100)/300;
		System.out.println(p);
	}

}
