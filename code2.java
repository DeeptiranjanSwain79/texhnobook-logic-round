import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        char[] ch = s.toCharArray();
        int n = ch.length;
        char[] ch1 = new char[n];
        for (int i=n-1; i>=0; i--) {
            ch1[n-1-i] = ch[i];
        }

        for (int i=0; i<n; i++) System.out.print(ch1[i]);
    }
}
