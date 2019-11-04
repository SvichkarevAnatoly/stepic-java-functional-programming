import java.util.stream.LongStream;

class Main {
//Stepik code: start

    /**
     * Calculates the factorial of the given number n
     *
     * @param n >= 0
     * @return factorial value
     */
    public static long factorial(long n) {
        return LongStream.rangeClosed(2, n)
                .reduce(1, Math::multiplyExact);
    }
//Stepik code: end
}