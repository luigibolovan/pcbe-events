package ro.upt.ac.pcbe.subscribers.politics;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.politics.PoliticsUE;
import ro.upt.ac.pcbe.sys.NewsSys;

public class PoliticsUESubscriber extends PoliticsSubscriber {

    public PoliticsUESubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(PoliticsUE ueEvent) {
        ueEvent.printInfo();
    }
}
