package org.example.OpenClosedPrinciple;


/*Concept: Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

Real-World Analogy: Think of a graphic design software. It allows you to add new functionalities (like new shapes) without changing the
core drawing engine.


In Practice: Implementing new functionalities via interfaces or abstract classes, allowing new functionalities to be added without changing
 existing code.

Example: To follow the Open/Closed Principle, we can use abstract classes and inheritance to add new payment types without changing
 existing code:
 */

abstract class Payment {
    public abstract void process(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}

class PayPalPayment extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}

class PaymentProcessor {
    public void processPayment(Payment payment, double amount) {
        payment.process(amount);
    }
}

/*
By using an abstract class Payment and creating concrete classes CreditCardPayment and PayPalPayment, we ensure that the PaymentProcessor
class does not need to change when new payment types are introduced. This approach allows the system to be easily extended with new payment
 methods without modifying existing code, thus reducing the risk of introducing bugs.
 */