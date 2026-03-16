package app;

import repository.UserRepository;
import implementation.MockUserRepository;
import implementation.MongoUserRepository;
import implementation.MySQLUserRepository;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        UserRepository mysqlRepository = new MySQLUserRepository();
        UserService mysqlService = new UserService(mysqlRepository);
        mysqlService.registerUser("Sofiya");

        System.out.println();

        UserRepository mongoRepository = new MongoUserRepository();
        UserService mongoService = new UserService(mongoRepository);
        mongoService.registerUser("Yevgenii");

        System.out.println();

        UserRepository mockRepository = new MockUserRepository();
        UserService mockService = new UserService(mockRepository);
        mockService.registerUser("Darya");
    }
}