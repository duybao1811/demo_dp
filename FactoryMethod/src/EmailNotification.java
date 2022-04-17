public class EmailNotification implements INotification {

        @Override
        public void executeNotification() {
           System.out.println("Email notification sent");
        }
}