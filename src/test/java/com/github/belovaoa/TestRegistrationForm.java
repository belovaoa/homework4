package com.github.belovaoa;

import org.junit.jupiter.api.Test;

public class TestRegistrationForm extends TestBase {

    @Test
    void fillFormTest() {

        registrationForm.openPage();
        registrationForm.inputFirstName("Name1")
                        .inputLastName("Last1")
                        .inputEmail("last1@ya.ru")
                        .chooseGender("Female")
                        .inputMobileNumber("7991977777")
                        .inputSubjects("Physics")
                        .chooseHobby("Sports")
                        .inputAddress("1Street 11")
                        .uploadFile("img/imade.jpg")
                        .inputState("NCR")
                        .inputCity("Delhi");
        registrationForm.calendar.setDate("10", "5", "2000");
        registrationForm.submit();

        registrationForm.verificationPopupName("Thanks for submitting the form");
        registrationForm.checkResultsValue("Student Name", "Name1 Last1")
                        .checkResultsValue("Student Email", "last1@ya.ru")
                        .checkResultsValue("Gender", "Female")
                        .checkResultsValue("Mobile", "7991977777")
                        .checkResultsValue("Date of Birth", "10 July,2000")
                        .checkResultsValue("Subjects", "Physics")
                        .checkResultsValue("Hobbies", "Sports")
                        .checkResultsValue("Picture", "imade.jpg")
                        .checkResultsValue("Address", "1Street 11")
                        .checkResultsValue("State and City", "NCR Delhi");
    }
}
