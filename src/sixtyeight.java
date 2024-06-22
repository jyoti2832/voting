class mxf
{
	 void hello ()
	{
		System.out.println("hello");
	}
}
class mxs extends mxf
{
	void hello()
	{
		System.out.println("child hello");
	}
}
public class sixtyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mxs obj=new mxs();
		obj.hello();
	}

}
