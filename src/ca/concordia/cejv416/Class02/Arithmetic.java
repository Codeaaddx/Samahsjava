package ca.concordia.cejv416.Class02;

import java.math.BigDecimal;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = a + b;
        //int d = a /b ;
        double e = 5.0 / 2;
        double f = (double)5 /2;
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);

        // to the power of (exponents)
        double p = Math.pow(2.0 , 2.0);
       System.out.println(p);

       double radius = 5.0;
       double circleArea = Math.pow(Math.PI * radius, 2.0);
       System.out.println(circleArea);

        BigDecimal costOfMeal = new BigDecimal( "22.99");
        costOfMeal = costOfMeal.add(new BigDecimal("1.0"));
        System.out.println(costOfMeal);

    }
}
