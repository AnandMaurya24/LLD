package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObeservableImpl implements StockOberservable{

        private int stockCount;
        private List<NotificationAlertObserver> observers;

        public IphoneObeservableImpl() {
            observers = new ArrayList<NotificationAlertObserver>();
        }

        @Override
        public void add(NotificationAlertObserver observer) {
            observers.add(observer);
        }

        @Override
        public void remove(NotificationAlertObserver observer) {
            observers.remove(observer);
        }

        @Override
        public void notifySubscriber() {
            for (NotificationAlertObserver observer : observers) {
                observer.update();
            }
        }

        @Override
        public void setStockCount(int newStockAdded) {
            this.stockCount = newStockAdded;
            notifySubscriber();
        }

        @Override
        public int getStockCount() {
            return this.stockCount;
        }

}
