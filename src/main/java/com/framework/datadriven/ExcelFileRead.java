package com.framework.datadriven;
	
import java.io.IOException;
import com.common.*;
import java.util.*;

	public class ExcelFileRead {

	public static void main(String []args) throws Exception {
   	
		ExcelUtils.setExcelFile("C://workspace//testashiwani.xlsx","Test");
		String us1=ExcelUtils.getCellData(1,0);
		String us2=ExcelUtils.getCellData(2,0);
		String pwd1=ExcelUtils.getCellData(1,1);
		String pwd2=ExcelUtils.getCellData(2,1);
		System.out.println("user one name: "+us1);
		System.out.println("user two name: "+us2);
		System.out.println("user one password: "+pwd1);
		System.out.println("user two nameword: "+pwd2);
		}
	
}
  