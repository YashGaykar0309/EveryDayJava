import java.util.Scanner;

public class P4ChefAndFeedback {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0; i<a;i++){
            String Feed=sc.next();
            if (Feed.matches("^[0]+$")) {
                if(Feed.contains("010")){
                    System.out.println("Good");
                }
                else if(Feed.contains("101")){
                    System.out.println("Good");
                }
                else{
                    System.out.println("Bad");
                }
            }



        }
    }

}
