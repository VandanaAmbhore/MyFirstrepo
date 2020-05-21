package JavaConscepts;

public class ArrayConcept {

	public static void main(String[] args) {
		// to store similar data types values in a array variable
		
		//disadvantages of single array
		//1. size is fix----Static array---to overcome this problem we use collection ---Arraylist, hashtable--use dyanamic array
		//2. stores only similar data types------to overcome this problem we use Object array
		
		
		//declaration 
		//1. int array
		int i[]=new int[4];
		
		//initialization
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[5]=50; //ArrayIndexOutOfBoundsException
		System.out.println("Size of array is: "+i.length);
		
		//System.out.println(i[5]); //ArrayIndexOutOfBoundsException
		
		//Print all value of array : use Loop
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		//2. Double array
		double d[]=new double[4];
		d[0]=10.11;
		d[1]=20;
		d[2]=30;
		d[3]=40;
		System.out.println("\n Double array*******************");
		for(int j=0; j<d.length; j++) {
			System.out.println(d[j]);
		}
		
		//3. Char array
		char c[]=new char[2];
		c[0]='A';
		c[1]='m';
		 System.out.println("\n Char array *****************");
		for(int j=0; j<c.length; j++) {
			System.out.println(c[j]);
		}
		
		//4. String array
		String s[]=new String[3];
		s[0]="hey";
		s[1]="hi";
		s[2]="Shubhu";
		System.out.println("\n String array");

		
		//Object Array(Object is a class)
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]="18/8/1991";
		ob[2]=25;
		ob[3]=25000.99;
		ob[4]="Pune";
		ob[5]='M';
		System.out.println("Object array \n"+ob[0]);
		
		for(int j=0; j<ob.length; j++) {
			System.out.println(ob[j]);
		}
		
		
	}

}
