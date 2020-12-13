package ro.upt.ac.pcbe.subscribers.politics;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.politics.PoliticsUSA;
import ro.upt.ac.pcbe.sys.NewsSys;

public class PoliticsUSASubscriber extends PoliticsSubscriber {

    public PoliticsUSASubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(PoliticsUSA usaEvent) {
        usaEvent.printInfo();
    }
}
