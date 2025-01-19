package org.example.OpenClosedPrinciple;

public class Solution {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PayPalPayment();

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(creditCardPayment, 100);
        paymentProcessor.processPayment(paypalPayment, 200);
    }
}
