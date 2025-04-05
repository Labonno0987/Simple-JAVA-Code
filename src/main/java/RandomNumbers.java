import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Max: " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("Min: " + Arrays.stream(numbers).min().getAsInt());
    }
}
