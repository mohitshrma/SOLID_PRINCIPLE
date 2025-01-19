package org.example.SingleResponsibilityPrinciple;

public class Solution {
    public static void main(String[] args) {
        String order = "Order #123";
        OrderProcessor orderProcessor = new OrderProcessor(order);
        orderProcessor.processOrder();

        DatabaseManager dbManager = new DatabaseManager();
        dbManager.saveToDb(order);

        ErrorLogger errorLogger = new ErrorLogger();
        errorLogger.logError("No errors");
    }
}
