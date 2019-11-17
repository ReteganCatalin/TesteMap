package Evals;

public class MULTIPLYMOD10 implements Expression {
    Expression expr1;
    Expression expr2;

    public MULTIPLYMOD10(Expression expr1,Expression expr2)
    {
        this.expr1=expr1;
        this.expr2=expr2;
    }

    public int eval()
    {
        return (expr1.eval()*expr2.eval())%10;
    }

    public String toString()
    {
        return expr1.toString()+" MUL10 "+expr2.toString()+" ";
    }
}
