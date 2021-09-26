package impl;

import java.util.Scanner;

public class Input {
    public static String[] input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split(" ");
    }
}

