import Editors.Editor;
import News.*;
import Subscriber.MultiHandlerSubscriber;
import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        EventBus eventBus = new EventBus();
        MultiHandlerSubscriber multiHandlerSubscriber = new MultiHandlerSubscriber(eventBus);

        Editor e1 = new Editor("Tavi", "Octavi");
        News n1 = new FootballNews(e1, "N1 content");
        News n2 = new FootballNews(e1, "N2 content");
        News n3 = new FootballNews(e1, "N3 content");
        News n4 = new FootballNews(e1, "N4 content");

        List<News> list = multiHandlerSubscriber.getNewsEvents();

        for (News news : list) {
            news.getNewsInfo();
        }

        e1.post(eventBus, n1);
        e1.post(eventBus, n2);
        e1.post(eventBus, n3);
        e1.post(eventBus, n4);

        List<News> list1 = multiHandlerSubscriber.getNewsEvents();

        for (News news : list1) {
            news.getNewsInfo();
            System.out.println("--------------------------");
        }

    }
}
