import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch {

    WebDriver driver;

    @Test
    public void test001() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");

        driver = new FirefoxDriver();


        openMainPage();
        typeQuery();
        submitSearch();
        waitForResults();
        assertResultPage();

    }



    private void waitForResults(){
        By resultsStatsElement = By.id("result-stats");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultsStatsElement));

    }

    //ToDo: Add More Meaningful (so it makes more sense logically) Assertion
    private void assertResultPage(){
        WebElement resultsStatsElement = driver.findElement(By.id("result-stats"));
        boolean isElementDisplayed = resultsStatsElement.isDisplayed();

        boolean expectedResult = true;

        Assert.assertEquals(isElementDisplayed, expectedResult);

    }



    private void submitSearch(){
        WebElement searchInput = driver.findElement(By.cssSelector(".gLFyf"));
        searchInput.submit();

    }

    private void typeQuery(){
        WebElement searchInput = driver.findElement(By.cssSelector(".gLFyf"));
        searchInput.sendKeys("Portnov Computer School");

    }

    private void openMainPage() {
        String url = "https://google.com";
        driver.get(url);



    }
}
