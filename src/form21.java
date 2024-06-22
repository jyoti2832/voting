final class AFF
{
	void hi()
	{
		System.out.println("Hi");
	}
}
class AFSS extends AFF
{
	void show()
	{
		System.out.println("show");
	}
}
public class form21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AFSS obj=new AFSS();
		obj.show();
		obj.hi();
	}

}
