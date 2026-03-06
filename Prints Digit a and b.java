import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a%10;
		int d = b%10;
		if(c<d){
		    for(int i=c; i<=d; i++){
		        System.out.print(i+" ");
		    }
		}
		else{
		    for(int i=c; i>=d; i--){
		        System.out.print(i+" ");
		    }
		}

	}
}
