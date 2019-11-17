package Evals;

public class Maximum implements Expression {
    Expression expr1;
    Expression expr2;
    public Maximum(Expression expr1,Expression expr2)
    {
        this.expr1=expr1;
        this.expr2=expr2;
    }
    public int eval()
    {
        if(expr1.eval()<expr2.eval())
        {
            return expr1.eval();
        }
        return expr2.eval();
    }

    public String toString()
    {
        return "("+expr1.toString()+") MAX ("+expr2.toString()+")";
    }
}
