import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a Positive number");
            n = sc.nextInt();
        }
        if (n == 1) System.out.println("1 is a special number");
        int count = 2;
        for (int i=2; i< (int) n/2; i++) {
            if (n%2 == 0) count++;
        }

        if(count==2) System.out.println(n + " is a prime number");
        else System.out.println(n + " is NOT a prime number");
    }
}
