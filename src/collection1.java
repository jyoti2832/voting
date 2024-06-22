import java.util.*;
public class collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(25);
		al.add("ABC");
		al.add(78.8F);
		al.add(true);
		al.add(90);
		System.out.println(al);
		System.out.println(al.get(1));
		al.remove(al.get(0));
		System.out.println(al);
		
		
	}

}
