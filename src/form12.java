class ABSup
{
	void hi()
	{
		System.out.println("Super hi");
	}
}
//ASub is child of ASub
class ABsub extends ABSup
{
	void hello()
	{
		System.out.println("Sub hello");
	}
}
class AASub extends ABsub
{
	void show()
	{
		System.out.println("Show");
	}
}
public class form12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AASub obj=new AASub();
		obj.hello();
		obj.hi();
		obj.show();
		
	}

}
