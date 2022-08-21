package stepic.functional_programming.Ex6_1;

import java.util.stream.Stream;

final class Utils {
    public static void main(String[] args) {
        Utils.generateUsers(3).forEach(user-> System.out.println(user.getId()+" "+user.getEmail()));
    }

    private Utils() { }

    public static Stream<User> generateUsers(int numberOfUsers) {
        // write your code here
        return Stream.iterate(1, n -> n < numberOfUsers, n -> n + 1)
                .map(n -> new User(n, String.format("user%s@gmail.com", n)));
    }
}

class User {
    private final long id;
    private final String email;

    User(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
