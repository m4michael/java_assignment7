import java.util.Scanner;
class Q5{

    public static void main(String arg[]){

Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.print("\nSmallest among 3 numbers is="+minimum(a,b,c));

    }

   static  int minimum(int a,int b,int c){

        return Math.min(a,Math.min(b,c));
    }
}