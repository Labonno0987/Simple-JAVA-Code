public class TextAnalysis {
    public static void main(String[] args) {
        String text = "I am a SQA Engineer".toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : text.replace(" ", "").toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) vowels++;
            else consonants++;
        }
        System.out.println("Words: " + text.split(" ").length);
        System.out.println("Chars: " + text.replace(" ", "").length());
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
