package com.github.belovaoa.pages.compoents;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    public static Faker faker = new Faker(new Locale("ru"));

    public static String
            nameStudent = faker.name().firstName(),
            lastName = faker.name().lastName();

}
