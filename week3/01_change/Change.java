import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
        // 10, 5, 1
        int result = 0;
        int m_ten = m/10;
        int m_five = (m-(m_ten*10))/5;
        int m_one = m-(m_ten*10)-(m_five*5);
        result = m_ten + m_five + m_one;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}

