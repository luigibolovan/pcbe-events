package ro.upt.ac.pcbe.subscribers;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.Topic;

public class GenericSubscriber {

    @Subscribe
    public void subscribeTo(Topic generalTopic) {
        System.out.println("GeneralTopic topic received");
        generalTopic.notifyInterest();
        System.out.println("Interested in " + generalTopic.getClass().getName() + " : " + generalTopic.getInterest());
        generalTopic.printInfo();
    }
}
