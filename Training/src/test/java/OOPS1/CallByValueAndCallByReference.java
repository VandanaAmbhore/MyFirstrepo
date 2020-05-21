package OOPS1;

public class CallByValueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		obj.testSum(30, 20);
		
		//call by val
		int x=10;
		int y=20;
		obj.testSum(x, y);
		
		obj.p=50;
		obj.q=60;
		//call b ref >>>>>>>>we have to pass reference to ref (pass obj only)
		obj.swap(obj);

	}
	public int testSum(int a, int b) {
		a=30;
		b=40;
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	//Call by reference--->> we are passing the values by object reference
	public void swap(CallByValueAndCallByReference t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		System.out.println(t.p);
		System.out.println(t.q);
		
				
		
	}

}
