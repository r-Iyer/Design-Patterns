public class Singleton {
    int data;
    static Singleton singletonInstance = null;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new Singleton();
            return singletonInstance;
        }
        return singletonInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Singleton [data=" + data + "]";
    }

}
