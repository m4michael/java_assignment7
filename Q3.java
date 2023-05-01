import java.util.Scanner;

public class Q3 {
    
    public static void main(String arg[]){

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter a String");
        String s=sc.nextLine();

        System.out.print("\n Middle character of String="+middle(s));



    }

    static String middle(String s){

        if(s.length()%2==0){

            return s.substring((s.length()/2 )-1,s.length()/2 +1);
        }
        else{

            return s.substring(s.length()/2,s.length()/2 +1);
        }
    }
}
