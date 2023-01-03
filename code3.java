public class code3 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i+=2) {
            if (i==1) System.out.print("  ");
            if (i==3) System.out.print(" ");
            for (int j=1; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i=3; i>0; i-=2) {
            if (i==3) System.out.print(" ");
            if (i==1) System.out.print("  ");
            for (int j=i; j>0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
