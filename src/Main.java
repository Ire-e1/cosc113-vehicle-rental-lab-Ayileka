


	
	public class Main {
	    public static void main(String[] args) {
	        // Create a Car and an ElectricCar
	        System.out.println("--- Testing Car Class ---");
	        Car myCar = new Car("Toyota", 2022, 4);
	        myCar.describe();
	        myCar.showTypes();

	        System.out.println("--- Testing ElectricCar Class ---");
	        ElectricCar myEv = new ElectricCar("Tesla", 2024, 4, 85);
	        myEv.describe();
	        System.out.println("Accelerating EV...");
	        myEv.accelerate(20);
	        myEv.describe(); // Will show increased speed and battery reduced by 1

	        System.out.println("--- Testing Setter Validations ---");
	        // Try to set an invalid negative speed
	        myCar.setSpeed(-10); 
	        
	        // Try to set an invalid door number
	        myCar.setDoors(3);

	        /* 
	         * DIRECT ACCESS DEMONSTRATION COMMENT:
	         * System.out.println(myCar.brand); 
	         * The statement above would cause a compile-time error because 'brand' 
	         * is declared private inside the Vehicle class and cannot be accessed directly 
	         * outside of its own class definition.
	         */
	    }
	}

