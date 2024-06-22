class ABC
{
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	void sum(int x,int y,int p)
{
	System.out.println(x+y+p);
}
void sum(float x,float y)
{
	System.out.println(x+y);
}
}
public class fiftyseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj=new ABC ();
		obj.sum(20,5);
		obj.sum(20, 57);
		obj.sum(20.5f, 17.8f);
	}

}
