package org.example.SingleResponsibilityPrinciple;

/*
S: Single Responsibility Principle (SRP)
Concept: A class should have only one reason to change, meaning it should have only one job or responsibility.

Real-World Analogy: Like a chef in a restaurant, who is responsible only for cooking and not for taking orders or serving food.

In Practice: If you have a class called OrderProcessor, it should only process orders, not handle database storage or error logging.
*/

// Example: To follow the Single Responsibility Principle, we should split the OrderProcessor class into smaller classes:

class OrderProcessor {
    private String order;

    public OrderProcessor(String order) {
        this.order = order;
    }

    public void processOrder() {
        System.out.println("Processing order: " + this.order);
    }
}

class DatabaseManager {
    public void saveToDb(String order) {
        System.out.println("Saving " + order + " to database");
    }
}

class ErrorLogger {
    public void logError(String errorMessage) {
        System.out.println("Logging error: " + errorMessage);
    }
}

/*
By splitting the OrderProcessor class into OrderProcessor, DatabaseManager, and ErrorLogger, each class now has a single responsibility.
 This separation makes the code easier to manage, test, and extend. For instance, if the way errors are logged changes, you only need to modify
  the ErrorLogger class without affecting the other parts of the system.
 */



