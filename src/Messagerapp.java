/*
You are expected to create a messaging system that supports multiple messaging services such as SMS,
 Email, and WhatsApp. The common behaviour is sending messages,
 but the implementation of sending messages varies.
 Implement a Java program using interfaces to model this scenario.
Create an interface called MessagingService with the following method:
sendMessage(): This method should be implemented by classes representing different messaging services.
Create three classes, SMSMessagingService, EmailMessagingService, and WhatsAppMessagingService,
which implement the MessagingService interface.
Implement the sendMessage() method in each class based on the specific messaging service requirements.
Write a java code to demonstrate the usage of these classes,
where you create instances of each messaging service class and invoke the sendMessage() method on each instance.
 */
import java.util.Scanner;
interface MessagingService{
    void sendMessage(String message);
}
class SMSMessagingService implements MessagingService{
    public void sendMessage(String message){
        System.out.println("Sending SMS is :"+message);
    }
}

class EmailMessagingService implements MessagingService{
    public void sendMessage(String message){
        System.out.println("Sending Email is :"+ message);
    }
}
class WhatsAppMessagingService implements MessagingService{
    public void sendMessage(String message){
        System.out.println("Sending message is :"+ message);
    }

}
public class Messagerapp {
    public static void main(String[] args) {
        WhatsAppMessagingService whatsAppMessagingService=new WhatsAppMessagingService();
        EmailMessagingService emailMessagingService=new EmailMessagingService();
        SMSMessagingService smsMessagingService=new SMSMessagingService();

        Scanner sc=new Scanner(System.in);

        //smsMessagingService.sendMessage("Hi, SMS!");
        //emailMessagingService.sendMessage("Hi, Email!");
        //whatsAppMessagingService.sendMessage("Hi, WhatsApp!");

        while (true) {
            System.out.println("Messaging Service");
            System.out.println("Enter 1 to send SMS");
            System.out.println("Enter 2 to send Email");
            System.out.println("Enter 3 to send WhatsApp Message");
            System.out.println("Enter 4 to exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    smsMessagingService.sendMessage("Hi, SMS!");
                    break;
                case 2:
                    emailMessagingService.sendMessage("Hi, Email!");
                    break;
                case 3:
                    whatsAppMessagingService.sendMessage("Hi, whatsApp");
                    break;
                case 4:
                    System.exit(0);

            }

        }
    }
}
