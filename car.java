import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   for(int i=0;i<a;i++){
	       float avg1=sc.nextInt();
	       float avg2=sc.nextInt();
	       float p1=sc.nextInt();
	       float p2=sc.nextInt();
	       float price1=p1/avg1;
	       float price2=p2/avg2;
	       if (price1<price2){
	           System.out.println("-1");
	       }
	       else if (price1==price2){
	           System.out.println("0");
	       }
	       else{
	           System.out.println("1");
	       }
	       
	   }
	   
	       
	   
	}
}