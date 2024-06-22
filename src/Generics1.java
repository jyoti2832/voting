
class NCC <T>{//Generic
	void show(T x)
	{
		System.out.println("value is "+x);
	}
}
public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NCC <Integer> obj=new NCC <Integer>();
		obj.show(89);
		
		NCC <String> obj1=new NCC <String>();
		obj1.show("Welcome here");
	}

}
