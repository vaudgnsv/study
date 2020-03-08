import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;
        for(int i = 0; i < 26; i++) {
            System.out.print(str.indexOf(97 + i) + " ");
        }
        String result = "";
        String[] arr = "12.56".split(".");
        if(arr[0].equals("0")) {

        }
        else if(arr[0].length() == 1) {
            result += "00" + arr[0];
        } else if(arr[0].length() == 2) {
            result += "0" + arr[0];
        }

        if(arr[1].length() == 1) {
            result = result + arr[1] + "0000";
        }
        else if(arr[1].length() == 2) {
            result = result + arr[1] + "000";
        }

    }
}

