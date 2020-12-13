package ro.upt.ac.pcbe;

import ro.upt.ac.pcbe.editors.NewsEditor;
import ro.upt.ac.pcbe.news.sports.BasketballTopic;
import ro.upt.ac.pcbe.news.sports.FootballTopic;
import ro.upt.ac.pcbe.subscribers.sports.FootballSubscriber;
import ro.upt.ac.pcbe.subscribers.sports.SportsSubscriber;
import ro.upt.ac.pcbe.sys.NewsSys;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        NewsSys mNewsSys = new NewsSys();

        NewsEditor editor1 = new NewsEditor("Luigi", mNewsSys);
        NewsEditor editor2 = new NewsEditor("Bogdan", mNewsSys);

        FootballSubscriber footballSubscriber = new FootballSubscriber(mNewsSys);
        footballSubscriber.register();

        SportsSubscriber basktetballSubscriber = new SportsSubscriber(mNewsSys);
        basktetballSubscriber.register();

        editor1.postTopic(new FootballTopic(), "ACS Recas nu e POLI");
        Thread.sleep(5000);
        editor1.updateTopic(1, "FCSB nu e Steaua Bucuresti");

        editor2.postTopic(new BasketballTopic(), "Energia Rovinari e top 5 in RO");

        System.out.println("No of subscribers:" + mNewsSys.getNoOfSubscribers());

        basktetballSubscriber.unregister();

        System.out.println("No of subscribers:" + mNewsSys.getNoOfSubscribers());

    }

}
