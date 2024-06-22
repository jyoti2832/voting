import java.lang.reflect.*;
public class Reflection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class c=Class.forName("java.awt.Graphics");
		Method m[]=c.getMethods();
		for(int i=0; i<m.length; i++)
		{
			System.out.println(m[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
