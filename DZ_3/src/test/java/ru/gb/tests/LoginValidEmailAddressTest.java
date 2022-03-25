package ru.gb.tests;

import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

/**
 * Created by Olga Shestakova
 * Date 08.03.2022
 */
public class LoginValidEmailAddressTest extends BaseTest {
    @Test
    public void checkEmptyEmail() {

        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText("Please enter a valid email address");
    }
}
