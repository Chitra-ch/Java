package test1;
interface I1{
	void hlo();
}
class bittu {
	public void hlo1() {
		System.out.println("hello");
	}
}
class bittu1 extends bittu implements I1 {
	public void hlo2() {
		System.out.println("Hi");
	}
	public void hlo() {
		System.out.println("Chikki");
	}
	public void hello() {
		System.out.println("How iam looking?");
	}
	
}
class bittu2 extends bittu1{
	public void div() {
		System.out.println("superrr");
	}
	
}
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			bittu2 b2=new bittu2();
			b2.hlo();
			b2.hlo2();
			b2.hello();
			b2.div();
	}

}
