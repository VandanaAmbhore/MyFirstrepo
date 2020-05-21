package JavaConscepts;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; //initialization
		while(i<=10) { //conditional
			System.out.println(i);
			i++; //incremental  OR decrement
		}
		//disadvantage with while loop if we did not used increment operator then the while loop will go in infinite loop
		
		System.out.println("****************");
		
		//for loop
		String name="vandana123";
		//for(initialization; condition; increment/decrement)
		for(int j=9; j>=0; j--) {
			
			System.out.println(name.charAt(j));
		}
		System.out.println("**************");
		//print 10 to 1
		//10 9 8 7 6 5 4 3 2 1
		for(int k=10; k>=1; k--) {
			System.out.println(k);
		}

	}

}
