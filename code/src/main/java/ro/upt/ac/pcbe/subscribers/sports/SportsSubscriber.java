package ro.upt.ac.pcbe.subscribers.sports;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.sports.SportsTopic;
import ro.upt.ac.pcbe.subscribers.Registerable;
import ro.upt.ac.pcbe.sys.NewsSys;

public class SportsSubscriber extends Registerable {
    public SportsSubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(SportsTopic sportTopic) {
        System.out.println("Sport topic received");
        sportTopic.notifyInterest();
        System.out.println("Interested in this topic: " + sportTopic.getInterest());
        sportTopic.printInfo();
    }
}
