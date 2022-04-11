package ru.gb.cucumber.steps.runner.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Olga Shestakova
 * Date 11.04.2021
 */
public class Hooks {
    @Before
    public void prepareData() {
        System.out.println("Привет, огурец. Я пишу ПЕРЕД тестом! Можно делать все подготовительные шаги здесь.");
    }

    @After
    public void clearData() {
        System.out.println("Пока, огурец. Я пишу ПОСЛЕ теста! Но можно делать, что угодно, например закрывать драйвер.");
    }

}
