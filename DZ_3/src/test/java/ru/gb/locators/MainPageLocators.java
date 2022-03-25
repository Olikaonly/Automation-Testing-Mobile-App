package ru.gb.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

/**
 * Created by Olga Shestakova
 * Date 24.03.2022
 */
public class MainPageLocators {
    public By loginButton() {
//        return By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.widget.TextView");
        return MobileBy.AccessibilityId("Login");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}
