package OOPS2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMW();
		//If we have same methods in child & parent class, then preference will be given to child class methods
		b.start();
		
		b.stop();
		b.refill();
		b.theftsafty();
		b.engine();
		
		System.out.println("***********************88");
		Car c=new Car();
		c.start();
		c.stop();
		c.refill();
		
		System.out.println("*********");
		//Top casting
		Car c1=new BMW(); //child class object can be referred by parent reference variable this is called dyanamic polymrphism --Run time Poly
		c1.start();
		c1.stop();
		c1.refill();
		
		//Down casting >>allowed like below bt throws exception 
		BMW b1=(BMW)new Car(); //ClassCastException
		
		
		
		
	}

}
