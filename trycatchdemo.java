public class trycatchdemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println("--- Starting Program Execution ---");

        // Example 1: Standard Exception Handling
        try {
            System.out.println("1. Attempting division...");
            int result = numbers[0] / 0; // Throws ArithmeticException
            System.out.println("Result: " + result); // Skipped due to exception
        } catch (ArithmeticException e) {
            System.out.println("2. Caught Exception: Cannot divide by zero! (" + e.getMessage() + ")");
        } finally {
            System.out.println("3. Finally Block 1: Cleanup action always executes!");
        }

        System.out.println("\n-----------------------------------\n");

        // Example 2: Catching Multiple Exceptions & Guaranteed Finally Execution
        try {
            System.out.println("4. Accessing array element...");
            System.out.println("Element: " + numbers[5]); // Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5. Caught Exception: Array index out of bounds!");
        } catch (Exception e) {
            System.out.println("5. Caught generic Exception: " + e.getMessage());
        } finally {
            System.out.println("6. Finally Block 2: Always runs whether an exception occurs or not.");
        }

        System.out.println("\n--- Program Execution Completed Safely ---");
    }
}
