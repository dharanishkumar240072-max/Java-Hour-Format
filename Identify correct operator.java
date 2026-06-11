import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split("[+\\-*/=]");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        if (a + b == c)
            System.out.print("+");
        else if (a - b == c)
            System.out.print("-");
        else if (a * b == c)
            System.out.print("*");
        else if (b != 0 && a / b == c)
            System.out.print("/");
    }
}
