import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium workspace\\Test8\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement alert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alert.click();
		WebElement click = driver.findElement(By.xpath("//button[contains(text(),'display a confir')]"));
		click.click();
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}
