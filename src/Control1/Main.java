package Control1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение: ");
        String msg = scanner.nextLine();

        System.out.println("Введите число повторений: ");
        int repeats = scanner.nextInt();

        Thread webSite = new MessageNotifier(msg,repeats);
        webSite.start();

    }
}
