class SST
{
	static int x=10;
	void hi()
	{
		x=x+1;
		System.out.println(x);
	}
}
public class form23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SST obj1=new SST();
		SST obj2=new SST();
		SST obj3=new SST();
		obj1.hi();
		obj2.hi();
		obj3.hi();
	}

}
