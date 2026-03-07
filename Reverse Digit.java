import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean foun = false;
		while(N>0){
		    int dig = N%10;
		    if(dig%2 != 0){
		        System.out.print(dig);
		        foun = true;
		    }
		    N = N/10;
		}
		if(!foun){
		    System.out.print(-1);
		}

	}
}
