class student
{
	int rollno;
	String name,course;
	void get()
	{
		rollno=101;
		name="jyoti";
		course="java";
		System.out.println("Valueset");
	}
	void show()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(course);
	}
}
public class fifityfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student();
		obj.get();
		obj.show();
		
	}

}
