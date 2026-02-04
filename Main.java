import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();

            if (n == 3) {
                System.out.println(-1);
            } else {

                for (int i = 1; i <= n; i = i + 2) {
                    System.out.print(i + " ");
                }

                int start;
                if (n % 2 == 0)
                    start = n;
                else
                    start = n - 1;

                for (int i = start; i >= 2; i = i - 2) {
                    System.out.print(i + " ");
                }

                System.out.println();
            }

            t--;
        }

        sc.close();
    }
}
