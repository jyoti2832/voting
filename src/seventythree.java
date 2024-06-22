interface inf
{
	void hello();
}
interface infone
{
	void show();
}
class mm implements inf,infone
{
	public void hello()
	{
		System.out.println("hy");
	}
	public void show()
	{
		System.out.println("hello");
	}
}
public class seventythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mm obj=new mm();
		obj.hello();
	}

}
