import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(min(arr) + " " + max(arr));
    }
    private static int max(int[] arr) {
        int a = -1000000;
        for(int i = 0; i < arr.length; i++) {
            if(a <= arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }
    private static int min(int[] arr) {
        int a = 1000000;
        for(int i = 0; i < arr.length; i++) {
            if(a >= arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }
}
