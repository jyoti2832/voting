class AP
{
	int x;
	AP()
	{
		x=10;
		System.out.println("x is"+x);
	}
	// Parameter constructor
	AP(int p)
	{
		x=p;
		System.out.println("x is"+p);
	}
}
public class sixty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AP obj=new AP();
		AP obj1=new AP();
		AP obj2=new AP(17);
		AP obj3=new AP(75);
		
	}

}
