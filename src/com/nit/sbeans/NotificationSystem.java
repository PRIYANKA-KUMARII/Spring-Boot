package com.nit.sbeans;

public class NotificationSystem {
    private final NotificationSender sender;  
    private MessageFormatter formatter;      
    public NotificationSystem(NotificationSender sender) {
        this.sender = sender;
    }

    
    public void setFormatter(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    public void notify(String recipient, String message) {
        if (formatter == null) {
            throw new IllegalStateException("Formatter has not been set!");
        }
        String formatted = formatter.format(recipient, message);
        sender.send(recipient, formatted);
    }
}
