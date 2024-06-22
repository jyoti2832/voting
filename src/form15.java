class GAST
{
	void hi()
	{
		System.out.println("GAST Hi");
	}
}
class HGST extends GAST
{
	void hi()
	{
		System.out.println("Sub hi");
	}
	void show()
	{
		hi();
		super.hi();
		
	}
}

public class form15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HGST obj=new HGST();
		obj.show();
	}

}
