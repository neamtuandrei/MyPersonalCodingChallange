import java.util.Scanner;

public class Solution {

    public static String RepeatStr(String str, int n) {
        String str_o = "";
        for (int i = 0; i < n; i++) {
            str_o += str;
        }

        return str_o;
    }

    public static String threeChar(int x) {

        String str = Integer.toString(x);

        if(str.length() < 3)
            str = RepeatStr("0", 3 - str.length()) + str;

       
        return str;
    }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.println(s1 + RepeatStr(" ", 15 - s1.length()) + threeChar(x));
                
            }
            System.out.println("================================");

    }
}



