public class NotificationFactory {

       public static INotification getNotificationExecutor(String executorType) {
       if(executorType.equals("Email"))
         return new EmailNotification();
       if(executorType.equals("SMS"))
         return new SMSNotification();
       return null;
     }
}