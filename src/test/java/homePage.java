import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static junit.framework.TestCase.assertTrue;

public class homePage {
    @Step("Search 123")
    public void Search123() {
        WebDriver webDriver = Driver.webDriver;
        WebElement searchContent = webDriver.findElement(By.id("kw"));
        assertTrue(searchContent.isDisplayed());

        searchContent.sendKeys("123");

        WebElement searchBtn = webDriver.findElement(By.id("su"));
        assertTrue(searchBtn.isDisplayed());

        searchBtn.click();
    }

    @Step("Check searching result")
    public void CheckSearchingResult() {
        WebDriver webDriver = Driver.webDriver;

        //Get the content of the first result
        String urlContent = webDriver.findElement(By.id("content_left")).findElement(By.id("1")).findElement(By.className("favurl")).getText();

        assertTrue(urlContent.contains("123"));

    }
}
