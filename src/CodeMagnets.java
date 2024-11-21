public class CodeMagnets {
    public static void main(String[] args) {
        /* ----------------------- Code Magenets Exercise ---------------*/
        // INSTRUCTIONS: sort out the code snippets so that the output is the same as below
        // Expect output to be a-b c-d in command line.

        // 1. is referred to as the first iteration of the loop.
        // 2. is referred to as the second iteration of the loop.
        // 3. is referred to as the third iteration of the loop.

        int x = 3;

        // 1. x is 3, which is greater than 0, therefore it passes the condition. The loop is started.
        // 2. After the first iteration, x exited the loop with the value of 2. This is still pass the condition.
        // 2. Loop is started again.
        // 3. x is now 0 after the second iteration. Therefore while loop will not execute.
        while (x > 0) {
            // 1. x is 3 which is greater than 2. It passes the condition of the if statement so will execute printing: a
            // 2. x is 2, therefore does not pass. This if statement will not be executed leaving print statement to still be a-b c
            if (x > 2) {
                System.out.print("a");
            }

           // 1. Decreases x down to 2. Value of x is now 2
            // 2. Decreases x(2) down to 1. Value of x is now 1
            x = x - 1;

            System.out.print("-"); // 1. Prints a- //2. adds another dash output added: a-b c-

            // 1. x is equal to 2  so will print a-b c
            // 2. x(1) is not equal to 2 therefore this if statement is skipped.
            if (x == 2) {
                System.out.print("b c");
            }

            // 1. x is the value of 2 so it does not pass this condition. It will skip over this.
            // 1. The print statement when exiting the loop with be: a-b c
            // 2. x is equal to 1. This statement will execute. Adding to print statement: a-b c-d
            // 2. x is once again decreased from 1 to 0. x is now the value of 0.
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }

        }
    }
}
