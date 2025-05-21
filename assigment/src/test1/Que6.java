package test1;
interface b1{
	void I();
}
class act1{
	public void sample() {
		System.out.println("Hi");
	}
}
class act2{
	public void sample1(){
		System.out.println("and");
	}
}
 class Act3 extends act1 implements b1{
	public void I() {
		System.out.println("little");
	}
	public void of() {
		System.out.println("bro");
	}
}
class act4 extends act2{
	public void sample2() {
		System.out.println("sis");
	}
}
public class Que6 {

	public static void main(String[] args) {
		Act3 a=new Act3();
		act4 b=new act4();
		a.sample();
		a.I();
		a.of();
		b.sample1();
		b.sample2();
	}

}
