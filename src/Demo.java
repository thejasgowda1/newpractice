
public class Demo {

	public static void main(String[] args) {
		
		car bmw=new car("A class","red",565656,12);
		car audi=new car("a5","white",6566565,23);
		car honda=new car("amaze","gray",766666,21);
		
		
		
		
		
		
		bmw.startcar();
		bmw.stopcar();
		bmw.cardetails();
		
		System.out.println("--------------");
		
		audi.startcar();
		audi.stopcar();
		audi.cardetails();
		
		System.out.println("--------------");
		
		honda.startcar();
		honda.stopcar();
		honda.cardetails();
		
		System.out.println("--------------");
	}

}
