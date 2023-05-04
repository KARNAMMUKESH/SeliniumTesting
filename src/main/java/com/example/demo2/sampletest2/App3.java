package com.example.demo2.sampletest2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class App3
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
      ChromeOptions co=new ChromeOptions(); 
      co.addArguments("--remote-allow-origins=*");
      
      WebDriver chromedriver = new ChromeDriver(co);
      
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiq4aLaqsT-AhUsTmwGHfKEAncQPAgI");
        chromedriver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiq4aLaqsT-AhUsTmwGHfKEAncQPAgI");
        
    }
}