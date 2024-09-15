public class MultiplierExpression implements Expression{
    Expression left, right;

    @Override
    public int evaluateExpression() {
        return left.evaluateExpression() * right.evaluateExpression();
    }

    public MultiplierExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
