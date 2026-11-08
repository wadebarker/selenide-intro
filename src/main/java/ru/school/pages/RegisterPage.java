package ru.school.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.visible;

public class RegisterPage extends BasePage {

    // описание селекторов

    private final SelenideElement registerForm = $("form");

    private final SelenideElement emailInput = $("input[name='email']");

    private final SelenideElement passwordInput = $("input[name='password']");

    private final SelenideElement confirmPasswordInput = $("input[name='repeat']");

    private final SelenideElement registerButton = $("form button[type='submit']");

    private final SelenideElement resetButton = $("form button[type='reset']");

    // открытие страницы с формой регистрации

    public RegisterPage openRegisterPage() {
      open("/auth/register");
      registerForm.shouldBe(visible);
      return this;
    }

    // методы взаимодействия с элементаим в форме регистрации используя ранее объявленные селекторы

    public RegisterPage enterEmail(String emailValue) {
        type(emailInput, emailValue);
        return this;
    }

    public RegisterPage enterPassword(String passwodValue) {
        type(passwordInput, passwodValue);
        return this;
    }

    public RegisterPage enterConfirmPassword(String confirmPasswodValue) {
        type(confirmPasswordInput, confirmPasswodValue);
        return this;
    }

    public RegisterPage clickRegister() {
        click(registerButton);
        return this;
    }

    public RegisterPage clickReset() {
        click(resetButton);
        return this;
    }

    // заполнение input (полей ввода)

    public RegisterPage fillRegistrationForm(
            String email,
            String password,
            String confirmPassword
    ) {
        enterEmail(email);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);

        return this;
    }

    // submit формы (отправка формы)

    public RegisterPage register(
            String email,
            String password,
            String confirmPassword
    ) {
        fillRegistrationForm(email, password, confirmPassword);

        clickRegister();

        return this;
    }
}
