import java.io.*;
public class Stream6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream ft=new FileInputStream("AA.txt");
			int i=0;
			while((i=ft.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(Exception ex)
		{
			
		}
	}

}
