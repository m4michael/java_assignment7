import java.util.Scanner;

 class Q2 {

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a word=");

        String s=sc.nextLine();

     

        System.out.print("\nThe number of vowels="+vowel(s));



    }

   static int vowel(String s){

        int count=0;
        for(int i=0;i<s.length();i++){

       char ch= s.charAt(i);

       if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
        count++;

       }
    }

    return count;

    }


    
}
