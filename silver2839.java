import java.util.Scanner;

public class silver2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = N;

        for(int i=0; i<=N; i++) {
            for(int j=0; j<=N; j++) {
                if((j*3+i*5)==N) {
                    if(max>(i+j)) max = i+j;
                }
            }
        }
        if(max==N) max=-1;

        System.out.print(max);
	}
}
