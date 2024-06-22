class APNX extends Thread
{
	Thread t;
	APNX()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				Thread.sleep(1000);
				
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
public class thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APNX obj=new APNX();
	}

}
