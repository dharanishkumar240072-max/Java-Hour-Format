import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) odds.add(i);
        }
        for (int i = B; i >= A; i--) {
            if (i % 2 == 0) evens.add(i);
        }

        StringBuilder sb = new StringBuilder();
       if (evens.size() > odds.size()) {
            int i = 0, j = 0;
            while (i < evens.size() || j < odds.size()) {
                if (i < evens.size()) sb.append(evens.get(i++)).append(" ");
                if (j < odds.size()) sb.append(odds.get(j++)).append(" ");
            }
        } else {
            int i = 0, j = 0;
            while (i < odds.size() || j < evens.size()) {
                if (i < odds.size()) sb.append(odds.get(i++)).append(" ");
                if (j < evens.size()) sb.append(evens.get(j++)).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
