import java.io.*;
public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String name;
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader bfr=new BufferedReader(ir);
			System.out.println("Enter name pls");
			name=bfr.readLine();
			System.out.println("Thanks"+name);
			
		}
		catch(IOException ex)
		{
			
		}
	}

}
