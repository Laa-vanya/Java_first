import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\\\selenium workspace\\\\Test8\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN'][1]")).click();
		driver.findElement(By.xpath("//input[@value='Login	']")).click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}
