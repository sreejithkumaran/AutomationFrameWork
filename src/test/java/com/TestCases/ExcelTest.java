package com.TestCases;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.Core.ExcelUtils;



public class ExcelTest {
 
	ExcelUtils data = new ExcelUtils();	
	
  @Test
  public void f() throws Exception {
	  String dataSheetName = "TestData.xlsx";
	  String sheetName = "Sheet1";
	  HashMap<String, String> map;
	  map = ExcelUtils.getExcelValues(dataSheetName,sheetName,2);
	  System.out.println(" ============> " +map.get("Email"));
  }
}
