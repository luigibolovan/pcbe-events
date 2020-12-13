package ro.upt.ac.pcbe.subscribers.politics;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.politics.PoliticsUE;
import ro.upt.ac.pcbe.subscribers.Registrable;
import ro.upt.ac.pcbe.sys.NewsSys;

public class PoliticsUESubscriber extends Registrable {

    public PoliticsUESubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(PoliticsUE ueEvent) {
        System.out.println("PoliticsUE topic received");
        ueEvent.notifyInterest();
        System.out.println("Interested in " + ueEvent.getClass().getName() + " : " + ueEvent.getInterest());
        ueEvent.printInfo();
    }
}
