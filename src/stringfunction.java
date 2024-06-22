
public class stringfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xp="hello this is java";
		System.out.println(xp.length());
		System.out.println(xp.charAt(1));
		System.out.println(xp.toUpperCase());
		System.out.println(xp.toLowerCase());
		System.out.println(xp.indexOf("h"));
		System.out.println(xp.lastIndexOf("h"));
		System.out.println(xp.substring(6,10));
		String mp=xp.replace("java","python");
		System.out.println(mp);
		String aa="hello";
		String ab="HELLO";
		String ad="hello";
		System.out.println(aa.equals(ad));
		System.out.println(aa.equals(ab));
		System.out.println(aa.equalsIgnoreCase(ab));
		
	}

}
