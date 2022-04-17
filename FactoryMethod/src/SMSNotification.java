public class SMSNotification implements INotification {

       @Override
       public void executeNotification() {
          System.out.println("SMS notification sent.");
       }
}