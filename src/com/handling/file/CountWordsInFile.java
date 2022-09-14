package com.handling.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CountWordsInFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int count =0;
		try {
			File file = new File("C:\\Users\\VISHAL KUMAR\\Downloads\\File handling\\data.txt");
		    FileInputStream fis = new FileInputStream(file);
		    byte[] bytesArray = new byte[(int)file.length()];
		    fis.read(bytesArray);
		    String s = new String(bytesArray);
		    String [] data = s.split(" ");
		    for (int i=0; i<data.length; i++) {
		       count++;
		    }
		    fis.close();
		    System.out.println("Number of words in the given file are " +count);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
