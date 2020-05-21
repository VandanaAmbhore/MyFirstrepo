package OOPS1;

public class ClassConcepts {
	
	//consider class as car >> variables of class
	int mod;
	int wheel;

	public static void main(String[] args) {
		// new ClassConcepts() is the object of class ClassConcepts
		//new keyword is used to create the object
		//a,b,c are the object reference variable
		ClassConcepts a=new ClassConcepts();
		ClassConcepts b=new ClassConcepts();
		ClassConcepts c=new ClassConcepts();
		a.mod=2010;
		a.wheel=4;
		b.mod=2015;
		b.wheel=4;
		c.mod=2020;
		c.wheel=4;
		System.out.println(a.mod +"\n"+a.wheel);
		System.out.println(b.mod +"\n"+b.wheel);
		System.out.println(c.mod +"\n"+c.wheel);
		
		System.out.println("After shifting thr references>>>>>>>>>>>>>");
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);

	}

}
