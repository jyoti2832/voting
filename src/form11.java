class ASup
{
	void hi()
	{
		System.out.println("Super hi");
	}
}
//ASub is child of ASub
class ASub extends ASup
{
	void hello()
	{
		System.out.println("Sub hello");
	}
}
public class form11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ASub obj=new ASub();
		obj.hello();
		obj.hi();
	}

}
