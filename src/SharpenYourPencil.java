public class SharpenYourPencil {
    public static void main(String[] args) {
        /* ---------------------------------- WHILE LOOPS ------------------------------------------------ */
        // Output: must be "DooBeeDooBeeDo"

        int x = 1; // Initialize x as 1

        // This loop is asked to run if the value of x is less than 3. In this case the initial value is 1 so it is true.
        while (x < 3) {
            // condition is true so "Doo" and "Be" will run in the command line on the same line as we are using print.
            System.out.print("Doo");
            System.out.print("Be");
            // x is then incremented/increased by 1. In this case, it is 1 + 1. x is reassigned the value of 2.
            // The loop will then begin again with the value of x being 2.
            x = x + 1;
        }
        // The while loop will exit when the condition in brackets become false.
        // It will then run this if statement depending on what value that x was assigned in the final iteration of the
        // loop. In this case it was 3, so the condition of the if statement is true and the statement will be printed.
        if (x == 3) {
            System.out.print("Do");
        }
    }
}
