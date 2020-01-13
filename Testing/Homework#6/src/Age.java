import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Don't smoke, don't drink");
        }
        if (age >= 18 || age <= 20) {
            System.out.println("You can smoke, and drink beer");
        }
        if (age > 20 || age <= 60) {
            System.out.println("You smoke, and drink");
        }
        if (age > 60) {
            System.out.println("NO smoke, and drink");
        }
    }
}
