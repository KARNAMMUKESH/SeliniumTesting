package com.example.demo2.sampletest2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Day9 {
  @Test(dataProvider = "dp")
  public void f(Integer n, int s,int result) {
	  
	  int expected=n+s;
	  Assert.assertEquals(expected,result);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 3, 4 },
      new Object[] { 2, 5, 7 },
    }; 
  } 
}
