package selenium_turma2;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

	@Test
	public void testeLongin() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.br/");
		
	}
}
