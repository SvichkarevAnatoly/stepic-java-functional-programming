class Main {
    //Stepik code: start
    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int a, int b, int c);
    }


    public static final TernaryIntPredicate allValuesAreDifferentPredicate =
            (a, b, c) -> !(a == b || b == c || a == c);
//Stepik code: end
}