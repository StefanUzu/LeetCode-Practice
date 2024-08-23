import java.util.Arrays;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrtd";
        System.out.println(numJewelsInStones("aA" , "AaassSsss"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        String[] js = jewels.split("");
        StringBuilder sb = new StringBuilder(stones);
        int solution = 0;
        for (String s : js) {
            for (int j = 0; j < sb.length(); j++) {
                if (s.equals(sb.substring(j, j + 1))) {
                    solution++;
                }
            }
        }
        return solution;
    }
}
