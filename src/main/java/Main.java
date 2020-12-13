import Editors.Editor;
import News.*;
import Subscriber.Subscriber;
import com.google.common.eventbus.EventBus;

import java.util.List;

public class Main {
    public static void main(String[] args){
        EventBus eventBus = new EventBus();
        Subscriber subscriber = new Subscriber(eventBus);

        Editor e1 = new Editor("Tavi", "Octavi");
        News n1 = new F1News(e1, "N1 content");
        SportsNews n2 = new FootballNews(e1, "N2 content");
        SportsNews n3 = new FootballNews(e1, "N3 content");
        SportsNews n4 = new FootballNews(e1, "N4 content");

        SportsNews sn1 = new FootballNews(e1, "NS1 content");
        FootballNews fn1 = new FootballNews(e1, "fn1 content");

        PoliticalNews pn1 = new PoliticalNews(e1, "pn1 content");
        PoliticalNews pn2 = new PoliticalNews(e1, "pn2 content");


        e1.post(eventBus, n1);
        e1.post(eventBus, n2);
        e1.post(eventBus, n3);
        e1.post(eventBus, n4);

        e1.post(eventBus, sn1);
        e1.post(eventBus, fn1);
        e1.post(eventBus, pn1);
        e1.post(eventBus, pn2);

        List<SportsNews> list = subscriber.getNewsEvents();

        for (News news: list
             ) {
            news.getNewsInfo();
        }

        System.out.println("#########################################");

        List<PoliticalNews> pList = subscriber.getPoliticalNewsEvent();

        for (News news :
                pList) {
            news.getNewsInfo();
        }
    }
}
