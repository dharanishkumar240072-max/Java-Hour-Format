import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char c = sc.next().charAt(0);
		
		for(int i=1; i<=N; i++){
		    for(int j=1; j<=N; j++){
		        if(i==j || j==1 || j==N){
		            System.out.print(c);
		        }
		        else{
		            System.out.print("-");
		        }
		    }  
		    System.out.println();
		    
		}

	}
}
