package BehaviourPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherOne implements Publisher{

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String message) {
        for(Subscriber subscriber :  subscribers){
            subscriber.message(message);
        }
    }

}
