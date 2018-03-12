/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.math.BigInteger;

/**
 *
 * @author Crist
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger k = new BigInteger("50000");
        System.out.println(getFactorial(k));
    }

    public static BigInteger getFactorial(BigInteger num) {
        BigInteger fact = BigInteger.valueOf(1);
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }
        return fact;
    }

}
