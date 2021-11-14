package com.github.belovaoa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationForm {

    // locators or elements
    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            resultsTable = $(".table-responsive");

    // actions
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public RegistrationForm inputFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public void inputLastName(String value) {
        lastNameInput.setValue(value);
    }

    public RegistrationForm checkResultsValue(String key, String value) {
        resultsTable.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }
}
