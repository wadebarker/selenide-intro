package ru.school;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.school.config.TestConfig;
import ru.school.pages.RegisterPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public abstract class BaseTest {

    protected RegisterPage registerPage;

    @BeforeAll
    static void configureBrowser() {
        Configuration.baseUrl = TestConfig.BASE_URL;
        Configuration.browser = TestConfig.BROWSER;
        Configuration.browserSize = "1920×1080";
        Configuration.headless = TestConfig.HEADLESS;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    void setUp() {
        registerPage = new RegisterPage();
        registerPage.openRegisterPage();
    }

    @AfterAll
    void tearDown() {
        closeWebDriver();
    }
}
