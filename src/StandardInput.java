import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        // objeto
        String s = scanner.next();

        System.out.println(a);
        System.out.println(s);
    }
}
