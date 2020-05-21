package JavaConscepts;

public class StringConcatanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		System.out.println(a+b);
		
		String x="Hello";
		String y="World";
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b); //HelloWorld100200
		System.out.println(x+y+(a+b)); //HelloWorld300
		System.out.println(a+b+x+y+a+x+b+y); //300HelloWorld100Hello200World
		
		double d1=10.33;
		double d2=12.33;
		System.out.println(d1+d2+x+y+a);
		System.out.println(d1+d2+a);
		
/*	O/P	 Point to  
 * 		300
		300HelloWorld
		HelloWorld100200
		HelloWorld300
		300HelloWorld100Hello200World
*/

	}

}
