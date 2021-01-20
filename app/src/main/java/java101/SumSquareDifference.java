package java101;

import java.util.ArrayList;
import java.util.List;


/**
 * The sum of the squares of the first ten natural numbers is, 385
 * The square of the sum of the first ten natural numbers is, 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {
    public long getDifferenceForNLength(int nthTerm){
        List<Integer> sequence = new ArrayList<>() {};
        List<Long> sequenceSqr = new ArrayList<>() {};

        for (int i = 1; i <= nthTerm ; i++) {
            sequence.add(i);
            sequenceSqr.add((long)Math.pow(i, 2));
        }

        Integer sequenceSum = sequence.stream().reduce(0, Integer::sum);
        Long sequenceSqrSum = sequenceSqr.stream().reduce(0L, Long::sum);

        long sequenceSumSqr = (long) Math.pow(sequenceSum, 2);

        return sequenceSumSqr - sequenceSqrSum;
    }
}
