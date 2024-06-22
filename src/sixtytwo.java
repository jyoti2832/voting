class sp{
	int x=15;
	void hi() {
		System.out.println("Hi");
	}
}
class sb extends sp{
	int x=1009;
	void hello() {
		System.out.println("hello");
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class sixtytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sb obj=new sb();
		obj.hello();
	}

}
