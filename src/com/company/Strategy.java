package com.company;

public class Strategy {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCompute(new Division());
       try {
           System.out.println(context.competeCompute(42, 0));
       }catch (ArithmeticException arithmeticException)
       {
           System.out.println("На ноль делить нельзя");

    }
    }
}

interface Compute{
    int complete(int a, int b);
}
class SumComp implements Compute{

    @Override
    public int complete(int a, int b) {
        System.out.println("Произошло сложение");
        return a + b;
    }
}

class Multiplication implements Compute{
    @Override
    public int complete(int a, int b) {
        System.out.println("Произошло умножение");
        return a * b;
    }

}class Division implements Compute {
    @Override
    public int complete(int a, int b) {
        System.out.println("Произошло деление");
        if (b == 0) {

            throw new ArithmeticException();
        }
        return a / b;
    }
}
 class Context{
        private Compute compute;
       public Context(){

        }

    public void setCompute(Compute compute) {
        this.compute = compute;
    }
    public int competeCompute(int a, int b){
           return compute.complete(a, b);
    }
}



