import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {
    public static void main(String[] args) {


        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        // create ChromeDriver Object
        WebDriver driver = new ChromeDriver();
        // navigate to Expedia.com
        driver.get("https://www.expedia.com/");

        //click flights tab
        driver.findElement(By.xpath("//span[.='Flights']")).click();

        //oneway tab
        driver.findElement(By.xpath("//span[.='One-way']")).click();

        //click LeavingFrom tab and type Ottawa
        WebElement box1 = driver.findElement(By.xpath("//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']/div[.='Leaving from']/.."));
       // WebElement box1 = driver.findElement(By.xpath("//div[.='Leaving from']"));

        box1.sendKeys("Ottawa");
        //select first airport in list
        driver.findElement(By.xpath("//span/strong[.='Ottawa (YOW - Macdonald-Cartier Intl.)']")).click();

        //click GoingTo tab and type Vancouver
        WebElement box2 = driver.findElement(By.xpath("//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']/div[.='Going to']/.."));
        // WebElement box1 = driver.findElement(By.xpath("//div[.='Going to']"));

        box2.sendKeys("Vancouver");

        //select first airport in list
        driver.findElement(By.xpath("//span/strong[.='Vancouver (YVR - Vancouver Intl.)']")).click();


        //click search button
        driver.findElement(By.xpath("//div/button[.='Search']")).click();

        // select first flight from list of flights
        driver.findElement(By.xpath("//ul[@class='uitk-typelist uitk-typelist-orientation-stacked uitk-typelist-size-2 uitk-typelist-spacing']/li[1]")).click();

        //click first select button from list
        driver.findElement(By.xpath("//li[1]//div/button[.='Select']")).click();

        // click No Thanks button on pup up to check out
        driver.findElement(By.xpath("//div//a[.='No thanks']")).click();

        // click Check Out
        driver.findElement(By.xpath("//div[.='Check out']")).click();

        //close the browser window
        driver.close();

    }
}

/*

Given: User on Expedia Homepage (url: https://www.expedia.com)
When: user clicks flights tab on from modules
When: user clicks "one way" tab
When: user enters Name of Departure and destination Cities into boxes and selects airports
When: user clicks "Search" button
And: user from on Result page and selects first flight from the list of flights
And: user on a select window and clicks select button from first list
And: user on a pop-up page and clicks "No thanks" button
Then: user on check-out page
Then: user clicks "Check out" button and checks out to Payment page



 */
