package com.example.demo2.sampletest2;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
        driver.get("https://j2store.net/free/");
       String url = driver.getCurrentUrl();
       if(url.equals("https://j2store.net/free/"))
       {
    	   System.out.println("Validate");
       }
       else
       {
    	   System.out.println("Not Validate");
       }
       driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div/div/div/a")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/form/div[2]/div/ul/li[2]/a")).click();
       String url1=driver.getCurrentUrl();
       if(url1.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
       {
    	   System.out.println("Validate");
       }
       else
       {
    	   System.out.println("Not Validate");
       }
       
    }
}
