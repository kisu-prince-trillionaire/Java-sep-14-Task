package com.handling.file;

import java.io.FileInputStream;

public class ReadFile {
	 public void countLowerCaseChar(FileInputStream f) {
	        try {
	            int countLowerCase=0;
	            while(true) {
	                int i=f.read();
	                if(i==-1) {
	                    break;
	                }else if(i>=97 && i<=122) {
	                    countLowerCase++;
	                }
	            }
	            System.out.println("Total number of lower case character is: "+countLowerCase);
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	    
	    public void countUpperCaseChar(FileInputStream f) {
	        try {
	            int countUpperCase=0;
	            while(true) {
	                int i=f.read();
	                if(i==-1) {
	                    break;
	                }else if(i>=65 && i<=90) {
	                    countUpperCase++;
	                }
	            }
	            System.out.println("Total number of Upper case character is: "+countUpperCase);
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	    
	    public void countDigits(FileInputStream f) {
	        try {
	            int countDigits=0;
	            while(true) {
	                int i=f.read();
	                if(i==-1) {
	                    break;
	                }else if(i>=48 && i<=57) {
	                    countDigits++;
	                }
	            }
	            System.out.println("Total number of digits is: "+countDigits);
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	    
	    public void countVowels(FileInputStream f) {
	        try {
	            int countVowels=0;
	            while(true) {
	                int i=f.read();
	                if(i==-1) {
	                    break;
	                }else if(i==65 || i==69 || i==73 || i==79 || i==85 || i==97 || i==101 || i==105 || i==111 || i==117) {
	                    countVowels++;
	                }
	            }
	            System.out.println("Total number of vowel is: "+countVowels);
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	    }

}
