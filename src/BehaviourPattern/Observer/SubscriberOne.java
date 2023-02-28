package BehaviourPattern.Observer;

public class SubscriberOne implements Subscriber{

    @Override
    public void message(String message) {
        System.out.println("SubscriberOne");
    }


}
