//package com.flatironschool.javacs;

public class HelloWorld {

    public static Double getVersion() {
    	String str = new String(System.getProperty("java.specification.version"));
    	Double temp = Double.parseDouble(str);
        return temp;
    }

    public static void main(String[] args) {
	    System.out.println("hello");
    }
}