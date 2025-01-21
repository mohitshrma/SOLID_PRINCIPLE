package org.example.DependencyInversionPrinciple;

// Example usage
public class Solution {
    public static void main(String[] args) {
        EmailService smtpService = new SMTPService();
        EmailSender emailSender = new EmailSender(smtpService);
        emailSender.sendEmail("Hello World");
    }
}
