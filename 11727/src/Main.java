import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1) { // 최소조건
            System.out.println(1);
        }
        else if(n == 2) {
            System.out.println(3);
        }
        else if(n == 3) {
            System.out.println(5);
        }
        else {
            long [] arr = new long[n];

            arr[0] = 1;
            arr[1] = 3;
            arr[2] = 5;

            for(int i = 3; i < n; i++) {
                if(i % 2 == 0) { // 홀수일때 | 하나만 넣는건 왼쪽과 오른쪽 경우에서 중복 1 제거

                    arr[i] = ((arr[i - 1] * 2) - 1) % 10007;
                }
                else { // 짝수일때 이전경우 + (-와 ㅁ 경우 있으므로 2개 이전경우 * 2)
                    arr[i] = (arr[i - 1] + (arr[i - 2] * 2)) % 10007;
                }

            }
            System.out.println(arr[n - 1]);
        }

    }
}
