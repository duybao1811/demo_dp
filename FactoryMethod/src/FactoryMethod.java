public class FactoryMethod {

       public static void main(String[] args) {
    	   NotificationFactory.getNotificationExecutor("SMS").executeNotification();
     }
}