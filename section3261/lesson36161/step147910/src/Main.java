import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

class Main {
//Stepik code: start
    /**
     * The function accepts a list of mappers and returns an operator that accepts a list of integers
     * and sequentially applies each mapper to each value (perform a transformation)
     */
    public static final Function<List<IntUnaryOperator>, UnaryOperator<List<Integer>>> multifunctionalMapper =
            intUnaryOperators -> integers -> integers.stream()
                    .map(integer -> {
                        Integer result = integer;
                        for (IntUnaryOperator intUnaryOperator : intUnaryOperators) {
                            result = intUnaryOperator.applyAsInt(result);
                        }
                        return result;
                    })
                    .collect(Collectors.toList());

    /**
     * EXAMPLE: the operator transforms each number to the same number (perform the identity transformation)
     * <p>
     * It returns a list of the same numbers.
     */
    public static final UnaryOperator<List<Integer>> identityTransformation =
            multifunctionalMapper.apply(Arrays.asList(x -> x, x -> x, x -> x));

    /**
     * The operator accepts an integer list.
     * It multiplies by two each integer number and then add one to its.
     * <p>
     * The operator returns transformed integer list.
     */
    public static final UnaryOperator<List<Integer>> multTwoAndThenAddOneTransformation =
            multifunctionalMapper.apply(Arrays.asList(x -> 2 * x, x -> x + 1));

    /**
     * The operator accepts an integer list.
     * It squares each integer number and then get the next even number following it.
     * <p>
     * The operator returns transformed integer list.
     */
    public static final UnaryOperator<List<Integer>> squareAndThenGetNextEvenNumberTransformation =
            multifunctionalMapper.apply(Arrays.asList(x -> x * x, x -> x + (x % 2 == 0 ? 2 : 1)));
//Stepik code: end

    public static void main(String[] args) {
        System.out.println(identityTransformation.apply(Arrays.asList(1, 1, 1)));
        System.out.println(identityTransformation.apply(Arrays.asList(1, 2, 3)));

        System.out.println(multTwoAndThenAddOneTransformation.apply(Arrays.asList(1, 1, 1)));
        System.out.println(multTwoAndThenAddOneTransformation.apply(Arrays.asList(1, 2, 3)));

        System.out.println(squareAndThenGetNextEvenNumberTransformation.apply(Arrays.asList(1, 1, 1)));
        System.out.println(squareAndThenGetNextEvenNumberTransformation.apply(Arrays.asList(1, 2, 3)));
    }
}