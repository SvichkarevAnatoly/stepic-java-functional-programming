/**
 * The method represents a disjunct operator for a list of predicates.
 * For an empty list it returns the always false predicate.
 */
public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
    IntPredicate result = (x) -> false;
    for(IntPredicate predicate : predicates) {
        result = result.or(predicate);
    }
    return result;
}