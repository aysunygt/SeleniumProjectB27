package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceAppVerification {
    public static void main(String[] args) {

      //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


      // 2. Go to https://www.qa1.excelsoirinsurance.com/login
        driver.get("https://www.qa1.excelsoirinsurance.com/login");


      // 3. Verify URL contains Expected: "excepsoirinsurance"
        String expectedURL = "excepsoirinsurance"; // comes from requirement
        String actualURL = driver.getCurrentUrl(); // comes from browser

        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification is PASSED!");
        } else {
            System.out.println("URL verification is FAILED!");
        }

      // 4. Verify title: Expected: "Login | Excelsoir Insurance"
        String expectedTittle = "Login | Excelsoir Insurance";
        String actualTittle = driver.getTitle();

        if(actualTittle.equals(expectedTittle)){
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }





driver.quit();

    }
}
