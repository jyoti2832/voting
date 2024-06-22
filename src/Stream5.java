import java.io.*;
public class Stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream ft=new FileInputStream("AA.txt");
			int x=ft.read();
			System.out.println((char)x);
		}
		catch(Exception ex)
		{
			
		}
	}

}
