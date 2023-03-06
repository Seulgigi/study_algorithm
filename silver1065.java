import java.util.Scanner;

public class silver1065 {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        
        for(int i=1; i<=N; i++) {
            if(i<100) {
                sum++;
            } else if(((i/100)%10-(i/10)%10)==(((i/10)%10)-(i%10))) {
                sum++;
                if(i==1000) sum--;
            } 
        }

        System.out.print(sum);
    }
}