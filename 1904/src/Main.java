import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==1) {
            System.out.println(1);
        }
        else if(n == 2) {
            System.out.println(2);
        }
        else {
            long [] arr = new long[n];

            arr[0] = 1;
            arr[1] = 2;

            for(int i = 2; i < n; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
            }
            System.out.println(arr[n - 1] % 15746);

        }

    }
}
