package Editors;

import News.News;
import com.google.common.eventbus.EventBus;

public class Editor {
    private String firstName;
    private String lastName;

    public Editor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void post(EventBus eventBus, News news){
        eventBus.post(news);
    }

    public void update(EventBus eventBus, News news ,String newContent){
        news.setContent(newContent);
        eventBus.post(news);
    }

    public void delete(EventBus eventBus, News news){
        news.delete();
        eventBus.post(news);
    }

}
