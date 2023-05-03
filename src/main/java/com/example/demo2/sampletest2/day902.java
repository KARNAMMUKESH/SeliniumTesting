package com.example.demo2.sampletest2;

import org.testng.annotations.Test;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class day902 {
  WebDriver driver;
  WebDriver driverr;
  WebDriver driverrr;
  
 
  @BeforeTest
  public void beforeTest() {
 driver=new EdgeDriver();
 driverr=new EdgeDriver();
 driverrr=new EdgeDriver();
 
  }

 
 
  @Test
  public void TestCase1() throws InterruptedException {
//  System.out.println("Smoke");
 String url="https://www.godaddy.com/en-in";
 driver.get(url);
 driver.manage().window().maximize();
 Thread.sleep(7000);
 String gtitle=driver.getTitle();
 String gurl=driver.getCurrentUrl();
 String title="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
 Assert.assertEquals(gtitle,title);
 Assert.assertEquals(gurl, url);
 Thread.sleep(7000);
 driver.quit();
 System.out.println("t1");
  }
 
 
 
 
  @Test
  public void TestCase2() throws InterruptedException {
//  System.out.println("Regression");
 String url="https://www.godaddy.com/en-in";
 driverr.get(url);
 driverr.manage().window().maximize();
 Thread.sleep(7000);
 driverr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
 Thread.sleep(2000);
 driverr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
 Thread.sleep(7000);
 driverr.quit();
 System.out.println("t2");
  }
  
 
 
  @Test
  public void TestCase3() throws InterruptedException {
//  System.out.println("Smoke");
 String url="https://www.godaddy.com/en-in";
 driverrr.get(url);
 driverrr.manage().window().maximize();
 Thread.sleep(7000);
 driverrr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
 Thread.sleep(2000);
 driverrr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
 String gtitle=driverrr.getTitle();
 String atitle="GoDaddy Domain Search - Buy and Register Available Domain Names";
 Assert.assertEquals(atitle, gtitle);
 Thread.sleep(7000);
 WebElement search=driverrr.findElement(By.xpath("/html/body/main/section[1]/section/section/div/div/section/div/div[1]/div/div/div[2]/div/div"));
 WebElement btn=driverrr.findElement(By.xpath("/html/body/main/section[1]/section/section/div/div/section/div/div[1]/div/div/div[2]/button"));
 boolean btr=btn.isEnabled();
 boolean searchr=search.isEnabled();
 Assert.assertEquals(btr,searchr);
 driverrr.quit();
 System.out.println("t3");
  }
 
 
 
  @AfterTest
  public void afterTest() throws InterruptedException {
 Thread.sleep(7000);
//  driver.quit();
 System.out.println("t5");
  }
 
 
 
 

}