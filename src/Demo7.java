import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\\\selenium workspace\\\\Test8\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@class='input_password'])[1]")).sendKeys("lavanya");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		//driver.switchTo().frame(1);
		//WebElement frame1 = driver.findElement(By.name("login_page"));
		//driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//input[@class='input_password'])[2]")).sendKeys("12345");
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0].setAttribute('value','1234')", pwd);
	}
}
