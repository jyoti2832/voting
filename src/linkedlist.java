import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al=new LinkedList();
		al.add(25);
		al.add("ABC");
		al.add(78.8F);
		al.add(true);
		al.add(90);
		System.out.println(al);
		System.out.println(al.getFirst());
		al.remove(al.getLast());
		al.addFirst("AA");
		System.out.println(al);
		al.addLast(1000);
		System.out.println(al);
	}

}
