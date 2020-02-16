import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        String [] arr = new String[n];
        node[][] arr2 = new node[n][n];
        node[][] arr3 = new node[n][n];
        sc = new Scanner(System.in);
        for( int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length(); j++) {
                String str = arr[i].substring(j, j + 1);
                arr2[i][j] = new node(str, i, j);
                if(str.equals("R") || str.equals("G")) {
                    arr3[i][j] = new node("GR", i, j);
                }
                else {
                    arr3[i][j] = new node(str, i, j);
                }
            }
        }


        System.out.println(getcount(arr2, n) + " " + getcount(arr3, n));
          //  }
    }

        private static int getcount(node[][] arr2, int n) {

            int count = 0;
            queue queue = new queue();
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    if (!arr2[i][j].isMeet()) {
                        count++;

                        queue.enqueue(arr2[i][j]);
                        while (!queue.isEmpty()) {
                            node a = queue.dequeue();
                            int x = a.getX();
                            int y = a.getY();
                            System.out.println("x:" + x + ",y:" + y);
                            if (x == 0 && y == 0) { // 왼쪽 위 구석
                                if (!arr2[x + 1][y].isMeet() && arr2[x + 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x + 1][y]);
                                    arr2[x + 1][y].setMeet(true);
                                }
                                if (!arr2[x][y + 1].isMeet() && arr2[x][y + 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y + 1]);
                                    arr2[x][y + 1].setMeet(true);
                                }
                                continue;
                            } else if (x == 0 && ((y > 0) && y < (n - 1))) { // 위쪽 벽
                                if (!arr2[x + 1][y].isMeet() && arr2[x + 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x + 1][y]);
                                    arr2[x + 1][y].setMeet(true);
                                }
                                if (!arr2[x][y + 1].isMeet() && arr2[x][y + 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y + 1]);
                                    arr2[x][y + 1].setMeet(true);
                                }
                                if (!arr2[x][y - 1].isMeet() && arr2[x][y - 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y - 1]);
                                    arr2[x][y - 1].setMeet(true);
                                }
                                continue;
                            } else if (x == 0 && y == (n - 1)) { // 오른쪽 위 구석
                                if (!arr2[x + 1][y].isMeet() && arr2[x + 1][y].getColor().equals(arr2[x][y])) {
                                    queue.enqueue(arr2[x + 1][y]);
                                    arr2[x + 1][y].setMeet(true);
                                }
                                if (!arr2[x][y - 1].isMeet() && arr2[x][y - 1].getColor().equals(arr2[x][y])) {
                                    queue.enqueue(arr2[x][y - 1]);
                                    arr2[x][y - 1].setMeet(true);
                                }
                                continue;
                            } else if ((x > 0 && (x < n - 1)) && y == 0) { // 왼쪽 벽
                                if (!arr2[x][y + 1].isMeet() && arr2[x][y + 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y + 1]);
                                    arr2[x][y + 1].setMeet(true);
                                }
                                if (!arr2[x + 1][y].isMeet() && arr2[x + 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x + 1][y]);
                                    arr2[x + 1][y].setMeet(true);
                                }
                                if (!arr2[x - 1][y].isMeet() && arr2[x - 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x - 1][y]);
                                    arr2[x - 1][y].setMeet(true);
                                }
                                continue;
                            } else if (x == (n - 1) && y == 0) { // 왼쪽 아래 구석
                                if (!arr2[x - 1][y].isMeet() && arr2[x - 1][y].getColor().equals(arr2[x][y])) {
                                    queue.enqueue(arr2[x - 1][y]);
                                    arr2[x - 1][y].setMeet(true);
                                }
                                if (!arr2[x][y + 1].isMeet() && arr2[x][y + 1].getColor().equals(arr2[x][y])) {
                                    queue.enqueue(arr2[x][y + 1]);
                                    arr2[x][y + 1].setMeet(true);
                                }
                                continue;
                            } else if (x == (n - 1) && ((y > 0) && y < (n - 1))) { // 아래쪽 벽
                                if (!arr2[x - 1][y].isMeet() && arr2[x - 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x - 1][y]);
                                    arr2[x - 1][y].setMeet(true);
                                }
                                if (!arr2[x][y + 1].isMeet() && arr2[x][y + 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y + 1]);
                                    arr2[x][y + 1].setMeet(true);
                                }
                                if (!arr2[x][y - 1].isMeet() && arr2[x][y - 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y - 1]);
                                    arr2[x][y - 1].setMeet(true);
                                }
                            } else if (x == (n - 1) && y == (n - 1)) { // 오른쪽 아래 구석
                                if (!arr2[x - 1][y].isMeet() && arr2[x - 1][y].getColor().equals(arr2[x][y])) {
                                    queue.enqueue(arr2[x - 1][y]);
                                    arr2[x - 1][y].setMeet(true);
                                }
                                if (!arr2[x][y - 1].isMeet() && arr2[x][y - 1].getColor().equals(arr2[x][y])) {
                                    queue.enqueue(arr2[x][y - 1]);
                                    arr2[x][y - 1].setMeet(true);
                                }
                                break;
                            } else if ((x > 0 && (x < n - 1)) && y == (n - 1)) { // 오른쪽 벽
                                if (!arr2[x][y - 1].isMeet() && arr2[x][y - 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y - 1]);
                                    arr2[x][y - 1].setMeet(true);
                                }
                                if (!arr2[x + 1][y].isMeet() && arr2[x + 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x + 1][y]);
                                    arr2[x + 1][y].setMeet(true);
                                }
                                if (!arr2[x - 1][y].isMeet() && arr2[x - 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x - 1][y]);
                                    arr2[x - 1][y].setMeet(true);
                                }
                                continue;
                            } else {
                                if (!arr2[x - 1][y].isMeet() && arr2[x - 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x - 1][y]);
                                    arr2[x - 1][y].setMeet(true);
                                }
                                if (!arr2[x][y + 1].isMeet() && arr2[x][y + 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y + 1]);
                                    arr2[x][y + 1].setMeet(true);
                                }
                                if (!arr2[x + 1][y].isMeet() && arr2[x + 1][y].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x + 1][y]);
                                    arr2[x + 1][y].setMeet(true);
                                }
                                if (!arr2[x][y - 1].isMeet() && arr2[x][y - 1].getColor().equals(arr2[x][y].getColor())) {
                                    queue.enqueue(arr2[x][y - 1]);
                                    arr2[x][y - 1].setMeet(true);
                                }
                                continue;
                            }
                        }
                    }
                }

            }
            return count;
        }
}
