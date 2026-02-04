import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            char[] arr = s.toCharArray();

            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[arr[i] - 'a']++;
            }

            int maxIndex = 0;
            for (int i = 1; i < 26; i++) {
                if (freq[i] > freq[maxIndex]) {
                    maxIndex = i;
                }
            }

            char maxChar = (char) (maxIndex + 'a');

            for (int i = 0; i < n; i++) {
                if (arr[i] != maxChar) {
                    arr[i] = maxChar;
                    break;
                }
            }

            System.out.println(new String(arr));
        }

        sc.close();
    }
}
