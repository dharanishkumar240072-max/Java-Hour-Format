import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        int count =0;
        for(int i=0; i<a.length -1; i++){
            if(a[i] == b[0] && a[i+1] == b[1]){
                count++;
            }
        } 
        System.out.print(count);

	}
}
