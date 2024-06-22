class abx{
	abx() {
		System.out.println("A");
	}
	abx(int x){
		System.out.println(x*x);
	}
}
class aby extends abx{
	aby(){
		System.out.println("B");
	}
	aby(int m){
		super(m);
		System.out.println(m*m*m);
	}
}
public class sixtyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aby obj=new aby(2);
	}

}
