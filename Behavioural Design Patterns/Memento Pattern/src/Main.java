public class Main {
    public static void main(String[] args) throws Exception {
        Document document = new Document("Rohit", "This is a new document");
        History history = new History();

        history.addMemento(document.createMemento());
        System.out.println(document.toString());

        document.setContent("Edited content");
        history.addMemento(document.createMemento());
        System.out.println(document.toString());

        document.setContent("More content");
        history.addMemento(document.createMemento());
        System.out.println(document.toString());

        document.restoreMemento(history.retrieveMemento(0));
        System.out.println(document.toString());

    }
}
