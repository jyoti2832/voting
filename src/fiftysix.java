class Studentm
{
	int rollno;
	String name,course;
	void get(int a,String b,String d)
	{
		rollno=a;
		name=b;
		course=d;
		System.out.println("Valueset");
	}
	void show()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(course);
	}
}
public class fiftysix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentm obj=new Studentm();
		obj.get(101,"jyoti","java");
		obj.show();
		Studentm obj1=new Studentm();
		obj1.get(102,"monika","python");
		obj1.show();
		
	}

}
