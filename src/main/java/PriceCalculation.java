import java.util.regex.*;
import java.util.*;

public class PriceCalculation {
    public static void main(String[] args) {
        String input = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }

        numbers.remove(0);

        int laptopPrice = numbers.get(0);
        int mousePrice = numbers.get(1);
        int quantity = numbers.get(2);
        int discountPercentage = numbers.get(3);

        double totalPrice = laptopPrice + (mousePrice * quantity);
        double discountAmount = (totalPrice * discountPercentage) / 100;
        double finalPrice = totalPrice - discountAmount;

        System.out.println("Extracted Numbers (After Fix): " + numbers);
        System.out.println("Total Price Before Discount: " + totalPrice);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Total cost after " + discountPercentage + "% discount: " + finalPrice + " TK");
    }

}






