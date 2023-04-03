import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] intArr = new int[N];

        for (int i = 0; i < N; i++) {
            intArr[i] = in.nextInt();
        }
        int rs = 0;
        for(int i = 0; i < intArr.length - 2; i++) {
            for(int j = i + 1; j < intArr.length - 1; j++) {
                for(int k = j + 1; k < intArr.length; k++) {
                    int tmp = intArr[i] + intArr[j] + intArr[k];

                    if(tmp <= M && rs < tmp) {
                        rs = tmp;
                    }
                }
            }
        }
        System.out.println(rs);

    }
}