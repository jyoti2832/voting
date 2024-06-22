import java.util.Scanner;
public class fourtysix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Enter a no");
			x[i]=sc.nextInt();
		}
		for(int i=0; i<5; i++)
		{
			System.out.println(x[i]);
		}
		
	}

}
