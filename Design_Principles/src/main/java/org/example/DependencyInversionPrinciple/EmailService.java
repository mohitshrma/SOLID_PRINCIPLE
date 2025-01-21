package org.example.DependencyInversionPrinciple;

/*  D: Dependency Inversion Principle
Concept: High-level modules should not depend on low-level modules. Both should depend on abstractions. Also, abstractions should not depend on details;
    details should depend on abstractions.

Real-World Analogy: Like using a standard power socket in your home – it doesn’t need to know what type of device will be plugged in
(the high-level policy). The devices (low-level modules) are designed to fit the socket.


In Practice: A class should receive its dependencies from the outside rather than creating them itself. This can be achieved using interfaces
or abstract classes, making the code more flexible and easier to test.

Example: To follow the Dependency Inversion Principle, we should depend on abstractions rather than concrete classes:
 */

// Define an abstract class for email services
abstract class EmailService {
    public abstract void send(String message);
}

// Concrete implementation of EmailService using SMTP
class SMTPService extends EmailService {
    @Override
    public void send(String message) {
        System.out.println("Sending email via SMTP: " + message);
    }
}

// Another implementation of EmailService for testing purposes
class MockEmailService extends EmailService {
    @Override
    public void send(String message) {
        System.out.println("Mock sending email: " + message);
    }
}

// EmailSender depends on the EmailService interface
class EmailSender {
    private EmailService emailService;

    public EmailSender(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendEmail(String message) {
        emailService.send(message);
    }
}

/*
SMTPService is a concrete implementation of the EmailService interface. It uses the Simple Mail Transfer Protocol (SMTP) to send emails.
SMTP is a protocol used to send emails over the Internet.

By relying on the EmailService abstraction, the EmailSender class gains flexibility. It can work with any implementation of the EmailService interface.
For example, it can use SMTPService for real email sending or MockEmailService for testing.

This design makes the system easier to extend and test. You can switch from SMTPService to MockEmailService during testing without changing the
EmailSender class.


 */

