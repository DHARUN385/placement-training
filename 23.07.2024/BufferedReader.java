import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<ArrayList<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] inputs = bufferedReader.readLine().trim().split(" ");
            int numElements = Integer.parseInt(inputs[0]);
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 1; j <= numElements; j++) {
                line.add(Integer.parseInt(inputs[j]));
            }
            lines.add(line);
        }
        
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        
        for (int i = 0; i < q; i++) {
            String[] query = bufferedReader.readLine().trim().split(" ");
            int lineNumber = Integer.parseInt(query[0]) - 1;
            int position = Integer.parseInt(query[1]) - 1; 
            
            if (lineNumber >= 0 && lineNumber < lines.size()) {
                ArrayList<Integer> line = lines.get(lineNumber);
                if (position >= 0 && position < line.size()) {
                    System.out.println(line.get(position));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
        
        bufferedReader.close();
    }
}
