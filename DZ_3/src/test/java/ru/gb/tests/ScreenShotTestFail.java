package ru.gb.tests;

import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

/**
 * Created by Olga Shestakova
 * Date 24.03.2022
 */
public class ScreenShotTestFail extends BaseTest {

    @Test
    public void checkMainPageScreen(){
        openApp()
                .checkFailScreenshot();
    }
}
