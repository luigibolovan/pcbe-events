package Subscriber;

import News.*;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class MultiHandlerSubscriber {
    private List<News> newsEvents = new ArrayList<News>();

    public MultiHandlerSubscriber(EventBus eventBus){
        eventBus.register(this);
    }

    @Subscribe
    public void handleNewsEvents(News event){
        newsEvents.add(event);
    }

    public List<News> getNewsEvents() {
        return newsEvents;
    }
}
