public class RemoveVowels {
    public static void main(String[] args) {
        String text = "I am a SQA Engineer";
        System.out.println(text.replaceAll("[aeiouAEIOU]", ""));
    }
}
