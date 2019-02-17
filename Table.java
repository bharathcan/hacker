import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Table{
    static int i;



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       int N = scanner.nextInt();
    
      
        
        for(i=1; i<=10; i++)
        {
            int j= (N*i);
         System.out.println(N+" x "+i+" = "+(N*i));
    
        }
        
    }
}