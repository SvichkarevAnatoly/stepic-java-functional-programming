import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

class Main {
    //Stepik code: start
    private static final Set<User> users = new HashSet<>();

    public static Optional<User> findUserByLogin(String login) {
        return users.stream()
                .filter(user -> user.getLogin().equals(login))
                .findFirst();
    }

//Stepik code: end

    /*Account (guid: UUID, balance: long)
User (login: String, account: Account)
*/
    private static class User {

        public String getLogin() {
            return null;
        }
    }
}