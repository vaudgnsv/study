
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<object> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long start = sc.nextLong();
            long end = sc.nextLong();
            list.add(new object(start, end));
        }

        list.sort((o1, o2) -> {
            if (o1.getEnd() < o2.getEnd()) { // 끝나는 시간 순으로 정렬
                return -1;
            } else if (o1.getEnd() == o2.getEnd()) { // 끝나는 시간이 같으면
                if (o1.getStart() < o2.getStart()) { // 시작하는 시간 순으로 정렬
                    return -1;
                } else if (o1.getStart() == o2.getStart()) { //  시작하는 시간이 같으면
                    if (o1.getPeriod() < o2.getPeriod()) { // 구간 순으로 정렬
                        return -1;
                    } else if (o1.getPeriod() < o2.getPeriod()) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        });

        for (object o : list) {
            System.out.println(o.print());
        }
        int count = 1;
        object o = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (o.getEnd() <= list.get(i).getStart()) {
                System.out.println("before:" + o.print());
                o = list.get(i);
                count++;
                System.out.println("after:" + o.print());
            }
        }

        System.out.println("count:" + count);
    }

}




