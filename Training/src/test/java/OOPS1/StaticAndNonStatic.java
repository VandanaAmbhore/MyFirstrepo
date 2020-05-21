package OOPS1;

public class StaticAndNonStatic {
	//the scope of gobal var are available through out the all the functions
	String name="Tom"; //Non static global variable
	static int age=25; //static global variable

	public static void main(String[] args) {
		//how to call static methods & variables
		//1. Direct calling:
		sum();
		
		//2. calling by class name
		StaticAndNonStatic.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//How to access non static methods & variables
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sendmail();
		System.out.println(obj.name);
		//Can I access the static methods & var by using object reference  ---> Yes only warning will be given & its not the good approch
		System.out.println(obj.age);

	}
	public void sendmail() { //Non static method
		System.out.println("sendmail method");
		
	}
	static public void sum() { // static method
		System.out.println("Sum method");
	}

}
