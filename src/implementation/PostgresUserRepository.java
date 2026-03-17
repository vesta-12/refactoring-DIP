package implementation;

import model.User;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class PostgresUserRepository implements UserRepository {
    private final List<User> users = new ArrayList<>();

    @Override
    public void saveUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " " + "saved to Postgres");
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users);
    }
}