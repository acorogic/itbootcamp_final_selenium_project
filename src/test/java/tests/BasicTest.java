package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import java.io.IOException;
import java.time.Duration;
public abstract class BasicTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected String baseUrl = "https://vue-demo.daniel-avellaneda.com ";

    protected Helper helper;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //loginPage=new LoginPage(driver, wait);
        helper=new Helper(driver, wait);


    }

    @BeforeMethod
    public void beforeMethod(){
        driver.manage().deleteAllCookies();
        driver.navigate().to(baseUrl);}


    @AfterMethod
    public void afterMethod(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE){
            Helper.takeAScreenshot(driver, "screenshots/"+testResult.getName()+".jpg" );
        }
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}


