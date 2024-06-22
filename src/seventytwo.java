interface cls
{
	void hello();
}
interface infonel extends cls{
	void show();
}
class zx implements infonel{
	public void hello() {
		System.out.println("hello");
	}
	public void show() {
		System.out.println("show");
	}
}
public class seventytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zx obj=new zx();
		obj.hello();
	}

}
