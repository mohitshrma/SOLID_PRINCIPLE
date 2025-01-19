package org.example.LiskovSubstituitionPrinciple;


/*
L: Liskov Substitution Principle
Concept: Objects of a superclass should be replaceable with objects of subclasses without affecting the correctness of the program.

Real-World Analogy: If you're driving a vehicle, you should be able to replace it with a different type of vehicle (like switching a car for a truck)
 and still be able to drive without issues.

In Practice: Ensure that subclasses don't alter expected behavior. For example, if you have a class Bird with a method move(),
each subclass should implement the move() method to reflect its specific type of movement (e.g., Sparrow should fly, Penguin should swim).

Example: To follow the Liskov Substitution Principle, we should ensure that subclasses override methods to reflect their behavior correctly:
 */
class Bird {
    public String move() {
        return "Moving";
    }
}

class Sparrow extends Bird {
    @Override
    public String move() {
        return "Flying";
    }
}

class Penguin extends Bird {
    @Override
    public String move() {
        return "Swimming";
    }
}

// Example usage


