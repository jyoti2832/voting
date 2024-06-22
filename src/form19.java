class ATP
{
	void hello()
	{
		System.out.println("hello super");
	}
}
class BTP extends ATP
{//override
	void hello()
	{
		System.out.println("hello sub");
	}
}
public class form19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTP obj=new BTP();
		obj.hello();
		ATP obj1;
		obj1=new BTP();
		obj1.hello();
		obj1=new ATP();
		obj.hello();
		
	}

}
