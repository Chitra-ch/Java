package test1;
interface chikki{
	void add();
}
interface chikki1 extends chikki{
	void sub();
}
class chikkii implements chikki1{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("bro");
	}
	public void mul() {
		System.out.println("Hello");
	}
}
class chikkii1 implements chikki1{
	public void add() {
		System.out.println("chikki");
	}
	public void sub() {
		System.out.println("shanu ");
	}
	public void mul() {
		System.out.println("is my sisters");
	}
}
public class Que2 {

	public static void main(String[] args) {
		chikkii c=new chikkii();
		chikkii1 c1=new chikkii1();
		c.add();
		c.sub();
		c.mul();
		c1.add();
		c1.sub();
		c1.mul();
		

	}

}
