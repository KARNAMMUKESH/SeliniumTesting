package com.example.demo2.sampletest2;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class App1 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
        driver.get("https://demoqa.com/droppable/");
       WebElement drag= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[1]"));
        WebElement drop = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]"));
        Actions ac = new Actions(driver);
        ac.dragAndDrop(drag,drop);
        ac.build().perform();
        
	}

}
