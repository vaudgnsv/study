
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

       // String[] arr = str.split(" ");
        int count = 1;
        if (str.substring(0, 1).equals(" ")) { // 맨앞 공백 나오는 경우
            count--;
        }
        if (str.substring(str.length() - 1).equals(" ")) { // 맨뒤 공백 나오는 경우
            count--;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(" ")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
