public class NoteBreakdown {
    public static void main(String[] args) {
        int amount = 546;
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int note : notes)
            if (amount >= note) {
                System.out.println(note + " " + (amount / note));
                amount %= note;
            }
    }
}
