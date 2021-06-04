import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPrompt {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\selenium workspace\\Test8\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[tex()='Alert with Textbox ']")).click();
	driver.findElement(By.xpath("//button[contains(text()'the prompt box')]")).click();
Alert a=driver.switchTo().alert();
a.sendKeys("lavanya");
String text = a.getText();
System.out.println(text);
a.accept();
}
}
