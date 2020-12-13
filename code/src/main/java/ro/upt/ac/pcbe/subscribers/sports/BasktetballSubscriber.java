package ro.upt.ac.pcbe.subscribers.sports;

import com.google.common.eventbus.Subscribe;
import ro.upt.ac.pcbe.news.sports.BasketballTopic;
import ro.upt.ac.pcbe.sys.NewsSys;

public class BasktetballSubscriber extends SportsSubscriber {

    public BasktetballSubscriber(NewsSys sys) {
        super(sys);
    }

    @Subscribe
    public void subscribeTo(BasketballTopic basket) {
        System.out.println("Basketball topic received");
        basket.notifyInterest();
        System.out.println("Interested in this topic: " + basket.getInterest());
        basket.printInfo();
    }
}
