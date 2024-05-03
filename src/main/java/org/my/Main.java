package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver.exe");
     WebDriver driver = new ChromeDriver();

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {

            driver.get("https://chercher.tech/practice/dropdowns");
            driver.manage().window().maximize();

            WebElement prod = driver.findElement(By.xpath("//select[@id='first']"));
            Select select = new Select(prod);
            select.selectByVisibleText("Google");

            WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
            Select select1 = new Select(animals);
            select1.selectByVisibleText("Avatar");

            WebElement dummyProdOrder = driver.findElement(By.xpath("//select[@id='order-same']"));
            Select select2 = new Select(dummyProdOrder);
            select2.selectByVisibleText("Yahoo");

            WebElement dummyProdChanged = driver.findElement(By.xpath("//select[@id='order-changed']"));
            Select select3 = new Select(dummyProdChanged);
            select3.selectByVisibleText("Bing");

            WebElement custom = driver.findElement(By.cssSelector("#custom"));
            custom.click();

            WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
            Select select4 = new Select(food);
            select4.selectByVisibleText("Pizza");
            select4.selectByVisibleText("Bonda");

            WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
            userName.sendKeys("Alex");

            WebElement checkBox = driver.findElement(By.cssSelector("#checkme"));
            checkBox.click();

            WebElement link = driver.findElement(By.linkText("Sample link"));
            link.click();

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        } finally {
            driver.close();
            driver.quit();
        }

    }
}