package java101;

import org.junit.Assert;
import org.junit.Test;

public class EvenFibonacciNumbersTest {
    @Test public void testFibonacci_1() {
        EvenFibonacciNumbers classUnderTest = new EvenFibonacciNumbers();
        Assert.assertEquals(0, classUnderTest.getSumOfEvenFibonacciSequenceTerms(1));
    }

    @Test public void testFibonacci_2() {
        EvenFibonacciNumbers classUnderTest = new EvenFibonacciNumbers();
        Assert.assertEquals(2, classUnderTest.getSumOfEvenFibonacciSequenceTerms(2));
    }

    @Test public void testFibonacci_90() {
        EvenFibonacciNumbers classUnderTest = new EvenFibonacciNumbers();
        // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
        //    ^        ^           ^          = 44
        Assert.assertEquals(44, classUnderTest.getSumOfEvenFibonacciSequenceTerms(90));
    }

    @Test public void testFibonacci_4mil() {
        EvenFibonacciNumbers classUnderTest = new EvenFibonacciNumbers();
        Assert.assertEquals(4613732, classUnderTest.getSumOfEvenFibonacciSequenceTerms(4000000));
    }
}