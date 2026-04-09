import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();

        // Read list elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Read number of queries
        int q = sc.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {
            String operation = sc.next();

            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        // Print final list
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}