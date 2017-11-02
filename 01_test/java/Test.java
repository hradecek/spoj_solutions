import java.util.Scanner;

public class Test {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String... args) {
        int number = sc.nextInt();
        if (42 == number) return;
        System.out.println(number);
        main(args);
    }
}
