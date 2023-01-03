import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        String[] arr = {"Even", "Odd"};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arr[n%2]);
    }
}
