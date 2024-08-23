public class Jewels {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);
    }

    private static int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if (jewel == stones.charAt(j)) {
                    result++;
                }
            }

        }
        return result;
    }
}
