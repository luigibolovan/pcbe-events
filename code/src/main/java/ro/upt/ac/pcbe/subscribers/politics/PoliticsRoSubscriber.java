package ro.upt.ac.pcbe.subscribers.politics;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.politics.PoliticsRo;
import ro.upt.ac.pcbe.subscribers.Registrable;
import ro.upt.ac.pcbe.sys.NewsSys;

public class PoliticsRoSubscriber extends Registrable {

    public PoliticsRoSubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(PoliticsRo roEvent) {
        System.out.println("PoliticsRO topic received");
        roEvent.notifyInterest();
        System.out.println("Interested in " + roEvent.getClass().getName() + " : " + roEvent.getInterest());
        roEvent.printInfo();
    }
}
