package java101;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumSquareDifferenceTest {

    @Test
    public void getDifferenceForNLength_lengthOf_0() {
        var sut = new SumSquareDifference();

        long result = sut.getDifferenceForNLength(0);

        assertEquals(0, result);
    }

    @Test
    public void getDifferenceForNLength_lengthOf_1() {
        var sut = new SumSquareDifference();

        long result = sut.getDifferenceForNLength(1);

        long sqrSum = 1;
        long sumSqr = 1;

        assertEquals(sqrSum - sumSqr, result);
    }

    @Test
    public void getDifferenceForNLength_lengthOf_2() {
        var sut = new SumSquareDifference();

        long result = sut.getDifferenceForNLength(2);

        long sqrSum = 1 + 4;
        long sumSqr = (1 + 2) ^ 2;

        assertEquals(sqrSum - sumSqr, result);
    }

    @Test
    public void getDifferenceForNLength_lengthOf_10() {
        var sut = new SumSquareDifference();

        long result = sut.getDifferenceForNLength(10);

        assertEquals(2640, result);
    }

    @Test
    public void getDifferenceForNLength_lengthOf_100() {
        var sut = new SumSquareDifference();

        long result = sut.getDifferenceForNLength(100);

        assertEquals(25164150, result);
    }
}