class APXy extends Thread
{
	Thread t;
	APXy()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			System.out.println("wait for 5 sec");
			Thread.sleep(5000);
			System.out.println("hello java");
		}
		catch(Exception e)
		{
			
		}
	}
}
public class thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APXy obj=new APXy();
	}

}
