package ObserverPattern.Observer;

import ObserverPattern.Observable.StockOberservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockOberservable stockOberservable;
    public EmailAlertObserverImpl(String emailId, StockOberservable stockOberservable) {
        this.emailId = emailId;
        this.stockOberservable = stockOberservable;
//        this.stockOberservable.add(this);
    }
    @Override
    public void update() {
        sendEmail(emailId,"Email sent to the subscriber");
    }

    private void sendEmail(String emailId, String emailSentToTheSubscriber) {
        System.out.println(emailId+ " Email sent to the subscriber");
    }
}
