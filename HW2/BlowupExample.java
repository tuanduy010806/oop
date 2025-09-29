import java.util.Scanner;

public class BlowupExample {
    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (Character.isDigit(tmp)) {
                if (i < str.length() - 1) {
                    int xhien = tmp - '0';
                    char nextChar = str.charAt(i + 1);
                    for (int j = 0; j < xhien; j++) {
                        result.append(nextChar);
                    }
                }
            } else {
                result.append(tmp);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(blowup(s));
        scanner.close();
    }
}
