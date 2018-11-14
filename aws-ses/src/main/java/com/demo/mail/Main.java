package com.demo.mail;

public class Main {
    private static final String SMTP_SERVER_HOST = "email-smtp.us-east-1.amazonaws.com";
    private static final String SMTP_SERVER_PORT = "587";
    private static final String SUBJECT = "Sending mail with SES SMTP and Java Mail";
    private static final String BODY = "Hi,<br><br>This is a programmatic email.";
    
    static final String FROM = "ksourav707@gmail.com";
    static final String FROMNAME = "K Sourav";
    static final String TO = "k2sourav@yahoo.com";
    static final String SMTP_USERNAME = "AKIAITZZIM7U74UIFSLA";
    static final String SMTP_PASSWORD = "Ah7B0eO+iuD8FBcF8qbrspEUsSHFgY31g3/5tQzoKN82";

    public static void main(String[] args) {
        final String SMTP_USER_NAME = SMTP_USERNAME;
        final String SMTP_USER_PASSWORD = SMTP_PASSWORD;
        final String FROM_USER_EMAIL = FROM;
        final String FROM_USER_FULLNAME = FROMNAME;
        final String TO_USER_EMAIL = args[0];

        AWSSESDemo sendingMailThroughAWSSESSMTPServer = new AWSSESDemo();
        sendingMailThroughAWSSESSMTPServer.sendMail(SMTP_SERVER_HOST, SMTP_SERVER_PORT, SMTP_USER_NAME, SMTP_USER_PASSWORD, FROM_USER_EMAIL, FROM_USER_FULLNAME, TO_USER_EMAIL, SUBJECT, BODY);
    }
}
