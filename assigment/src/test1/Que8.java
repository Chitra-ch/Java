package test1;
interface sam{
	void add();
}
interface sam1{
	void sub();
}
interface sam2 extends sam,sam1{
	void mul();
}
class class1{
	public void div() {
		System.out.println("you from");
	}
}
class class2 extends class1 implements sam2{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("people");
	}
	public void mul() {
		System.out.println("where are");
	}
	public void mul2() {
		System.out.println("hyderabad");
	}
}

public class Que8 {

	public static void main(String[] args) {
		class2 c=new class2();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.mul2();

	}

}
