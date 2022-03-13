package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] arr){
       
    	String str = "";
        //메소드 내용작성
        for (int i=0; i<arr.length; i++) {
        	str += arr[i];
        }
        
        return str;
    }

}
