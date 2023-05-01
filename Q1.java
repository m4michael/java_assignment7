import java.util.Scanner;
class Q1{

    public static void main (String arg[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Give 3 inputs=\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        float avg=average(a,b,c);

        System.out.println("average of given inputs="+avg);
    



    }

   static  float average(int a,int b, int c){

    return ((a+b+c)/3);

   }
}