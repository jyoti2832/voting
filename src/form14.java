class ABST
{
	int x=25;
	void hi()
	{
		System.out.println(x);
	}
}
class BAST extends ABST
{
	int x=107;
	void show()
	{
		System.out.println("x is"+x);
		System.out.println("x is"+super.x);
		
	}
}
public class form14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BAST obj=new BAST();
		obj.show();
	}

}
