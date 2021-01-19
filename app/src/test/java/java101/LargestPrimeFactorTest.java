package java101;

import org.junit.Assert;
import org.junit.Test;

public class LargestPrimeFactorTest {
    @Test public void testGetLargestPrimeFactor_0() {
        var sut = new LargestPrimeFactor();

        var result = sut.getLargestPrimeFactor(0);

        Assert.assertEquals(0, result);
    }


    @Test public void testGetLargestPrimeFactor_1() {
        var sut = new LargestPrimeFactor();

        var result = sut.getLargestPrimeFactor(1);

        Assert.assertEquals(1, result);
    }

    @Test public void testGetLargestPrimeFactor_2() {
        var sut = new LargestPrimeFactor();

        var result = sut.getLargestPrimeFactor(2);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testGetLargestPrimeFactor_21() {
        var sut = new LargestPrimeFactor();

        var result = sut.getLargestPrimeFactor(21);

        Assert.assertEquals(7, result);
    }

    @Test
    public void testGetLargestPrimeFactor_13195() {
        var sut = new LargestPrimeFactor();

        var result = sut.getLargestPrimeFactor(13195);

        Assert.assertEquals(29, result);
    }

    @Test
    public void testGetLargestPrimeFactor_largeNumber() {
        var sut = new LargestPrimeFactor();

        var result = sut.getLargestPrimeFactor(600851475143L);

        Assert.assertEquals(6857, result);
    }
}