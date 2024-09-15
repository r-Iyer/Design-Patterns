public class VendingMachine {
    IState state;
    int stock;
    void setState(IState state) {
        this.state = state;
    }
    public VendingMachine(IState state) {
        this.state = state;
    }
    void getCurrentState() {
        state.printCurrentState();
    }
    void request() {
        state.handleRequest();
        if (state instanceof ReadyState) {
            if(this.stock == 0) {
                this.setState(new OutOfStockState());
            }
            else
                this.setState(new ProductSelectedState());
            this.request();
        }
        if (state instanceof ProductSelectedState) {
            this.setState(new PaymentPendingState());
            this.request();
        }
        if (state instanceof PaymentPendingState) {
            this.setState(new PaymentDoneState());
            this.request();
        }
        if (state instanceof PaymentDoneState) {
            this.stock--;
            this.setState(new ReadyState());
            System.out.println(this.stock);
            this.request();
        }
        if (state instanceof OutOfStockState) {
            this.setState(new ReadyState());
            this.request();
        }
    }
    public VendingMachine(int stock) {
        this.stock = stock;
        this.state = new ReadyState();
    }
}
