import java.util.*;
import java.io.*;
import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int q = scanner.nextInt();
        
        for (int i = 0; i < q; i++) {
            
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int currentValue = a;
            
            for (int j = 0; j < n; j++) {
                currentValue += Math.pow(2, j) * b;
                System.out.print(currentValue + " ");
            }
            System.out.println(); 
        }
        
        scanner.close();
    }
}
