package ru.school.data;

import net.datafaker.Faker;
import ru.school.models.RegisterUser;

import java.util.UUID;

public class UserFactory {
    private static final Faker faker = new Faker();

    public static RegisterUser validUser() {
        String email = uniqueEmail();
        String password = validPassword();

        return new RegisterUser(
                email,
                password,
                password
        );
    }

    public static String uniqueEmail() {
        return "user-" +
                UUID.randomUUID()
                        .toString()
                        .substring(0, 13)
                + "@mail.ru";
    }

    public static String validPassword() {
        return faker.internet().password(10, 20);
    }
}
