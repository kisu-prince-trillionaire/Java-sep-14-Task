package com.handling.file;

import java.io.File;

public class MyFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("C:\\Users\\VISHAL KUMAR\\Desktop\\Java Training\\Linked List");
	    int fileCount = directory.list().length;
	    System.out.println("File Count:"+fileCount);
	  }
}
