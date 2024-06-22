class ATSA
{
	ATSA()
	{
		System.out.println("A class");
	}
	ATSA(int x)
	{
		System.out.println("Square"+(x*x));
	}
}
class MTAS extends ATSA
{
	MTAS()
	{
		System.out.println("B");
	}
	MTAS(int m)
	{
		super(m);
		System.out.println(m*m*m);
	}
}
public class form16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MTAS obj=new MTAS(7);
	}

}
