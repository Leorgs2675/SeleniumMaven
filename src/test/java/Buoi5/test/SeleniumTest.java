package Buoi5.test;

import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome-win64\\chrome.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void testRegister() {
        driver.get("https://vitimex.com.vn/");
        WebElement registerButton = driver.findElement(By.id("register"));
        registerButton.click();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submit = driver.findElement(By.id("submit"));

        username.sendKeys("testuser");
        password.sendKeys("password123");
        submit.click();

        assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test
    void testLogin() {
        driver.get("https://vitimex.com.vn/");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submit = driver.findElement(By.id("submit"));

        username.sendKeys("testuser");
        password.sendKeys("password123");
        submit.click();

        assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}
