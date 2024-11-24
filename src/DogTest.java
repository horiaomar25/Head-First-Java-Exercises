public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog(); // Making a Dog object/instance
        d.size = 40;
        System.out.println(d); // Print this without using toString method in Dog class. Will return the memory location.
        System.out.println(d.breed); // Empty variable

    }
}
