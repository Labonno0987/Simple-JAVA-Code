import java.util.Scanner;

public class FindCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.86, 3.75, 3.63, 3.60, 3.52, 3.50, 3.48, 3.43, 3.32, 3.30};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a CGPA to search: ");
        double key = sc.nextDouble();
        boolean found = false;
        int left = 0, right = cgpa.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cgpa[mid] == key) {
                found = true;
                break;
            } else if (cgpa[mid] < key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("CGPA found: " + found);
    }
}
