package ro.upt.ac.pcbe.sys;

import ro.upt.ac.pcbe.news.Topic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class NewsFakeDB {
    List<Topic> topics = new ArrayList<>();

    void addTopic(Topic topic) {
        topics.add(topic);
    }

    void deleteTopic(Topic topic) {
        topic.removeContent();
        topics.remove(topic);
    }

    Topic findTopicByID(int id) {
        for (Topic t : topics) {
            if (id == t.getID()) {
                return t;
            }
        }
        return null;
    }

    void updateTopic(int id, String content) {
        Topic foundTopic = findTopicByID(id);
        if (foundTopic != null) {
            foundTopic.updateDate(new Date(System.currentTimeMillis()));
            foundTopic.updateContent(content);
        } else {
            throw new NullPointerException("No topic with id " + id + "found");
        }
    }

    void updateTopic(int id, String content, String editor) {
        Topic foundTopic = findTopicByID(id);
        if (foundTopic != null) {
            foundTopic.updateDate(new Date(System.currentTimeMillis()));
            foundTopic.updateContent(content);
            foundTopic.updateEditor(editor);
        } else {
            throw new NullPointerException("No topic with id " + id + "found");
        }
    }
}
