import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int t[] = new int[n + 1];
        int p[] = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        int result[] = new int[n + 2];


        for(int i  = 1; i<= n + 1; i++) {
            result[i] = 0;
        }

        for(int i  = 1; i<= n+1 ; i++) {
            for(int j = 1; j < i; j++) {
                if(j + t[j] == i ) {
                    result[i] = result[i] >= result[i - t[j]] + p[j] ? result[i] : result[i - t[j]] + p[j];
                }
                else {
                    result[i] = result[i] >= result[i - 1] ? result[i] : result[i - 1];
                }
            }
        }

        System.out.println(result[n + 1]);





    }
}
