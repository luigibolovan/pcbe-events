package ro.upt.ac.pcbe.subscribers.sports;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.sports.FootballTopic;
import ro.upt.ac.pcbe.subscribers.Registrable;
import ro.upt.ac.pcbe.sys.NewsSys;

public class FootballSubscriber extends Registrable {

    public FootballSubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(FootballTopic football) {
        System.out.println("Football topic received");
        football.notifyInterest();
        System.out.println("Interested in " + football.getClass().getName() + " : " + football.getInterest());
        football.printInfo();
    }
}
