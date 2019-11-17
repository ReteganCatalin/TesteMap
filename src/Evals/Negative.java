package Evals;

public class Negative implements Expression {
    Expression expr1;
    public Negative(Expression expr1)
    {
        this.expr1=expr1;
    }
    public int eval()
    {
        return expr1.eval()*-1;
    }
    public String toString()
    {
        return "NG "+expr1.toString();
    }

}
