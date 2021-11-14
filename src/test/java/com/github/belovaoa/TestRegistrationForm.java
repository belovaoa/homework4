package com.github.belovaoa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TestRegistrationForm extends TestBase {

    @Test
    void fillFormTest() {

        registrationForm.openPage();

        registrationForm.inputFirstName("Name1")
                        .inputLastName("Last1");

        $("#lastName").setValue("Last1");
        $("#userEmail").setValue("last1@ya.ru");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("7991977777");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("5");
        $(".react-datepicker__year-select").selectOptionByValue("2000");
        $(".react-datepicker__day--010:not(.react-datepicker__day--outside-month)").click();

        $("#subjectsInput").setValue("Physics").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();

        $("#uploadPicture").uploadFromClasspath("img/imade.jpg");

        $("#currentAddress").setValue("1Street 11");


        $("#state").click();
        $(byText("NCR")).click();

        $("#city").click();
        $(byText("Delhi")).click();

        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Name1 Last1"),
                text("last1@ya.ru"), text("Female"), text("7991977777"),
                text("10 June,2000"), text("Physics"), text("Sports"),
                text("imade.jpg"), text("1Street 11"), text("NCR Delhi"));
        registrationForm.checkResultsValue("Student Name", "Name1 Last1")
                        .checkResultsValue("Email", "last1@ya.ru");

    }
}
