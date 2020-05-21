package OOPS2;

public class BMW extends Car { //has-a-relation
	
	//when same method is present in child class & in parent class with the same name & with same argument then its called 
	//method overriding
	public void start() {
		System.out.println("BMW ---start()");
	}
	public void theftsafty() {
		System.out.println("BMW ----thefsafty");
	}

}
