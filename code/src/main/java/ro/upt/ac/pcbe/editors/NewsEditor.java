package ro.upt.ac.pcbe.editors;

import ro.upt.ac.pcbe.news.Topic;
import ro.upt.ac.pcbe.sys.NewsSys;

public class NewsEditor {
    private String name;
    private NewsSys mNewsSys;

    public NewsEditor(String name, NewsSys sys) {
        this.name = name;
        mNewsSys = sys;
    }

    public void postTopic(Topic topicToBePosted, String content) {
        topicToBePosted.setContent(content);
        topicToBePosted.setEditorName(name);
        mNewsSys.newTopic(topicToBePosted);
    }

    public void updateTopic(int id, String content) {
        mNewsSys.updateTopic(id, content, this.name);
    }

    public void deleteTopic(int id) {
        mNewsSys.delete(id);
    }
}
