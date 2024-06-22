class AM
{
	// vargs
	void Hi(int...x)
	{
		//for each
		for(int p:x)
		{
			System.out.println("value"+p);
		}
	}
}
public class fiftyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AM obj=new AM();
		obj.Hi(7);
		obj.Hi(70,86,64,27);
		obj.Hi(7,56,24,67,89,53,87);
	}

}
