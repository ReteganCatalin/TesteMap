package Evals;

public class IFNEG implements Expression {
    Expression expr1;
    Expression expr2;
    public IFNEG(Expression expr1,Expression expr2)
    {
        this.expr1=expr1;
        this.expr2=expr2;
    }

    public int eval()
    {
        if(expr1.eval()<0)
        {
            return expr2.eval();
        }
        return expr1.eval();
    }
    public String toString()
    {
        return expr1.toString()+" IFNEG( "+expr2.toString()+") ";
    }

}
