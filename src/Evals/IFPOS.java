package Evals;

public class IFPOS implements  Expression{
    Expression expr1;
    Expression expr2;
    public IFPOS(Expression expr1,Expression expr2)
    {
        this.expr1=expr1;
        this.expr2=expr2;
    }
    public int eval()
    {
        if(expr1.eval()>=0)
        {
            return expr2.eval();
        }
        else
        {
            return new Absolute(expr1).eval();
        }
    }

    @Override
    public String toString() {
        return expr1.eval()+" IFPOS("+expr2.toString()+")";
    }
}
