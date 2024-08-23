import java.util.*;

public class MaxNumberOfBalloons {
    public static void main(String[] main) {
        String text = "balon";
        System.out.println(maxNumberOfBalloons(text));

    }
    private static int maxNumberOfBalloons(String text) {
        int count = 0 ;
        char[] chars = {'b', 'a', 'l', 'o', 'n'};
        int[] counts = {1, 1, 2, 2, 1};
        Map<Character, Integer> textMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (isRelevant(ch))
            {
                textMap.put(ch, textMap.getOrDefault(ch, 0) + 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (!textMap.containsKey(chars[i])) {
                return count;
            }
        }

        while (true) {
            for (int i = 0; i < chars.length; i++) {
                if ( textMap.get(chars[i]) < counts[i]*(count+1)) {
                    return count;
                }
            }
            count++;
        }

    }

    private static boolean isRelevant(char ch) {
        List<Character> chars = Arrays.asList('b', 'a', 'l', 'o', 'n');
        return chars.contains(ch);
    }
}
