package firstSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics1 {

	public static void main(String[] args) throws InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //System.out.println("Browser has opened chrome");

				Thread.sleep(1000);

				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();


				//driver.get("https://news.google.com/home?hl=en-US&gl=US&ceid=US:en");

				//List <WebElement> links = driver.findElements(By.tagName("a"));



	}

}
