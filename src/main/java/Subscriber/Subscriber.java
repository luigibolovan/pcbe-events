package Subscriber;

import News.*;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    private List<SportsNews> newsEvents = new ArrayList<SportsNews>();
    private List<PoliticalNews> politicalNewsEvent = new ArrayList<PoliticalNews>();

    public Subscriber(EventBus eventBus){
        eventBus.register(this);
    }

    @Subscribe
    public void handleNewsEvents(SportsNews event){
        newsEvents.add(event);
    }

    @Subscribe
    public void handlePoliticalEvents(PoliticalNews event){
        politicalNewsEvent.add(event);
    }

    public List<SportsNews> getNewsEvents() {
        return newsEvents;
    }

    public List<PoliticalNews> getPoliticalNewsEvent() {
        return politicalNewsEvent;
    }
}
