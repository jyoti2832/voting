class spp{
	int x=100,y=108;
	void hi(int x,int y) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(this.x);
		System.out.println(this.y);
	}
}
public class sixtyfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spp obj=new spp();
		obj.hi(21,67);
	}

}
