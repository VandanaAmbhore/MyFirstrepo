package OOPS1;

public class FunctionsInJava {

	public static void main(String[] args) {
		//main method is starting point of execution
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		int l=obj.demo();
		System.out.println(l);
		String s1=obj.abc();
		System.out.println(s1);
		int d1=obj.dividion(30, 10);
		System.out.println(d1);
		//main method is void as it never return value
	}
	//non static methods 
	//3 types of method //1. does not return any thing //2. no i/p bt some o/p return some value //3. Parameterized
	
	//void --does not return any value
	//return type void
	public void test() {
		System.out.println("Test method");
	}
	//return type int
	public int demo() { //no i/p bt gives o/p
		System.out.println("Demo method");
		int a=10;
		int b=20;
		int c =a+b;
		return c;
	}
	public String abc() { //no i/p bt gives o/p
		System.out.println("abc method");
		String s="selenium";
		return s;
	}
	
	//x & y are parameters
	public int dividion(int x, int y) {
		System.out.println("dividion method");
		int d=x/y;
		return d;
	}	

}
