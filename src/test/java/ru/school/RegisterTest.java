package ru.school;

import org.junit.jupiter.api.Test;
import ru.school.data.UserFactory;
import ru.school.models.RegisterUser;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class RegisterTest extends BaseTest {

    @Test
    void testSuccessRegistration() {

        RegisterUser user = UserFactory.validUser();

        registerPage.register(
                user.email(),
                user.password(),
                user.confirmPassword()
        );

        webdriver().shouldNotHave(urlContaining("/auth/register"));
    }
}
