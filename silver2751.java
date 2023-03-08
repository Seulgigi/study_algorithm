import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class silver2751 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<N; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        for(Integer v : arr) {
            sb.append(v).append('\n');
        }

        System.out.print(sb);
	}
}