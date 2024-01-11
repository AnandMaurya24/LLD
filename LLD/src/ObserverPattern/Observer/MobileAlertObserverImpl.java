package ObserverPattern.Observer;

import ObserverPattern.Observable.StockOberservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StockOberservable stockOberservable;

    public MobileAlertObserverImpl(String username, StockOberservable stockOberservable) {
        this.username = username;
        this.stockOberservable = stockOberservable;
    }
    @Override
    public void update() {
        sendMobileNotification(username,"Mobile Notification sent to the subscriber");
    }

    private void sendMobileNotification(String username,String s) {
        System.out.println(s + " " + username);
    }
}
