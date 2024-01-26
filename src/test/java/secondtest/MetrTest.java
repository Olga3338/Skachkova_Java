package secondtest;

import java.util.Scanner;

public class MetrTest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя:");
        String role = scanner.nextLine();
        if(role.equals ("Вячеслав") ) {
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Нет такого имени");

        }

    }
}

