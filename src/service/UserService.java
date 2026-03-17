package service;

import model.User;
import repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("error - empty field");
            return;
        }

        User user = new User(name);
        userRepository.saveUser(user);
        System.out.println("registered successfully!");
    }
    public void showUsers() {
        List<User> users = userRepository.getUsers();

        if (users.isEmpty()) {
            System.out.println("no found");
            return;
        }

        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}