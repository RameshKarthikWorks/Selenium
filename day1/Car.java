package week1.day1;

public class Car {
	
	public void driveCar()
	{
		System.out.println("Driving the Car");
	}
	
	public void soundHorn()
	{
		System.out.println("Applying the Horn");
		
	}
	
	public void isPuncture() {
		System.out.println("Is the tyre is puncture");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.driveCar();
		car.soundHorn();
		car.isPuncture();
		
		

	}

}
