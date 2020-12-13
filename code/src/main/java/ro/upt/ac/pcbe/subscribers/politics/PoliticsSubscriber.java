package ro.upt.ac.pcbe.subscribers.politics;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.politics.PoliticsTopic;
import ro.upt.ac.pcbe.subscribers.Registerable;
import ro.upt.ac.pcbe.sys.NewsSys;

public class PoliticsSubscriber extends Registerable {
    public PoliticsSubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(PoliticsTopic polTopic) {
        System.out.println("Politics topic received");
        polTopic.notifyInterest();
        System.out.println("Interested in " + polTopic.getClass().getName() + " : " + polTopic.getInterest());
        polTopic.printInfo();
    }
}
