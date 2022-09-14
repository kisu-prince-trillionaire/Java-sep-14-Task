package com.handling.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergeFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter my_pw = new PrintWriter("C:\\Users\\VISHAL KUMAR\\Downloads\\File handling\\data2.txt");
		      BufferedReader my_br = new BufferedReader(new FileReader("C:\\Users\\VISHAL KUMAR\\Downloads\\File handling\\data.txt"));
		      String my_line = my_br.readLine();
		      while (my_line != null) {
		         my_pw.println(my_line);
		         my_line = my_br.readLine();
		      }
		      my_br = new BufferedReader(new FileReader("C:\\Users\\VISHAL KUMAR\\Downloads\\File handling\\data1.txt"));
		      my_line = my_br.readLine();
		      while(my_line != null) {
		         my_pw.println(my_line);
		         my_line = my_br.readLine();
		      }
		      my_pw.flush();
		      my_br.close();
		      my_pw.close();
		      System.out.println("The first two files have been merged into the third file successfully.");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
