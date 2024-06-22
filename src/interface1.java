interface inf1
{
	void display();
	void hi();
}
interface infone1
{
	void show();
}
class MIn implements inf1,infone1
{
	public void display()
	{
		System.out.println("display");
	}
	public void hi()
	{
		System.out.println("hi");
	}
	public void show()
	{
		System.out.println("Bye");
	}
}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MIn obj=new MIn();
		obj.hi();
		obj.display();
		obj.show();
		
	}

}
