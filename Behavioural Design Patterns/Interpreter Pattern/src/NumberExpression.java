public class NumberExpression implements Expression{
    int number;
    @Override
    public int evaluateExpression() {
        return this.number;
    }
    public NumberExpression(int number) {
        this.number = number;
    }

}
