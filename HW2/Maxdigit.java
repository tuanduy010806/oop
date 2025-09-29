import java.util.Scanner;
public class Maxdigit {
    public static int maxRun(String str) {
        if (str.length() == 0) return 0;
        int Max = 1;
        int currentRun = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentRun++;
                if (currentRun > Max) {
                    Max = currentRun;
                }
            } else {
                currentRun = 1;
            }
        }

        return Max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int res = maxRun(s);
        System.out.println(res);
        scanner.close();
    }
}
