package Subscriber;

import News.*;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class MultiHandlerSubscriber {
    List<News> newsEvents = new ArrayList<News>();
    List<SportsNews> sportsNewsEvents = new ArrayList<SportsNews>();


    public MultiHandlerSubscriber(EventBus eventBus){
        eventBus.register(this);
    }

    @Subscribe
    public void handleSportNewsEvents(SportsNews event){
        sportsNewsEvents.add(event);
    }

    @Subscribe
    public void handleNewsEvents(News event){
        newsEvents.add(event);
    }

}
