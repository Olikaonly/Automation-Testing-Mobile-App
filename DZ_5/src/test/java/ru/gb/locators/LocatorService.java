package ru.gb.locators;

import ru.gb.locators.Android.AndroidLoginPageLocators;
import ru.gb.locators.Android.AndroidMainPageLocators;
import ru.gb.locators.iOS.iOSLoginPageLocators;
import ru.gb.locators.iOS.iOSMainPageLocators;
import ru.gb.locators.interfaces.LoginPageLocators;
import ru.gb.locators.interfaces.MainPageLocators;

/**
 * Created by Olga Shestakova
 * Date 02.04.2022
 */
public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();

}
