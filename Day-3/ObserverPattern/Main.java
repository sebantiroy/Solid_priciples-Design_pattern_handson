package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		Publisher pub = new Publisher();
		SubscriberOne sub1 = new SubscriberOne(pub);
		SubscriberTwo sub2 = new SubscriberTwo(pub);
		SubscriberThree sub3 = new SubscriberThree(pub);
		
		System.out.println("First State: ");
		pub.notifyAllObservers(new Message("State of users changed"));
		
		pub.detach(sub3);
		System.out.println("Second State: ");
		pub.notifyAllObservers(new Message("State of users 1 and 2 changed"));
	}
}
