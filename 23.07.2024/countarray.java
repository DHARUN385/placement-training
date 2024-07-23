import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();

        int negativeSubarrayCount = countNegativeSubarrays(arr);
        System.out.println(negativeSubarrayCount);
    }

    private static int countNegativeSubarrays(int[] arr) {
        int count = 0;
        
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum < 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
