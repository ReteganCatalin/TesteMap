package Repository;

import Evals.Expression;

public class Repository  implements IRepository{
    Expression expr;

    public Repository(Expression expr) {
        this.expr = expr;
    }

    public int Result()
    {
        return expr.eval();
    }
    public String Print()
    {
        return expr.toString();
    }
}
