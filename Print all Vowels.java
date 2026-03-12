import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		String vow = "aeiouAEIOU";
		boolean p = false;
		for(char ch: arr){
		    if(vow.indexOf(ch) != -1){
		        System.out.print(ch);
		        p = true;
		    }
		}
		if(!p){
		    System.out.println("-1");
		}
	}
}
