package ro.upt.ac.pcbe.subscribers.sports;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.sports.TennisTopic;
import ro.upt.ac.pcbe.sys.NewsSys;

public class TennisSubscriber extends SportsSubscriber{

    public TennisSubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(TennisTopic tennis) {
        System.out.println("Tennis topic received");
        tennis.notifyInterest();
        System.out.println("Interested in " + tennis.getClass().getName() + " : " + tennis.getInterest());
        tennis.printInfo();
    }
}
