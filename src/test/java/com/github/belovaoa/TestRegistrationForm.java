package com.github.belovaoa;

import org.junit.jupiter.api.Test;

import static com.github.belovaoa.pages.TestData.*;

public class TestRegistrationForm extends TestBase{


    @Test
    void fillFormTest() {

        registrationForm.openPage();
        registrationForm.inputFirstName()
                        .inputLastName()
                        .inputEmail()
                        .chooseGender("Female")
                        .inputMobileNumber()
                        .inputSubjects("Physics")
                        .chooseHobby("Sports")
                        .inputAddress()
                        .uploadFile("img/image.jpg")
                        .inputState("NCR")
                        .inputCity("Delhi");
        registrationForm.calendar.setDate("10", "5", "2001");
        registrationForm.submit();

        registrationForm.verificationPopupName("Thanks for submitting the form");
        registrationForm.checkResultsValue("Student Name", nameStudent + " " + lastName)
                        .checkResultsValue("Student Email", emailStudent)
                        .checkResultsValue("Gender", "Female")
                        .checkResultsValue("Mobile", phoneNumber)
                        .checkResultsValue("Date of Birth", "10 June,2001")
                        .checkResultsValue("Subjects", "Physics")
                        .checkResultsValue("Hobbies", "Sports")
                        .checkResultsValue("Picture", "image.jpg")
                        .checkResultsValue("Address", addressStudent)
                        .checkResultsValue("State and City", "NCR Delhi");
    }
}
