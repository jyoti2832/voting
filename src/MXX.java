//find class name using objcet
class mxa
{
	void show()
	{
		System.out.println("mxx show");
	}
}
public class MXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mxa obj=new mxa();
		System.out.println(obj.getClass());
		mxa obj1=new mxa();
		mxa obj2=new mxa();
		mxa obj3=obj1;
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj1.equals(obj3));
		
		
	}

}
