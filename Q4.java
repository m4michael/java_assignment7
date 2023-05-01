import java.util.Scanner;

class Q4{

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a year=");
        int year=sc.nextInt();

        System.out.println(year+" is leap year="+leap(year));


    }

    static boolean leap(int y){

        boolean a=y%4==0;
        boolean b=y%100!=0;
        boolean c=((y%100==0) && (y%400==0));

        return    a&&(b||c);

    }
}