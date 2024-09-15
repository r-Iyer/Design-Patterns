import java.util.LinkedList;
import java.util.List;

public class History {
    List<DocumentMemento> documentMementos = new LinkedList<>();
    void addMemento(DocumentMemento documentMemento) {
        documentMementos.add(documentMemento);
    }
    DocumentMemento retrieveMemento(int index) {
        if(index<documentMementos.size())
            return documentMementos.get(index);
        else   
            return null;
    }
}
