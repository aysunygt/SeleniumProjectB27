package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryAppLogin {
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://library2.cydeo.com/login.html
        driver.get("https://library2.cydeo.com/login.html");

        // 3. Enter username: "incorrect@email.com"
        WebElement usernameInput = driver.findElement(By.id("inputEmail"));
        usernameInput.sendKeys("incorrect@email.com");

        // 4. enter password: "incorrect password"









    }
}
