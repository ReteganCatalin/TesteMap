package View;

import Controller.Controller;
import Evals.*;
import Evals.Number;
import Repository.IRepository;
import Repository.Repository;

public class Main {
    public static void main(String args[])
    {
        Expression expr1=new  IFNEG(new Number(-20),new  IFPOS(new Number(-2),new Number(-28)));
        Expression expr2=new  IFNEG(new Number(-20),new  IFNEG(new Number(-2),new Absolute(new Number(-28))));
        Expression expr3=new Minimum(new Maximum(new Number(-22),new Number(10)),new Maximum(new Negative(new Number(22)),new Number(2)));
        Expression expr4=new ADDMOD10(new MULTIPLYMOD10(new Number(10),new Number(19)),new MOD10(new Number(5)));
        IRepository repo=new  Repository(expr4);
        Controller ctrl=new Controller(repo);
        System.out.print(ctrl.Print()+"\n");
        System.out.print(Integer.toString(ctrl.Result()));
    }
}
