import java.io.*;
public class EmpWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpData obj=new EmpData();
		obj.empid=101;
		obj.name="Raj";
		obj.salary=21000;
		try
		{
			FileOutputStream fn=new FileOutputStream("Adata.txt");
			ObjectOutputStream mt=new ObjectOutputStream(fn);
			mt.writeObject(obj);
			System.out.println("object saved");
			fn.close();
			
		}
		catch(Exception ex) {
		System.out.println(ex);
		
	}

}
}