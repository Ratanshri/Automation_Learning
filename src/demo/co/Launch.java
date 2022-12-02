package demo.co;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ASL(NSEZ)-1137\\Desktop\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("www.google.com");
	}

}
