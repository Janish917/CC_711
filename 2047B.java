import java.util.*;

public class Main {

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        int mx = 0;
        int mn = n + 1;
        char high = s.charAt(0);
        char low = s.charAt(0);

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0 && cnt[i] >= mx) {
                mx = cnt[i];
                high = (char) (i + 'a');
            }
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0 && cnt[i] <= mn && (char) (i + 'a') != high) {
                mn = cnt[i];
                low = (char) (i + 'a');
            }
        }

        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (arr[i] == low) {
                arr[i] = high;
                break;
            }
        }

        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
