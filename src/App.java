import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Haris Niazi/Desktop/JAvaTest/src/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();

    }
}
