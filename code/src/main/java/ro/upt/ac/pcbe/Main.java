package ro.upt.ac.pcbe;

import ro.upt.ac.pcbe.editors.NewsEditor;
import ro.upt.ac.pcbe.news.politics.*;
import ro.upt.ac.pcbe.news.sports.*;
import ro.upt.ac.pcbe.subscribers.GenericSubscriber;
import ro.upt.ac.pcbe.subscribers.sports.FootballSubscriber;
import ro.upt.ac.pcbe.subscribers.sports.SportsSubscriber;
import ro.upt.ac.pcbe.sys.NewsSys;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        NewsSys mNewsSys = new NewsSys();

        NewsEditor editor1 = new NewsEditor("Luigi", mNewsSys);
        NewsEditor editor2 = new NewsEditor("Bogdan", mNewsSys);
        NewsEditor editor3 = new NewsEditor("Liana", mNewsSys);
        NewsEditor editor4 = new NewsEditor("Isabella", mNewsSys);

        FootballSubscriber footballSubscriber = new FootballSubscriber(mNewsSys);
        footballSubscriber.register();

        SportsSubscriber sportsSubscriber = new SportsSubscriber(mNewsSys);
        sportsSubscriber.register();

        GenericSubscriber genericSubscriber = new GenericSubscriber(mNewsSys);
        genericSubscriber.register();

        editor1.postTopic(new FootballTopic(), "ACS Recas nu e POLI");
        System.out.println("Updating first topic...");Thread.sleep(3000);
        editor1.updateTopic(1, "FCSB nu e Steaua Bucuresti");

        editor2.postTopic(new BasketballTopic(), "U BT Cluj e liderul ligii nationale");
        editor3.postTopic(new PoliticsUSA(), "Donald Trump nu mai e presedintele SUA");
        editor4.postTopic(new PoliticsRo(), "AUR a obtinut 9% la alegerile parlamentare 2020");


        System.out.println("No of subscribers in news system:" + mNewsSys.getNoOfSubscribers());
        sportsSubscriber.unregister();
        System.out.println("No of subscribers in news system:" + mNewsSys.getNoOfSubscribers());
    }

}
