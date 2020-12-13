package ro.upt.ac.pcbe.subscribers.politics;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.politics.PoliticsRo;
import ro.upt.ac.pcbe.sys.NewsSys;

public class PoliticsRoSubscriber extends PoliticsSubscriber {

    public PoliticsRoSubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(PoliticsRo roEvent) {
        roEvent.printInfo();
    }
}
