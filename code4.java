import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println(s);
        int alphabet = 0, numbers = 0, specials = 0, spaces = 0;

        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) numbers++;
            else if (Character.isLetter(s.charAt(i))) alphabet++;
            else if (Character.isWhitespace(s.charAt(i))) spaces++;
            else if (!Character.isDigit(s.charAt(i))
                    && !Character.isLetter(s.charAt(i))
                    && !Character.isWhitespace(s.charAt(i))) specials++;
        }

        System.out.println(alphabet + " no of alphabets");
        System.out.println(numbers + " no of numbers");
        System.out.println(specials + " no of special characters");
        System.out.println(spaces + " no of spaces");
    }
}
