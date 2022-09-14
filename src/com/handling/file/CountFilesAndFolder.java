package com.handling.file;

import java.io.File;

public class CountFilesAndFolder {
	public void getFile(String dirPath) { 
		try {
			File f = new File(dirPath); 
		    File[] files = f.listFiles(); 
		    int count = 0;
		    if (files != null) 
		    for (int i = 0; i < files.length; i++) { 
		        count = count+1;
		        File file = files[i]; 
		 
		        if (file.isDirectory()) {    
		             getFile(file.getAbsolutePath());  
		        } 
		    }
		    System.out.println(" The count of the files in the folder are : " + count);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	    
	} 

}
