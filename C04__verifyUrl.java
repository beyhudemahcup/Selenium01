package testler.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04__verifyUrl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "(your computer's info)\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");


        String expectedUrl = "www.youtube.com";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("this is the same url, test PASS");
        }else{
            System.out.println("this url could not match the url of the website. website's url : " + driver.getCurrentUrl());
        }

        driver.close();



    }
}
