package News;

import Editors.Editor;

import java.time.LocalDateTime;


public class News {

    private static int instanceCount = 0;
    private int id;
    private Editor editor;
    private LocalDateTime dateOfPublishing;
    private LocalDateTime lastModificationDate;
    private String content;

    public News(Editor editor, String content){
        this.id = ++instanceCount;
        this.editor = editor;
        this.content = content;
        this.dateOfPublishing = LocalDateTime.now();
        this.lastModificationDate = LocalDateTime.now();
    }

    public void getNewsInfo(){
        System.out.println("Instance Count: " + News.instanceCount);
        System.out.println("Id: " + this.id);
        System.out.println("Editor: " + editor.getFirstName() + " " + editor.getLastName());
        System.out.println("Date of publishing: " + this.dateOfPublishing);
        System.out.println("Date of last modification: " + this.lastModificationDate);
        System.out.println("Content: " + this.content);
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
        this.lastModificationDate = LocalDateTime.now();
    }

    public void setContent(String content) {
        this.content = content;
        this.lastModificationDate = LocalDateTime.now();
    }

    public void delete(){
        this.editor = null;
        this.content = null;
        this.dateOfPublishing = null;
        this.lastModificationDate = LocalDateTime.now();
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getId() {
        return id;
    }

    public Editor getEditor() {
        return editor;
    }

    public LocalDateTime getDateOfPublishing() {
        return dateOfPublishing;
    }

    public LocalDateTime getLastModificationDate() {
        return lastModificationDate;
    }

    public String getContent() {
        return content;
    }
}
