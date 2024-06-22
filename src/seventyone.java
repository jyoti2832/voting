abstract class myabc
{
	abstract void show();
	void hello()
	{
		System.out.println("hello my");
	}
}
class cmbt extends myabc 
{
	void show()
	{
		System.out.println("hy");
	}
}
public class seventyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cmbt obj=new cmbt();
		obj.hello();
	}

}
