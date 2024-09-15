public class Document {
    String author;
    String content;
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
    public Document(String author, String content) {
        this.author = author;
        this.content = content;
    }
    public DocumentMemento createMemento() {
        return new DocumentMemento(this.author, this.content);
    }
    public void restoreMemento(DocumentMemento documentMemento) {
        this.author = documentMemento.getAuthor();
        this.content = documentMemento.getContent();
    }
    @Override
    public String toString() {
        return "Document [author=" + author + ", content=" + content + "]";
    }
}
