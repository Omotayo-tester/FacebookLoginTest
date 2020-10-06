package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookLoginTest {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //dev.d2rxvhrryr2bkn.amplifyapp.com/login
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("09045984156");
                driver.findElement(By.id("pass")).sendKeys("Omowunmi@24");
        //driver.findElement (By.linkText ("Sign In")).click();
        //driver.findElement (By.id("loginbutton")).click();
        driver.findElement (By.name("login")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        FacebookLoginTest test = new FacebookLoginTest();
        test.setUp(); }

}

