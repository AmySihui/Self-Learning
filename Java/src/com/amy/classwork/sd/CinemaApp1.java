import java.util.Scanner;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class CinemaApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter age: ");
        int age = scanner.nextInt();
        if (age == 100) {
            System.out.println("free!");
        }
    }

}
