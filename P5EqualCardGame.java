import java.util.Scanner;



public class P5EqualCardGame {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            System.out.println(52%b);
        }

    }
}
