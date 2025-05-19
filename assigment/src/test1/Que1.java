package test1;
interface I1 {
	void add();
}
interface I2 {
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}
class Sample2{
	void div() {
		System.out.println("Div");
	}
}
public class Que1 extends Sample2 implements I3{
     public void add() {
    	 System.out.println("Add");
     }
     public void sub() {
    	 System.out.println("Sub");
     }
     public void mul() {
    	 System.out.println("Mul");
     }
	public static void main(String[] args) {
		Que1 d1 = new Que1();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}
	
}
