import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //long[] arr = new long[n];
        ArrayList<Long> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }
        long b = sc.nextLong();
        long c = sc.nextLong();
        long sum = 0;
        for(int i = 0; i < n; i++) {

            double charge = arr.get(i) - b; //
            sum++;
            if(charge  >0) {

                double double_c = (double)c;
                double d = charge / double_c;
                long share = (long)Math.ceil(d);
                sum += share;
            }

        }
        System.out.println(sum);

    }

}