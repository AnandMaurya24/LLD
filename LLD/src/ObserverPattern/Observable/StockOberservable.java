package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StockOberservable {

     void add(NotificationAlertObserver observer);

     void remove(NotificationAlertObserver observer);

     void notifySubscriber();

     void setStockCount(int newStockAdded);
     int getStockCount();
}
