package repository;

import model.User;

import java.util.List;

public interface UserRepository {
    void saveUser(User user);
    List<User> getUsers();
}