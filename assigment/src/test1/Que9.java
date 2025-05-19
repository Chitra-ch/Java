package test1;
interface sai{
	void s0();
}
interface sai1{
	void s1();
}

interface sai2{
	void s2();
}

interface sai3 extends sai,sai1,sai2{
	void s3();
}

class s implements sai3{
	public void s0() {
		System.out.println("Hi");
	}
	public void s1() {
		System.out.println("friends");
	}
	public void s2() {
		System.out.println("this");
	}
	public void s3() {
		System.out.println("is my");
	}
	public void add() {
		System.out.println("family");
	}
}

public class Que9 {

	public static void main(String[] args) {
		s s=new s();
		s.s0();
		s.s1();
		s.s2();
		s.s3();
		s.add();
		}

}

	
