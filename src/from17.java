class MyT
{
	int x=105;
	int y=75;
	void show(int x,int y)
	{
		System.out.println("x is"+x);
		System.out.println("y is"+y);
		System.out.println("x is"+this.x);
		System.out.println("y is"+this.y);
		
		
	}
}
public class from17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyT obj=new MyT();
		obj.show(75,70);
	}

}
