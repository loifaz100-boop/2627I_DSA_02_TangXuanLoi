import java.util.*;

public class W4_25020251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] citations = new int[n];

        for (int i = 0; i < n; i++) {
            citations[i] = sc.nextInt();
        }

        Arrays.sort(citations);

        int h = 0;

        for (int i = 0; i < n; i++) {
            int count = n - i;
            if (citations[i] >= count) {
                h = count;
                break;
            }
        }
        System.out.println(h);
    }
}