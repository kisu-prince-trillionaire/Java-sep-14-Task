package com.handling.file;

import java.io.File;
import java.io.FileInputStream;


public class CountCharInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            File file=new File("C:\\Users\\VISHAL KUMAR\\Downloads\\File handling\\data.txt");
	            if(file.exists() && file.isFile()) {
	                FileInputStream fin=new FileInputStream(file);
	                ReadFile obj=new ReadFile();
	                obj.countUpperCaseChar(fin);
	                fin=new FileInputStream(file);
	                obj.countLowerCaseChar(fin);
	                fin=new FileInputStream(file);
	                obj.countDigits(fin);
	                fin=new FileInputStream(file);
	                obj.countVowels(fin);
	                
	            }
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	}

}
