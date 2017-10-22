import java.util.*;

public class LCM {
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

  private static long lcm(int a, int b) {
    return (long) a*b / gcd(a,b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
    System.out.println(lcm(a, b));
  }
}
