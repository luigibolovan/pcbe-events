package ro.upt.ac.pcbe.news;

import java.util.Date;

public abstract class Topic {
    protected static int ID;
    protected int currentID;
    protected String editorName;
    protected Date creationDate;
    protected Date lastModifiedDate;
    protected String content;

    public Topic() {
        ID++;
        currentID = ID;
        creationDate = new Date(System.currentTimeMillis());
        lastModifiedDate = creationDate;
    }

    public int getID() {
        return currentID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public void updateEditor(String newEditor) {
        editorName = newEditor;
    }

    public void updateContent(String content) {
        this.content = content;
    }

    public void updateDate(Date date) {
        lastModifiedDate = date;
    }

    public void removeContent() {
        creationDate = null;
        editorName = null;
        content = null;
    }

    protected boolean isNew() {
        return creationDate.equals(lastModifiedDate);
    }

    public void printInfo() {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("ID: " + currentID);
        System.out.println("Editor name: " + editorName);
        System.out.println("Creation date: " + creationDate.toString());
        System.out.println("Last modified date: " + lastModifiedDate.toString());
        System.out.println("Content:" + content);
        System.out.println("----------------------------------------");
        System.out.println();
    }

    public abstract void notifyInterest();

    public abstract int getInterest();
}
