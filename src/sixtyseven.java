 class mxkf
{
	void hello ()
	{
		System.out.println("hello");
	}
}
class mxbs extends mxkf
{
	void hello()
	{
		System.out.println("child hello");
	}
}
public class sixtyseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mxbs obj=new mxbs();
		obj.hello();
	}

}
