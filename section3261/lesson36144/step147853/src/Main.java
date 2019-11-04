import java.util.stream.LongStream;

class Main {
//Stepik code: start

    /**
     * The method calculates the sum of odd numbers in the given range
     *
     * @param start of a range, start >= 0
     * @param end   of a range (inclusive), end >= start
     * @return sum of odd numbers
     */
    public static long sumOfOddNumbersInRange(long start, long end) {
        return LongStream.rangeClosed(start, end)
                .filter(x -> x % 2 == 1)
                .reduce(0, Long::sum);
    }
//Stepik code: end
}