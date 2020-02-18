import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int [] arr = new int[3];
        for(int i = 0; i < num; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            if(N % H == 0) {
                arr[i] = H * 100;

            } else {
                arr[i] = (N % H) * 100;
            }


            if(N / H < 1) {
                arr[i] += 1;
            } else {
                if(N % H == 0) {
                    arr[i] += (N / H);
                }
                else {
                    arr[i] += ((N / H) + 1);
                }
            }

        }
        for(int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}
