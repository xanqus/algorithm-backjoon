import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int rs = 0;

        for(int i = 1; i <= N; i++) {
            if(N == i + sumOfDigits(i)) {
                rs = i;
                break;
            }
        }
        System.out.println(rs);

    }

    public static int sumOfDigits(int N) {
        int sum = 0;
        while(N > 0) {
            sum += N%10;
            N /= 10;
        }
        return sum;
    }
}