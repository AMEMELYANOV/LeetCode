package stepic.functional_programming;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

class FindUserQuiz {

    public static void main(String[] args) {
        Account account1 = new Account("Account1");
        Account account2 = new Account("Account2");
        Account account3 = new Account("Account3");
        Set usersSet = new HashSet();
        usersSet.add(new User("User1", account1));
        usersSet.add(new User("User2", account2));
        usersSet.add(new User("User3", account3));
        System.out.println(FindUserQuiz.findUserByAccountId(usersSet, "Account1"));//return Optional user object
        System.out.println(FindUserQuiz.findUserByAccountId(usersSet, "Account22"));//return Optional.empty
    }

    public static Optional<User> findUserByAccountId(Set<User> users, String id) {
        // write your code here
        for (User user : users) {
            if (user.getAccount().isPresent() && user.getAccount().get().getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}


class Account {
    private final String id;

    public Account(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class User {
    private final String login;
    private final Account account;

    public User(String login, Account account) {
        this.login = login;
        this.account = account;
    }

    public String getLogin() {
        return login;
    }

    public Optional<Account> getAccount() {
        return Optional.ofNullable(account);
    }
}