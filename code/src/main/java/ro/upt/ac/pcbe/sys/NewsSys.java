package ro.upt.ac.pcbe.sys;

import com.google.common.eventbus.EventBus;
import ro.upt.ac.pcbe.news.Topic;
import ro.upt.ac.pcbe.subscribers.Registrable;

public class NewsSys {
    private final EventBus mNewsDispatcher;
    private NewsFakeDB mNewsDB;
    private int noOfSubscribers;

    public NewsSys() {
        this.mNewsDB = new NewsFakeDB();
        this.mNewsDispatcher = new EventBus("News Dispatcher");
    }

    public int getNoOfSubscribers() {
        return noOfSubscribers;
    }

    public void newTopic(Topic topic) {
        mNewsDB.addTopic(topic);
        mNewsDispatcher.post(topic);
    }

    public void updateTopic(int id, String content, String editor) {
        if (editor == null) {
            mNewsDB.updateTopic(id, content);
        } else {
            mNewsDB.updateTopic(id, content, editor);
        }
        mNewsDispatcher.post(mNewsDB.findTopicByID(id));
    }

    public void delete(int id) {
        mNewsDB.deleteTopic(mNewsDB.findTopicByID(id));
        mNewsDispatcher.post(mNewsDB.findTopicByID(id));
    }

    public void registerSubscriber(Registrable sub) {
        mNewsDispatcher.register(sub);
        noOfSubscribers++;
    }

    public void unregisterSubscriber(Registrable registrable) {
        mNewsDispatcher.unregister(registrable);
        noOfSubscribers--;
    }
}
