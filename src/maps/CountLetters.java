package maps;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {

    }

    public static Map<Character, Integer> countLetters(String word) {
        Map<Character, Integer> charactersMap = new HashMap<>();

        char[] characters = word.toCharArray();
        for (char letter : characters) {
            if (!charactersMap.containsKey(letter)) {
                charactersMap.put(letter, 1);
            } else {
                int value = charactersMap.get((letter) + 1);
                charactersMap.put(letter, value);
            }
        }
        return charactersMap;

    }
}
