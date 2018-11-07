package racing.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RacingInputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputTryNames(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int inputTryNo(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }
}
