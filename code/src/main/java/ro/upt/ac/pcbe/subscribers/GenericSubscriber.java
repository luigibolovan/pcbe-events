package ro.upt.ac.pcbe.subscribers;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.Topic;
import ro.upt.ac.pcbe.sys.NewsSys;

public class GenericSubscriber extends Registrable {

    public GenericSubscriber(NewsSys sys) {
        super(sys);
    }


    @Subscribe
    public void subscribeTo(Topic generalTopic) {
        System.out.println("GeneralTopic topic received");
        generalTopic.notifyInterest();
        System.out.println("Interested in " + generalTopic.getClass().getName() + " : " + generalTopic.getInterest());
        generalTopic.printInfo();
    }
}
