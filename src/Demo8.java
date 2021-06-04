import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\\\selenium workspace\\\\Test8\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']")).click();
		WebElement usr = driver.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']"));
		usr.sendKeys("lavana");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("bharatg");
		WebElement logn = driver.findElement(By.xpath("//input[@class='cta']"));
		logn.click();
	}
}
