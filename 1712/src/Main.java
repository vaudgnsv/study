import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long fix = sc.nextLong();
        long ingredient = sc.nextLong();
        long price = sc.nextLong();
        // 21억 이하의 자연수들

        long count = 1;
        if(ingredient >= price) { // 손익분기점 존재하지 않으면 -1
            System.out.println(-1);
        }
        else {
            long need = fix;
            long sum_price = 0;
            while(true) {  // 21억 정도 되면 곱연산보다 수식 세워서 하는게 더 빠름..
                need += ingredient;
                sum_price += price;
                if(need < sum_price) {
                    break;
                }
                count++;
            }

            System.out.println(count);
        }

    }
}
