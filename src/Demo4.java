import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","G:\\\\selenium workspace\\\\Test8\\\\driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
	
	Alert a=driver.switchTo().alert();
	a.accept();
	
}
}
