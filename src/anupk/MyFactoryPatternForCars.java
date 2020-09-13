package anupk;

public class MyFactoryPatternForCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory carFactory = new CarFactory();

	    //get an object of BMW and call its Display method.
	    Car car1 = carFactory.getCar("BMW");

	    //call Display method of BMW
	    if (car1 != null) 
	    	car1.Display();

	    //get an object of Jaguar and call its Display method.
	    Car car2 = carFactory.getCar("Jaguar");

	    //call Display method of Jaguar
	    if (car2 != null)
	    	car2.Display();

	    //get an object of MercedesBenz and call its Display method.
	    Car car3 = carFactory.getCar("MercedesBenz");

	    //call Display method of MercedesBenz
	    if (car3 != null)
	    	car3.Display();
	    
	    //get an object of RangeRover and call its Display method.
	    Car car4 = carFactory.getCar("RangeRover");

	    //call Display method of RangeRover
	    if (car4 != null)
	    	car4.Display();
	}
}