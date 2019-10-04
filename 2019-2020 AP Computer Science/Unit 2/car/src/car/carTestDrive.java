public class carTestDrive {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car mustang = new Car();
		
		//increase the speed
		mustang.accelerate();
		mustang.accelerate();
		mustang.accelerate();
		mustang.accelerate();
		
		//decrease the speed
		mustang.brake();
		
		//print current speed
		System.out.println("Speed is " + mustang.getSpeed);
	}

}
