import java.util.Scanner;

public class silver11659 {

    // 단순 합계로 구현 시 시간초과
    // 누적 합 값을 배열에 넣기

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int add = 0;

        int[] arr = new int[N+1];
        arr[0] = 0;
        for(int k = 1; k < arr.length; k++) {
            add += sc.nextInt();
            arr[k] = add;
        }

        for(int k = 0; k < M; k ++) {
            int i = sc.nextInt(), j = sc.nextInt();
            System.out.println(arr[j]-arr[i-1]);
        }
    }
}
