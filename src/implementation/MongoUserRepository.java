package implementation;

import model.User;
import repository.UserRepository;

public class MongoUserRepository implements UserRepository {

    @Override
    public void saveUser(User user) {
        System.out.println(user.getName() + " " + "saved to MongoDB");
    }
}