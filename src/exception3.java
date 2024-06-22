import java.util.Scanner;
class ATH
{
	void div(int x,int y) throws Exception
	{
		int p=x/y;
		System.out.println(p);
	}
}
public class exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATH obj=new ATH();
		try 
		{
			obj.div(12,0);
		}
		catch(Exception e)
		{
			System.out.println("some problem");
		}
	}

}
