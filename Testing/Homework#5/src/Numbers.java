import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int x;
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Парне");
        } else {
            System.out.println("Непарне");
        }
    }
}

