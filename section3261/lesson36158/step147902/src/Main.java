import java.util.stream.IntStream;

class Main {
    //Stepik code: start
    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream)
                .filter(x -> x % 15 == 0)
                .sorted()
                .skip(2);
    }
//Stepik code: end
}