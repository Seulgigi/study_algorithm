import java.util.Scanner;

public class silver11659 {

    // 단순 합계로 구현 시 시간초과
    public static void add(int start, int end, int[] arr) {
        
        int result = 0;
        for(int i = start - 1; i < end; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for(int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }

        for(int k = 0; k < M; k ++) {
            int i = sc.nextInt(), j = sc.nextInt();
            add(i, j, arr);
        }
    }
}
