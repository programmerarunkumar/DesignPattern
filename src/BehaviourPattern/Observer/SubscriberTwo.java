package BehaviourPattern.Observer;

public class SubscriberTwo implements Subscriber{

    @Override
    public void message(String message) {
        System.out.println("SubscriberTwo");
    }

}
