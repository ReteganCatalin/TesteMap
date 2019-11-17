package Evals;

public class Number implements Expression{
    int number;
    public Number(int Numb)
    {
        this.number= Numb;
    }

    public int eval()
    {
        return number;
    }

    public String toString()
    {
        return Integer.toString(number);
    }

}
