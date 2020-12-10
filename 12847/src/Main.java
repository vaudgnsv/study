import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long max = 0;
        long present = 0;
        for(int i = 0; i < n; i++) {
            if(i < m) { // max 초기화
                max += arr[i];
                present += arr[i];
            }
            else {
                present += arr[i]; // 현재일부터 m일간 일한 금액
                present -= arr[i - m];

                if(max <= present) {
                    max = present;
                }
            }
        }
        System.out.println(max);

    }
}
