import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

class Main {
    //Stepik code: start
    public static void printBalanceIfNotEmpty(String userLogin) {
        findUserByLogin(userLogin)
                .map(User::getAccount)
                .map(Account::getBalance)
                .filter(balance -> balance > 0)
                .ifPresent(balance -> System.out.printf("%s: %d", userLogin, balance));
    }

    //Stepik code: end
    private static final Set<User> users = new HashSet<>();

    public static Optional<User> findUserByLogin(String login) {
        return users.stream()
                .filter(user -> user.getLogin().equals(login))
                .findFirst();
    }

    /*Account (guid: UUID, balance: long)
    User (login: String, account: Account)
    */
    private static class User {

        public String getLogin() {
            return null;
        }

        public Account getAccount() {
            return null;
        }
    }

    private static class Account {
        public long getBalance() {
            return 0;
        }
    }
}