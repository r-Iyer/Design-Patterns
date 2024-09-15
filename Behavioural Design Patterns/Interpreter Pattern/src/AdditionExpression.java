public class AdditionExpression implements Expression{
    Expression left, right;

    @Override
    public int evaluateExpression() {
        return left.evaluateExpression() + right.evaluateExpression();
    }

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
