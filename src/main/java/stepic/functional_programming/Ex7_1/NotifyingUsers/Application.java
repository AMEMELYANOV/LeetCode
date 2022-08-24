package stepic.functional_programming.Ex7_1.NotifyingUsers;

// create NotificationStrategy interface and Notifier class here

interface SMSService {

    void sendSMS(User user);
}

interface EmailService {

    void sendEmail(User user);
}

interface NotificationStrategy {

    void notifyCustomer(User user);
}

class Notifier {

    NotificationStrategy notificationStrategy;

    public Notifier(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void send(User user) {
        notificationStrategy.notifyCustomer(user);
    }
}

class Application {

    private EmailService emailService;
    private SMSService smsService;

    public Application(EmailService emailService, SMSService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void run(User user) {
        var notifier = new Notifier(emailService::sendEmail);
        notifier.send(user);
        notifier.setNotificationStrategy(smsService::sendSMS);
        notifier.send(user);
    }
}

class User {
    private final String email;
    private final String phoneNumber;

    User(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
