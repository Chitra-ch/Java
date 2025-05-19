package test1;
interface add{
	void sample();
}
interface add1{
	void sample1();
}
interface add2{
	void sample2();
}
class ad implements add{
	public void sample() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("mam");
	}
}
class ad1 implements add1{
	public void sample1() {
		System.out.println("Hello");
	}
	public void sub1() {
		System.out.println("sir");
	}
}
class ad2 implements add2{
	public void sample2() {
		System.out.println("how are you?");
	}
	public void sub2() {
		System.out.println("fine");
	}
}
public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ad a=new ad();
		ad1 a1=new ad1();
		ad2 a2=new ad2();
		a.sample();
		a.sub();
		a1.sample1();
		a1.sub1();
		a2.sample2();
		a2.sub2();

	}

}
