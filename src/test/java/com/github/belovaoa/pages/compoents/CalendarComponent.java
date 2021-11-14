package com.github.belovaoa.pages.compoents;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    private SelenideElement
            dateInput = $("#dateOfBirthInput"),
            monthImput = $(".react-datepicker__month-select"),
            yearInput = $(".react-datepicker__year-select");

    public void setDate(String day, String month, String year) {
        dateInput.click();
        monthImput.selectOptionByValue(month);
        yearInput.selectOptionByValue(year);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();

    }

}
