class NCCS <T,TT>
{//Generic
	void show(T x,TT y)
	{
		System.out.println("Value is"+x);
		System.out.println("Value is"+y);
		
	}
}
public class Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NCCS <Integer,String> obj=new NCCS <Integer,String>();
		obj.show(89,"Hello");
		
		NCCS <String,Integer> obj1=new NCCS <String,Integer>();
		obj1.show("Hello",900);
	}

}
