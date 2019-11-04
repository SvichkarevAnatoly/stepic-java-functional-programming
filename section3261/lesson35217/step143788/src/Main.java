import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Main {
    //Stepik code: start
    public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
        return Arrays.stream(text.split(" "))
                .filter(badWords::contains)
                .distinct()
                .sorted();
    }
//Stepik code: end
}