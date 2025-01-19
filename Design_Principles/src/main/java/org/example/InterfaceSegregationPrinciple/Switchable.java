package org.example.InterfaceSegregationPrinciple;

/*
   I: Interface Segregation Principle

Concept: Clients should not be forced to depend on interfaces they do not use.

Real-World Analogy: It’s like having a universal remote control with so many buttons, most of which you never use. Instead, you would prefer a
 simpler remote with only the buttons you need.

In Practice: Instead of creating a large interface with many methods, create smaller, more specific interfaces for each type of functionality
(e.g., Switchable for turning on/off, Timer for setting a timer). This ensures that classes only implement the methods they actually need,
making the code more modular and easier to maintain.

Example: To follow the Interface Segregation Principle, we should create specific interfaces for each type of functionality:
 */

// Define an interface for switchable devices
interface Switchable {
    void turnOn();
    void turnOff();
}

// Define an interface for devices with timers
interface Timer {
    void setTimer(int time);
}

// Concrete implementation of a switchable device
class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off");
    }
}

/* By creating specific interfaces like Switchable and Timer, we ensure that the Fan class only depends on the methods it needs.
This approach makes the Fan class easier to understand and maintain. If we have other appliances that need a timer, they can implement the Timer
interface without being forced to implement unrelated methods.*/

