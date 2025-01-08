import java.util.HashMap;
import java.util.Map;

public class romantoint {
    public static void main(String[] args) {
        // Example usage: Convert "XIV" to an integer
        String romanNumeral = "XIV";
        int result = romanToInt(romanNumeral);
        System.out.println("run");
        System.out.println("Converted value: " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                num -= map.get(s.charAt(i));
            } else {
                num += map.get(s.charAt(i));
            }
        }

        return num;
    }
}
