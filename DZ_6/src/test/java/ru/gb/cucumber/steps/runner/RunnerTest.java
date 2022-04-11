package ru.gb.cucumber.steps.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Olga Shestakova
 * Date 11.04.2022
 */
@CucumberOptions( features = "src/java/ru/gb/cucumber/features", glue = {"src/test/java/ru/gb/cucumber/steps", "src/test/java/ru/gb/cucumber/hooks"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}

