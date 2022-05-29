import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class test {
    @Test
    public void testform() {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        //wait = WebDriverWait(driver, 10);
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Hana");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Elmaghraby");
        driver.findElement(By.cssSelector("#job-title")).sendKeys("Student");
        driver.findElement(By.cssSelector("#radio-button-2")).click();
        driver.findElement(By.cssSelector("#checkbox-2")).click();
        driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a")).click();
        //driver.quit();
    }

}
