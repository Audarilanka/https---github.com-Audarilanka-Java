import java.util.*;
import java.math.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        // BigInteger x=a+b;
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
