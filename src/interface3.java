interface infA
{
	void hi();
}
interface infB extends infA
{
	void show();
}
class VInf implements infB
{
	public void hi()
	{
		System.out.println("hi");
	}
	public void show()
	{
		System.out.println("show");
	}
}
public class interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VInf obj=new VInf();
		obj.hi();
		obj.show();
	}

}
