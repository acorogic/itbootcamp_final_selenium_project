package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.File;

public class Helper {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Helper(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public static void takeAScreenshot(WebDriver driver, String path) throws IOException {
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f, new File(path));


    }
}
