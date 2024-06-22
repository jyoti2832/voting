interface infc
{
	void hello();
}
interface infonec extends infc
{
	void show();
}
class mmc implements infonec
{
	public void hello()
	{
		System.out.println("hi");
	}
	public void show()
	{
		System.out.println("hello");
	}
}
public class seventyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mmc obj=new mmc();
		obj.hello();
		obj.show();
	}

}
