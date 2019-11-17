package Evals;

import sun.management.VMOptionCompositeData;

public class ADDMOD10 implements Expression{
    Expression expr1;
    Expression expr2;
    public ADDMOD10(Expression expr1,Expression expr2)
    {
        this.expr1=expr1;
        this.expr2=expr2;
    }

    public int eval()
    {
        return (expr1.eval()+expr2.eval())% 10;
    }

    public String toString()
    {
        return expr1.toString()+ " ADD10 "+ expr2.toString()+" ";
    }

}
