class AX
{
	void Hi()
	{
		System.out.println("Super");
	}
}
class BX extends AX
{
	void Hello()
	{
		System.out.println("Child");
	}
}
public class sixtyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BX obj=new BX();
		obj.Hello();
		obj.Hi();
	}

}
