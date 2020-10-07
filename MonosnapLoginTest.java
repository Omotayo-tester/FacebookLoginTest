package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MonosnapLoginTest {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //dev.d2rxvhrryr2bkn.amplifyapp.com/login
        driver.get("https://www.monosnap.com");
        Thread.sleep(1000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Click on Sign in link
        driver.findElement(By.xpath("//span[@class='headButton']")).click();

        //Click on email locator and send in email details

        driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Mazinga98@hotmail.com");

        //Click on password locator and send in password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Omowunmi@24");

        //driver.findElement (By.linkText ("Sign In")).click();
        driver.findElement (By.xpath("//button[@class='login submitBtn']")).click();
        driver.findElement (By.xpath("//button[@class='login submitBtn']")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        Login.MonosnapLoginTest test = new Login.MonosnapLoginTest();
        test.setUp(); }

}




