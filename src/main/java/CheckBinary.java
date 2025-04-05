import java.util.Scanner;

public class CheckBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        System.out.println(binary.matches("[01]+") ? "true" : "false");
    }
}
