import java.util.*;

public class GCD {
  private static int gcd(int a, int b) {
    int gcd = 1;
    int temp = 0;
    while(b!=0) {
      temp = a;
      a = b;
      b = temp%b;
    }
    gcd = a;
    return gcd;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(gcd(a, b));
  }
}
