import java.io.*;
public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x,y;
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader bfr=new BufferedReader(ir);
			System.out.println("Enter No");
			x=Integer.parseInt(bfr.readLine());
			System.out.println("Enter No");
			y=Integer.parseInt(bfr.readLine());
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			
			
		}
		catch(IOException ex)
		{
			
		}
	}

}
