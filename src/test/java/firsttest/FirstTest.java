package firsttest;

import java.util.Scanner;

public class FirstTest {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if(number > 7) {
            System.out.println("Привет");
        }

    }
}
