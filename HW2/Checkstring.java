import java.util.Scanner;

public class Checkstring {
    public static boolean stringIntersect(String a, String b, int len) {
        if (len <= 0 || a.length() < len || b.length() < len) {
            return false;
        }
        for (int i = 0; i <= a.length() - len; i++) {
            String xconA = a.substring(i, i + len);
            for (int j = 0; j <= b.length() - len; j++) {
                String xconB = b.substring(j, j + len);
                if (xconA.equals(xconB)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int len = scanner.nextInt();
        boolean res = stringIntersect(a, b, len);
        System.out.println( res);
        scanner.close();
    }
}
