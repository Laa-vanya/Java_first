import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\\\selenium workspace\\\\Test8\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//input[@class='btn btn-default'][1]")).click();
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
	}
}
