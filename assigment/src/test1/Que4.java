package test1;
interface home{
	void add();
}
interface home9{
	void sub();
}
class Home21{
	
	public void home9(){
		System.out.println("Little princes");
	}
}
class Home12 extends Home21 implements home,home9{
	public void add() {
	System.out.println("This is ");
}
	public void sub() {
	System.out.println("my house");
}
	public void mul() {
		System.out.println("In Hyderabad");
	}
}
public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Home12 h2=new Home12();
			h2.add();
			h2.sub();
			h2.home9();
			h2.mul();
	}

}
