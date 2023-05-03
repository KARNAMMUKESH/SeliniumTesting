package com.example.demo2.sampletest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class report {
	
	WebDriver driver;
	 ExtentSparkReporter spark = new ExtentSparkReporter("testreport.html");
	  ExtentReports extent = new ExtentReports();
	  static ExtentTest test;
	
	@BeforeMethod
	public void beforeMethod() {
		extent.attachReporter(spark);
		  spark.config().setDocumentTitle("My Testing Document");
		  spark.config().setReportName("My Test Reports");
		driver = new EdgeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
	}
  @Test
  public void t1() {
	  String gtitle= driver.getTitle();
	  String otile="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  String url=driver.getCurrentUrl();
	  String urli="https://www.godaddy.com/en-in";
	  Assert.assertEquals(gtitle,otile);
	  Assert.assertEquals(url,urli);
	  test=extent.createTest("TC_001","Test case for checking the tite of the page");  
  }
//  @Test
//  public void t2() {
//	  String gtitle= driver.getTitle();
//	  String otile="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
//	  String url=driver.getCurrentUrl();
//	  String urli="https://www.godaddy.com/en-in";
//	  Assert.assertEquals(gtitle,otile);
//	  Assert.assertEquals(url,urli);
//	  test=extent.createTest("TC_001","Test case for checking the tite of the page");  
//  }
  

  @AfterMethod
  public void afterMethod(ITestResult result) {
	  if(result.getStatus()==ITestResult.FAILURE) 
	     {System.out.println(result);
		  test.log(Status.FAIL, result.getName());
		  }
		  else if(result.getStatus()==ITestResult.SUCCESS) {
		  test.log(Status.PASS, result.getName());
		  }
		  else {
		  test.log(Status.SKIP, result.getName());
		  }
	  driver.quit();
	extent.flush();
	 }
	  
	  
  }

