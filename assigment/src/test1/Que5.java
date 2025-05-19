package test1;
interface hi{
	void add();
}
interface hi1{
	void sub();
}
class sample{
	public void samplee1(){
		System.out.println("who");
	}
}
class sample1 extends sample implements hi,hi1{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("Brother");
	}
	public void mul() {
		System.out.println("is he");
	}
	
}
class samplel2 extends sample1{
	public void div() {
		System.out.println("my brother");
	}
}

public class Que5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samplel2 c=new samplel2();
		c.add();
		c.sub();
		c.samplee1();
		c.mul();
		c.div();

	}

}
