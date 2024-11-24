/*--------------------Learning about Objects and Classes------------------------------------*/

 public class Dog {
   // These are called instance variables/fields
     // Right click generate to String to be given a string representation of the full object.
     // Without to String method, it will be print the memory address(location) of the JVM.
    int size;
    String breed;
    String name;
// This is the method. It gives the object a behaviour.
    void bark () {
        System.out.println("Ruff Ruff");
    }
}
