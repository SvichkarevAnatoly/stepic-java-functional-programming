import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

class Main {
//Stepik code: start
    /**
     * The operator combines all values in the given range into one value
     * using combiner and initial value (seed)
     */
    public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator =
            (seed, intBinaryOperator) -> (left, right) ->
                    IntStream.rangeClosed(left, right).reduce(seed, intBinaryOperator);

    /**
     * The operator calculates the sum in the given range (inclusively)
     */
    public static final IntBinaryOperator sumOperator = reduceIntOperator.apply(0, Integer::sum);

    /**
     * The operator calculates the product in the given range (inclusively)
     */
    public static final IntBinaryOperator productOperator = reduceIntOperator.apply(1,
            (left1, right1) -> left1 * right1);
//Stepik code: end

    public static void main(String[] args) {
        /*System.out.println(reduceIntOperator.apply(1, sumOperator).applyAsInt(1, 4));
        System.out.println(reduceIntOperator.apply(1, productOperator).applyAsInt(1, 4));

        System.out.println(reduceIntOperator.apply(1, sumOperator).applyAsInt(5, 6));
        System.out.println(reduceIntOperator.apply(1, productOperator).applyAsInt(5, 6));

        System.out.println(reduceIntOperator.apply(1, sumOperator).applyAsInt(0, 4));
        System.out.println(reduceIntOperator.apply(1, productOperator).applyAsInt(0, 4));*/

        System.out.println(sumOperator.applyAsInt(1, 4));
    }
}