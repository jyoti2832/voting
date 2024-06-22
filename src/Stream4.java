import java.io.*;
public class Stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream ft=new FileOutputStream("AA.txt");
			String line="This is new data";
			ft.write(line.getBytes());
			ft.close();
			System.out.println("Data Saved");
		}
		catch(Exception ex)
		{
			
		}
	}

}
