class Aout
{
	void hello()
	{
		System.out.println("out hello");
		AIn obj=new AIn();
		obj.hi();
	}
	class AIn
	{
		void hi()
		{
			System.out.println("A Hi");
		}
	}
}
public class nonstic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aout obj=new Aout();
		obj.hello();
	}

}
