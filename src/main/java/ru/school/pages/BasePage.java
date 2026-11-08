package ru.school.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.visible;

public abstract class BasePage {

    protected void openPage(String path) {
        open(path);
    }

    protected void type(SelenideElement element, String text) {
        element.shouldBe(visible).setValue(text);
    }

    protected void clear(SelenideElement element) {
        element.shouldBe(visible).clear();
    }

    protected void click(SelenideElement element) {
        element.shouldBe(visible).click();
    }

    protected boolean isVisible(SelenideElement element) {
        return element.isDisplayed();
    }

    protected String getText(SelenideElement element) {
        return element.shouldBe(visible).getText();
    }
}
