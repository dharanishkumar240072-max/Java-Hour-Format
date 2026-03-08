import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(s1.length() > s2.length()){
		    System.out.print(s1);
		}
		else if(s1.length() == s2.length()){
		    System.out.println(s1);
		    System.out.print(s2);
		}
		else{
		    System.out.print(s2);
		}

	}
}
