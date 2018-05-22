import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Oleh\\eclipse-workspace\\webdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://rediff.com//");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
