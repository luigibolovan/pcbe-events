package ro.upt.ac.pcbe.subscribers.politics;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.politics.PoliticsUSA;
import ro.upt.ac.pcbe.subscribers.Registrable;
import ro.upt.ac.pcbe.sys.NewsSys;

public class PoliticsUSASubscriber extends Registrable {

    public PoliticsUSASubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(PoliticsUSA usaEvent) {
        System.out.println("PoliticsUSA topic received");
        usaEvent.notifyInterest();
        System.out.println("Interested in " + usaEvent.getClass().getName() + " : " + usaEvent.getInterest());
        usaEvent.printInfo();
    }
}
