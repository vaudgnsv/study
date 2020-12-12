import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String str = "";

        for(int i = 0; i < n; i++) {
            str += n;
        }
        if(str.length() > m) { // 답이 너무 긴 경우
            System.out.println(str.substring(0, m));
        }
        else {
            System.out.println(str);
        }

    }
}
