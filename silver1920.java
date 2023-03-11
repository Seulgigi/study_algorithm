import java.util.Arrays;
import java.util.Scanner;

public class silver1920 {

    // 순차탐색 -> 시간초과
    // 이분탐색으로 search 구현
    public static int search(int[] A, int target) {
        int start = 0, end = A.length - 1;

        while(start<=end) {
            int mid = ( start + end ) / 2;
            if(A[mid]==target){
                return 1;
            } else if(A[mid]>target){ end = mid - 1;
            } else { start = mid + 1; }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        int[] A = new int[M];

        for(int i=0; i<M; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            int target = sc.nextInt();
            System.out.println(search(A, target));
        }
    }
}