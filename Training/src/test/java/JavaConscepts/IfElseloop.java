package JavaConscepts;

public class IfElseloop {

	public static void main(String[] args) {
		
		// > < >= <= == != conditional operators
		int a= 30;
		int b= 20;
		if(b>a) {
			System.out.println("B is greater than a");
		}else {
			System.out.println("A is greater than b");
		}
		int c= 10;
		if(c==10) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
		
		int p=5;
		int q=20;
		int z=p+q;
		if(z>=30) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		if(true) {
			System.out.println("Passed the condition");
		}
		//Dead code
		/*else {
			System.out.println("Fail");
		}*/
		
		//max of 3 numbers
		int a1=100;
		int b1=200;
		int c1=300;
		if(a1>b1 & a1>c1) {
			System.out.println("a is greater");
		}else if(b1>c1) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}
	}

}
