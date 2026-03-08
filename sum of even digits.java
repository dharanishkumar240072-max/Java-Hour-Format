import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum;
		while(n>0){
		    int sim = n%10;
		    if(sim%2 == 0){
		        sum = sum+sim;
		    }
		    n = n/10;
		}
		System.out.print(sum);

	}
}
