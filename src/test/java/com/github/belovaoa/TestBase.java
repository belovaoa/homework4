package com.github.belovaoa;

import com.codeborne.selenide.Configuration;
import com.github.belovaoa.pages.RegistrationForm;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    RegistrationForm registrationForm = new RegistrationForm();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
}
