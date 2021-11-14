package com.github.belovaoa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationForm {

    // locators or elements
    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName");

    // actions
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public void inputFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void inputLastName(String value) {
        lastNameInput.setValue(value);
    }


}
