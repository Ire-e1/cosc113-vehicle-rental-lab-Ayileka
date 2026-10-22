## Reflection

1. Why should the fields be private?
Fields should be private to enforce *encapsulation*. This prevents outside classes from modifying internal data directly or accidentally setting invalid values (such as a negative speed or an impossible number of doors). It forces the program to use setter methods, which keep data safe and valid.

2. What happens if the Car constructor does not call super(...)?
If the Car constructor does not explicitly call super(...), Java will automatically try to look for and call a default (no-argument) constructor in the parent Vehicle class. Because the Vehicle class only has a parameterized constructor (Vehicle(String brand, int year)), a default constructor does not exist, and the program will fail to compile.

3. What is the difference between this.type and super.type?
* this.type refers to the type variable belonging to the current class instance (which is set to "Car" inside the Car class).
* super.type refers to the hidden type variable belonging to the immediate parent class (which is set to "Vehicle" inside the Vehicle class).
*