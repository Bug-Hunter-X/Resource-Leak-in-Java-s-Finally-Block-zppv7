public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; // Potential ArithmeticException
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
            // The bug: Resource leak if an exception occurs before reaching the close statement
            // ... code that uses a resource (e.g., a file, network connection, etc.) ...
            // ...  missing resource.close(); ...
        }
    }
}