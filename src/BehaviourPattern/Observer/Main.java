package BehaviourPattern.Observer;

//https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/
public class Main {
    public static void main(String[] args){
        SubscriberOne subscriberOne = new SubscriberOne();
        SubscriberTwo subscriberTwo = new SubscriberTwo();

        PublisherOne publisherOne = new PublisherOne();
        publisherOne.addSubscriber(subscriberOne);
        publisherOne.addSubscriber(subscriberTwo);

        publisherOne.notifySubscriber("HI");

        publisherOne.removeSubscriber(subscriberOne);
        publisherOne.notifySubscriber("HI");

        publisherOne.removeSubscriber(subscriberTwo);
        publisherOne.notifySubscriber("HI");
    }

}
