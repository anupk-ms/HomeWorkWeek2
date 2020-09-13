package anupk;

public class CarFactory {
	//use getCar method to get object of type car 
	public Car getCar(String carType){		
		if(carType.equalsIgnoreCase("BMW")){
			return new BMW();     
		} 
		else if(carType.equalsIgnoreCase("Jaguar")){
			return new Jaguar();
		} 
		else if(carType.equalsIgnoreCase("MercedesBenz")){
			return new MercedesBenz();
		}
		else if(carType.equalsIgnoreCase("RangeRover")){
			return new RangeRover();
		}
		return null;
	}
}
