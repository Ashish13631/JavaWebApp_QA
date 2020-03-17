package net.codejava.javaee;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG_SeleniumTest {

  @Test
  public void testEasy() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashishs\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("http://localhost:8080/HelloWorldJavaEE/");
    String title = driver.getTitle();
    Assert.assertTrue(title.contains("Hello World Java EE"));
    driver.quit();
  }
}
