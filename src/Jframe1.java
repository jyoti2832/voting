import javax.swing.*;

public class Jframe1 extends JFrame {
	JTable jt;
	String row[]= {"RollNo","Name","City","Phone no"};
	String data[][]= {{"2251861","Aditya Dev Singh","Agra","98********"},{"2251862","Chandan","Mainpuri","86********"},{"2251863","Namarta","Shikohabad","91********"}
	,{"2251864","Prachi","Hathras","63********"},{"2251865","Sony","Bihar","80********"},{"2251866","Anjali Tiwari","Kheragarh","90********"},{"2251867","Bhawna Jadhon","Agra","95********"},{"2251868","Jyoti","Tundla","82********"},{"2251869","Riya","Agra","92********"}
	,{"2251870","Priya","Sikandra","63********"},{"2251871","Astha","Agra","81********"},{"2251872","Priyanshi","Firozabad","90********"},{"2251873","Isha Single","Khandari","98********"},{"2251874","Bibita","Agra","85********"},{"2251875","Pragati","Agra","90********"}
	,{"2251876","Kasish","Sikandra","75********"},{"2251877","Pawan Tiwari","Khandari","86********"},{"2251878","Anjli Bhghel","Agra","95********"},{"2251879","Sarthak","Agra","90********"},{"2251880","Priveen Chaudhary","Agra","80********"},{"2251869","Riya","Agra","92********"}
	,{"2251881","Harsh","Tundla","63********"},{"2251882","Khushi Nagar","Agra","89********"},{"2251883","Nisha Lalwani","Agra","90********"}};
		
	
	public Jframe1() {
		setTitle("Myfram");
		setSize(800,800);
		jt=new JTable(data,row);
		JScrollPane jp=new JScrollPane(jt);
		add(jp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jframe1 obj=new Jframe1();
	}

}


