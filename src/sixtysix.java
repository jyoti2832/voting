class MAT{
	MAT(){
		System.out.println("hi MAT");
	}
	MAT(int x){
		this();
		System.out.println(x*x);
	}
}
public class sixtysix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MAT obj=new MAT(5);
	}

}
