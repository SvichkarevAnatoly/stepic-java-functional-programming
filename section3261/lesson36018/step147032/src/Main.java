class Main {
//Stepik code: start
groupingBy(
        transaction -> transaction.getAccount().getNumber(),
        summingLong(Transaction::getSum)
)
//Stepik code: end
}