import java.util.Scanner;
import java.math.BigInteger;

public class Julka {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        int tests = 10;
        while (tests-- > 0) {
            BigInteger[] constraints = readConstraints();
            BigInteger[] result = formula(constraints[0], constraints[1]);
            System.out.println(result[1]);
            System.out.println(result[0]);
        }
    }

    private static BigInteger[] formula(BigInteger sum, BigInteger diff) {
        BigInteger a = sum.add(diff.negate()).divide(new BigInteger("2"));
        BigInteger b = a.add(diff);

        return new BigInteger[] { a, b };
    }

    private static BigInteger[] readConstraints() {
        BigInteger sum = scanner.nextBigInteger();
        BigInteger diff = scanner.nextBigInteger();

        return new BigInteger[] { sum, diff };
    }
}
