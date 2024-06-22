import java.util.*;
import java.util.ArrayList;

public class iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(70);
		al.add(19.8F);
		al.add(true);
		System.out.println(al);
		Iterator its=al.iterator();
		while(its.hasNext())
		{
			System.out.println("Value"+its.next());
		}
		
	}

}
