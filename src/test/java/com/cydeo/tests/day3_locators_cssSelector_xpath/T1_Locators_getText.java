package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {
    public static void main(String[] args) {

        // 1- Open a chrome browser
        //WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // 3- Enter incorrect username: “incorrect”
       // driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");  -->  burada yapmis oldugumuz islem, once webelement i buluyoruz adi ile yani name locator kullanarak sonra sayfadaki user name koydugumuz yere yazi yazmak icin .sendkeys i kullaniyoruz .sendkeys string return yapiyor yani icine ne yazicaksak "" bunun icine yaziyoruz ... Bu sekilde yapabiliriz ama eger birden fazla sendkeys felan kullanicaksak veya herhangi bir olayda zor olur cunku hep bu uzun versiyonu yazmak zorundasin

            WebElement inputUserName = driver.findElement(By.name("USER_LOGIN")); // yukaridaki method yerine bu kisa methodu kullanmak daha mantikli WebElement'i declare yapiyorsun variable yani ,sonra onu call yaparak cagirabilirsin daha kisa olmus olur.
            inputUserName.sendKeys("incorrect");

        // 4- Enter incorrect password: “incorrect”
        // MAC:   option + enter
        // Windows:  alt + enter
            WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
            inputPassword.sendKeys("incorrect");

        // 5- Click to login button.
            WebElement loginBtn = driver.findElement(By.className("login-btn"));
            loginBtn.click();

        // 6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification passed!");
        } else {
            System.out.println("Error message verification failed!");
        }

        driver.quit();



    }
}
