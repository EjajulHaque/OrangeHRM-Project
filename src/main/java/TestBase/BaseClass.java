package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setUp(String br) throws InterruptedException {

        switch (br.toLowerCase()){
            case "chrome":driver=new ChromeDriver(); break;
            case "edge":driver=new EdgeDriver(); break;
            case "firefox":driver=new FirefoxDriver(); break;
            default: System.out.println("invalid browser name.."); return;
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
