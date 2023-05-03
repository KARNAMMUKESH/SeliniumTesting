package com.example.demo2.sampletest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test(priority=2)
  public void f01() {
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver(); 
      driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
      String title = driver.getTitle();
      Assert.assertEquals(title,"Guest Registration Form – User Registration");
  }
  @Test(priority=1)
  public void f02()
  {
	  System.out.println("TestTwo");
  }
}
