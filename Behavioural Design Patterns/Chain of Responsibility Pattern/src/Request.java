public class Request {
    PriorityType priorityType;

    public PriorityType getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(PriorityType priorityType) {
        this.priorityType = priorityType;
    }

    public Request(PriorityType priorityType) {
        this.priorityType = priorityType;
    }
    
}
