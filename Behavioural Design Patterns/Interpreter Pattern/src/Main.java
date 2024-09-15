public class Main {
    public static void main(String[] args) throws Exception {
        //Evaluate the expression (2+(5*4))
        Expression expression = new AdditionExpression(new NumberExpression(2),
            new MultiplierExpression(new NumberExpression(5), new NumberExpression(4)));
        System.out.println("Evaluating (2+(5*4)) = " + expression.evaluateExpression());
    }
}
