import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		String[]  num = sc.next().split("/");
		int nume = Integer.parseInt(num[0]);
		int deno = Integer.parseInt(num[1]);
		System.out.printf("%.2f", (deno/(nume*1.0)));

	}
}
