import java.io.*;
public class EmpRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpData obj=null;
		try
		{
			FileInputStream fn=new FileInputStream("Adata.txt");
			ObjectInputStream mt=new ObjectInputStream(fn);
			obj=(EmpData)mt.readObject();
			System.out.println(obj.empid);
			System.out.println(obj.name);
			System.out.println(obj.salary);
			fn.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
