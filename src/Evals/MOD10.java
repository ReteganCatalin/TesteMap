package Evals;

public class MOD10 implements Expression {
    Expression expr1;
    public MOD10(Expression expr10)
    {
        this.expr1=expr10;
    }

    public int  eval()
    {
        return expr1.eval()%10;
    }

    public String toString()
    {
        return expr1.toString()+" MOD 10";
    }
}
