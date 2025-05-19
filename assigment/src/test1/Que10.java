package test1;
interface c{
	void cal();
}
interface ch1{
	void cal1();
}
interface chi2{
	void cal2();
}
interface sam3{
	void cal3();
}
class p0 implements c,ch1,chi2{
	public void cal() {
		System.out.println("sai");
	}
	public void cal1() {
		System.out.println("hi");
	}
	public void cal2() {
		System.out.println("Ram");
	}
	public void add() {
		System.out.println("hlo");
	}
}
class p1 extends p0 implements sam2{
	public void cal3() {
		System.out.println("these are");
	}
	public void sub() {
		System.out.println("friends");
	}
}
public class Que10 {

	public static void main(String[] args) {
		p1 c= new p1();
		c.cal();
		c.cal1();
		c.cal2();
		c.add();
		c.cal3();
		c.sub();

	}

}

