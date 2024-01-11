package ObserverPattern;

import ObserverPattern.Observable.IphoneObeservableImpl;
import ObserverPattern.Observable.StockOberservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockOberservable iphoneObeservable = new IphoneObeservableImpl();

        NotificationAlertObserver emailAlertObserver = new EmailAlertObserverImpl("xyz1@gmail.com",iphoneObeservable);
        NotificationAlertObserver emailAlertObserver2 = new EmailAlertObserverImpl("xyz2@gmail.xom",iphoneObeservable);
        NotificationAlertObserver mobileAlertObserver = new MobileAlertObserverImpl("xyz3",iphoneObeservable);

        iphoneObeservable.add(emailAlertObserver);
        iphoneObeservable.add(emailAlertObserver2);
        iphoneObeservable.add(mobileAlertObserver);

        iphoneObeservable.setStockCount(10);
    }
}
