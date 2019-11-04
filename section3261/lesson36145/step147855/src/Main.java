import java.util.List;

class Main {
//Stepik code: start

    /**
     * Calculates the general sum of canceled transactions for all non empty accounts in the list
     */
    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> account.getBalance() > 0)
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState().equals(State.CANCELED))
                .mapToLong(Transaction::getSum)
                .sum();
    }

    //Stepik code: end
    private static class Account {
        public Long getBalance() {
            return null;
        }

        public List<Transaction> getTransactions() {
            return null;
        }
    }

    private static class Transaction {
        public State getState() {
            return null;
        }

        public Long getSum() {
            return null;
        }
    }

    private enum State {
        CANCELED
    }
}