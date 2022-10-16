package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T3_getText_cssSelector {
    public static void main(String[] args) {

        // 1. Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // 3. Verify "log in" button text is as expecter:
        // expected: log in

        // locate with using cssSelector by type attribute:
        // WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        //locate with using cssSelector by value attribute:
        // WebElement logInBtn = driver.findElement(By.cssSelector("input[value='log in']"));

        // locate with using cssSelector by class attribute:
        // WebElement logInBtn = driver.findElement(By.cssSelector("input[class='']"));




    }
}
