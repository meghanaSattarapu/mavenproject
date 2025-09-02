package com.example.factorial;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
       int n = 3;
       int f = 1;
       for(int j = 1 ;j<n+1;j++) {
    	   f=f*j;
       }
       System.out.println(f);
    }
}
