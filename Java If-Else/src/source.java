import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {
  
  public static boolean isEven(int number){
    if (number % 2 == 0)
      return true;
    else
      return false;
  }

  public static void loop() {

    System.out.print("Type a number from 1 to 100 ");
        int N = scanner.nextInt();
        

        if ((N >= 1) && (N <= 100)) {

        
        if (isEven(N) == false)
            System.out.println("Weird");

        if (isEven(N) && (N >= 2 && N <= 5))
            System.out.println("Not Weird");   
        
        if (isEven(N) && (N >=6 && N <= 20))
            System.out.println("Weird");
        
        if (isEven(N) && N > 20)
            System.out.println("Not Weird");    
        
        
        
        } else {
          System.out.println("Type a number from 1 to 100.");

        }
        
        loop();
  }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
      loop();
        
      scanner.close();


    }
}
