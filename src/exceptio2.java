class MyThr
{
	void div(int x,int y)throws Exception
	{
		int p;
		p=x/y;
		System.out.println(p);
	}
}
public class exceptio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr obj=new MyThr();
		try
		{
			obj.div(20,0);
		}
		catch(Exception ex)
		{
			System.out.println("Some Issue");
		}
	}		
	}