public class UncommonBugSolution {
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
            // Improved resource management with try-with-resources
            try (SomeResource resource = new SomeResource()) {
                // ... use the resource ...
            } catch (Exception ex) {
                // Handle exceptions appropriately
                ex.printStackTrace();
            }
        }
    }

    static class SomeResource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Resource closed");
        }
    }
} 