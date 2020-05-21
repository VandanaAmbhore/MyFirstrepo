package JavaConscepts;

public class TwoDiamentionalArray {

	public static void main(String[] args) {
		// Declaration of 2D array
		String x[][]=new String[3][4];
		System.out.println("Total number of rows = "+x.length); //total number of rows
		System.out.println("Total number of columns = "+x[0].length); // 4
		//initialization of 2D array
		
		//1st row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		
		//2nd row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		
		//3rd row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		
		System.out.println(x[1][1]);
		System.out.println(x[2][3]);
		
		//print all values of 2D array : 2 for loop
		//row=0, col= 0 to 4
		//row=1, col= 0 to 4
		//row=2, col= 0 to 4
		for(int row=0; row<x.length; row++) {
			for(int col=0; col<x[0].length; col++ ) {
				System.out.println(x[row][col]);
				
			}
		}
		

	}

}
