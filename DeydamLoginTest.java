package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DeydamLoginTest {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //dev.d2rxvhrryr2bkn.amplifyapp.com/login
        driver.get("https://www.deydam.com");
        Thread.sleep(1000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Get Started")).click();

        driver.findElement(By.linkText("Login here")).click();

        driver.findElement(By.id("username")).click();

        //Click on email locator and send in email details
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("Arikeprog");

        //Click on password locator and send in password
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Omowunmi@24");

        //driver.findElement (By.linkText ("Sign In")).click();
        driver.findElement (By.xpath("//button[@class='btn btn-primary account__btn account__btn--small']")).click();

    }

    public static void main(String[] args) throws InterruptedException {
        DeydamLoginTest test = new DeydamLoginTest();
        test.setUp(); }

}




