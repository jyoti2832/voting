
public class stringclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pt="this is java code";
		System.out.println(pt.substring(5,10));
		String rt=pt.replace("java","c++");
		System.out.println(rt);
		String a="hello";
		String b="hello";
		String d="HELLO";
		System.out.println(a.equals(b));
		System.out.println(a.equals(d));
		System.out.println(a.equalsIgnoreCase(a));
		String str="java code";
		StringBuffer sb=new StringBuffer(str);
		sb.append("testing");
		System.out.println(sb);
		sb.delete(0,4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
