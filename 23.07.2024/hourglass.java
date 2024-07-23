import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] rowItems = bufferedReader.readLine().trim().split(" ");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(rowItems[j]);
            }
        }

        bufferedReader.close();
        
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currentSum = calculateHourglassSum(arr, i, j);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
    }

    private static int calculateHourglassSum(int[][] arr, int row, int col) {
        return arr[row][col]     + arr[row][col+1]     + arr[row][col+2]
             + arr[row+1][col+1]
             + arr[row+2][col]     + arr[row+2][col+1]     + arr[row+2][col+2];
    }
}