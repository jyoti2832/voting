class x{
	void hi() {
		System.out.println("hi");
	} //super with methods
}
class y extends x{
	void hi() {
		System.out.println("child hi");
	}
	void hello() {
		hi();
		super.hi();
	}
}
public class sixtythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		y obj=new y();
		obj.hello();
	}

}
