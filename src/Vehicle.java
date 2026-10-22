public class Vehicle {
   
	    // Private fields to protect data (Encapsulation)
	    private String brand;
	    private int year;
	    private int speed;

	 
	    String type = "Vehicle";

	    // Parameterized constructor
	    public Vehicle(String brand, int year) {
	        this.brand = brand;
	        this.year = year;
	        this.speed = 0; 
	    }

	    // Public getters for encapsulation
	    public String getBrand() {
	        return brand;
	    }

	    public int getYear() {
	        return year;
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    // Setter with validation 
	    public void setSpeed(int speed) {
	        if (speed >= 0) {
	            this.speed = speed;
	        } else {
	            System.out.println("Invalid speed rejected.");
	        }
	    }

	    // Basic description method
	    public void describe() {
	        System.out.println("Vehicle: " + brand + " (" + year + ")");
	    }

	    // Speed acceleration method
	    public void accelerate(int amount) {
	        if (amount > 0) {
	            this.speed += amount;
	        }
	    }
	}
