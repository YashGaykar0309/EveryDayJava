//Chef is planning to buy a new car for his birthday. After a long search, he is left with 2 choices:
//
//        Car 1: Runs on diesel with a fuel economy of x1 km/l
//        Car 2: Runs on petrol with a fuel economy of x2 km/l
//        Chef also knows that
//
//        the current price of diesel is y1 rupees per litre
//        the current price of petrol is y2 rupees per litre
//        Assuming that both cars cost the same and that the price of fuel remains constant, which car will minimize Chef's expenses?
//
//        Print your answer as a single integer in the following format
//
//        If it is better to choose Car 1, print −1
//        If both the cars will result in the same expenses, print 0
//        If it is better to choose Car 2, print  1

import java.lang.*;
import java.util.Scanner;


public class P1CarChoice
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