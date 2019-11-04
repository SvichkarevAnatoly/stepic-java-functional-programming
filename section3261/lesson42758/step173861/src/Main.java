import java.util.stream.LongStream;

class Main {
    //Stepik code: start
    public static LongStream createPrimesFilteringStream(long rangeBegin, long rangeEnd) {
        return LongStream.rangeClosed(rangeBegin, rangeEnd)
                .parallel()
                .filter(x -> NumberUtils.isPrime(x));
    }
//Stepik code: end
}