# Resource Leak in Java's Finally Block

This repository demonstrates a subtle bug in Java related to resource management within a try-finally block. The example showcases a scenario where an exception prevents the execution of the resource closing statement in the finally block, leading to a resource leak.

## Bug Description
The code includes a division by zero that throws an `ArithmeticException`. While the `finally` block is intended to close the resources, the exception might interrupt the execution of `finally` block before reaching the resource close statement.  This is a common scenario but easily missed if not handled meticulously.