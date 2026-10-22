

	public class Car extends Vehicle {
	    private int doors;
	    
	    // Hides the parent's field "type"
	    String type = "Car";

	    // Constructor calling the parent constructor using super()
	    public Car(String brand, int year, int doors) {
	        super(brand, year);
	        setDoors(doors); // Uses setter to ensure initial validity
	    }

	    
	    public void describe() {
	        super.describe(); // Calls parent's description
	        System.out.println("Doors: " + doors);
	    }

	    // Accessing both hidden and hiding variable fields
	    public void showTypes() {
	        System.out.println("Type: " + this.type + " | Parent type: " + super.type);
	    }

	    // Getter for doors
	    public int getDoors() {
	        return doors;
	    }

	    // Setter for doors with validation rule (must be 2 or 4)
	    public void setDoors(int doors) {
	        if (doors == 2 || doors == 4) {
	            this.doors = doors;
	        } else {
	            System.out.println("Invalid door count rejected.");
	        }
	    }
	}


