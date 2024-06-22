
public class Animation1 extends Thread {
	Thread t;
	public Animation1()
	{
		System.out.println("hello");
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			
		System.out.println("Pls wait for 5sec");
		Thread.sleep(5000);
		System.out.println("welcome here");
		
	}
	catch(Exception e)
	{
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animation1 obj=new Animation1();
	}

}
