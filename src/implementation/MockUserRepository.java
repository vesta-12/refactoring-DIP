package implementation;

import model.User;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class MockUserRepository implements UserRepository {
    private final List<User> users = new ArrayList<>();

    @Override
    public void saveUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " " + "saved to mock");
    }

    public List<User> getUsers() {
        return users;
    }
}