package litpeo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		Thread.sleep(3000);

		// Text content

		WebElement text = driver.findElement(By.id(":R57alklff9da:"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.click(text).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build()
				.perform();
		Thread.sleep(2000);
		act.sendKeys(text, "560").build().perform();
		Thread.sleep(2000);
		act.click();

		// checkbox content

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='57']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='19.19']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='63']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='15']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
