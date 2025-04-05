public class FindLowestHeights {
    public static void main(String[] args) {
        int[] heights = {45, 50, 55, 48, 47, 60, 62, 58, 54, 46};
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int h : heights) {
            if (h < min1) {
                min2 = min1;
                min1 = h;
            } else if (h < min2 && h != min1) {
                min2 = h;
            }
        }
        System.out.println("Two lowest heights: " + min1 + ", " + min2);
    }
}
