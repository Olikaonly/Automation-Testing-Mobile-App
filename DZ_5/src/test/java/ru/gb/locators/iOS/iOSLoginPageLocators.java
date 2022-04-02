package ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.LoginPageLocators;


/**
 * Created by Olga Shestakova
 * Date 02.04.2022
 */
public class iOSLoginPageLocators implements LoginPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    public By loginErrorText() {
        return MobileBy.AccessibilityId("Please enter a valid email address");
    }
}

