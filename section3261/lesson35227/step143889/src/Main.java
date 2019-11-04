import java.util.stream.LongStream;

class Main {
//Stepik code: start

    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    public static boolean isPrime(final long number) {
        return LongStream.rangeClosed(2, number / 2)
                .noneMatch(x -> number % x == 0);
    }
//Stepik code: end
}