package OOPS1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="100";
		System.out.println(x+20); //simple string concatenation
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		//Integer,Double, Character, Boolean
		
		//String to double
		String s="10.66";
		double d= Double.parseDouble(s);
		System.out.println("String before parsing to double-->"+s+10);
		System.out.println("After parsing--->"+(d+10));
		
		//String to boolean
		String k="True";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//integer to string
		int j=20;
		System.out.println(200+20);
		String s1=String.valueOf(j);
		System.out.println(200+s1);
		
		//Interview Q. If the string is not pure int & you parse to int what will happend ///we will get NumberFormateException
		String u="100A";
		Integer.parseInt(u); //java.lang.NumberFormatException
		
		
		
	}

}
