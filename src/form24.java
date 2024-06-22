abstract class abste
{
	void hi()
	{
		System.out.println("Hi abst");
	}
	abstract void show();
}
class mabs extends abste
{
	void hello()
	{
		System.out.println("hello");
	}
	void show()
	{
		System.out.println("hy");
	}
	
}
public class form24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mabs obj=new mabs();
		obj.hi();
		obj.show();
	}

}
