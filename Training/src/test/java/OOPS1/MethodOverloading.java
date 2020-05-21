package OOPS1;

public class MethodOverloading {

	public static void main(String[] args) {
		//
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(20);
		obj.sum(10, 20);

	}
	public static void main(int p) {
		System.out.println("inside 2nd main()");
	}
	//you can not create a method inside a method
	//duplicate methods ----i.e. same method with the same number of argument are not allowed
	//Method overloading ---> When method name is same with different argument or input parameter within the same class
	//main() can be overloaded
	  
	public void sum() { //0 input parameter
		System.out.println("sum method ---zero param...");
		
	}
	public void sum(int i) {
		System.out.println("Sum method----1 i/p parameter");
		
	}
	public void sum(int i, int j) {
		System.out.println("sum method -----2 i/p param...");
		System.out.println(i+j);
	}

}
