package com.company;

public class Proxy {

    public static void main(String[] args) {
        SumProxy sumProxy = new SumProxy();
        System.out.println(sumProxy.compute(1.0, 1.0));
    }

}
interface Math<T,T1>{
    T1 compute(T i, T i2);
}

class Sum implements Math<Double, Double>{

    @Override
    public Double compute(Double i, Double i2) {
        return i + i2;
    }
}
class SumProxy implements Math<Double, Double>{
private  Sum sum;



    @Override
    public Double compute(Double i, Double i2) {
    launch();
    return java.lang.Math.sqrt(sum.compute(i, i2)) ;
    }
private void launch(){
        if (sum == null){
            sum = new Sum();
        }
}
 }

 class SumReference implements Math<Double,Double>{
    private Sum sum;

     Math<Double, Double> math = Double::sum;
     @Override
     public Double compute(Double i, Double i2) {
         launch();
         return i + i2 ;
     }
     private void launch(){
         if (sum == null){
             sum = new Sum();
         }
     }

 }

