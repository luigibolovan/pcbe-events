package ro.upt.ac.pcbe.subscribers;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.Topic;

public class GenericSubscriber {

    @Subscribe
    public void subscribeTo(Topic generalTopic) {
        generalTopic.printInfo();
    }
}
