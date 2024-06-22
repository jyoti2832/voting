class AAT
{
	AAT()
	{
		System.out.println("A Class");
	}
}
class BAT extends AAT
{
	BAT()
	{
		System.out.println("B Class");
	}
}
class CAT extends BAT
{
	CAT()
	{
		System.out.println("C Class");
	}
}
public class form13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CAT obj=new CAT();
	}

}
