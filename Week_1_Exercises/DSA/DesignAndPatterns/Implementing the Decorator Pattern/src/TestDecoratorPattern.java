// TestDecoratorPattern.java
public class TestDecoratorPattern {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        // Wrap emailNotifier with SMS and Slack decorators
        Notifier smsAndSlackNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(emailNotifier));

        // Send a message using the decorated notifier
        smsAndSlackNotifier.send("Hello, World!");
    }
}
