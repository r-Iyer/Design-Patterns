public class DocumentMemento {
    String author;
    String content;
    //Here we do not store the entire Document object as we only wish
    //to store the state of the contents of document in the memento
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public DocumentMemento(String author, String content) {
        this.author = author;
        this.content = content;
    }
}
