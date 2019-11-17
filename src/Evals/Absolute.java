package Evals;

public class Absolute implements Expression {
    Expression expr1;
    public Absolute(Expression expr1)
    {
        this.expr1=expr1;
    }

    public int eval()
    {
        if(expr1.eval()>=0)
            return expr1.eval();
        else
            return expr1.eval()*-1;
    }

    public String toString()
    {
        return "ABS("+expr1.eval()+")";
    }
}
