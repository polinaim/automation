package practisTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practisTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","c:/practis/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Make sure username and password fields are editable
        driver.get("http://www.practis.co.il/automation/v2/");
        driver.findElement(By.id("username")).sendKeys("bla");
        driver.findElement(By.id("password")).sendKeys("bla");
        System.out.println("Good");

        //Make sure submit button is enabled
        driver.findElement(By.name("login")).click();
        System.out.println("Good");

        //Make sure username and password fields accept up to 20 chars
        driver.findElement(By.id("username")).sendKeys("123456789123456789001");
        driver.findElement(By.name("login")).click();

        //Make sure that wrong credentials result in error
        WebElement errField;
        errField = driver.findElement(By.id("errField"));
        if(errField.equals("Invalid username or password")){
            driver.findElement(By.id("username")).sendKeys("bad");
            driver.findElement(By.id("password")).sendKeys("bad");
            System.out.println("Bad");

        }
        //Make sure that good credentials move us to the next page
        else {
            driver.findElement(By.id("username")).sendKeys("admin");
            driver.findElement(By.id("password")).sendKeys("admin");
            driver.findElement(By.name("login")).click();
            System.out.println("Good");
        }

    }

}
