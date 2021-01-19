package java101;

import java.util.ArrayList;
import java.util.List;


/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {
    // for numbers less than 9,223,372,036,854,775,808
    public long getLargestPrimeFactor(long number) {
        List<Long> primeFactorList = new ArrayList<>() {};

        long workingNumber = number;
        for (long possibleDivisor = 1; possibleDivisor <= workingNumber; possibleDivisor++) {
            if(!isPrime(possibleDivisor)) continue;
            if(!isDivisible(number, possibleDivisor)) continue;

            primeFactorList.add(possibleDivisor);

            // divide the working number by a known prime to reduce the execution time
            workingNumber = workingNumber / possibleDivisor;
        }

        return findMaxNumber(primeFactorList);
    }

    static long findMaxNumber(List<Long> numberList)
    {
        long maxNumber = 0;

        for (Long number : numberList)
            if (number > maxNumber)
                maxNumber = number;

        return maxNumber;
    }

    private boolean isDivisible(long number, long divisor) {
        return number % divisor == 0;
    }

    private boolean isPrime(long number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; ++i) {
            // condition for non-prime number
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
