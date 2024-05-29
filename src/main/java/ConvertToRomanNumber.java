import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertToRomanNumber {
    Map<Integer, String> map = Map.of(1,"I", 5,"V", 10, "X", 50, "L", 100, "C", 500, "D", 1000, "M");

    public String convert(Integer number) {
        if(map.get(number) != null) return map.get(number);
        String result = "";
        Set<Integer> mapKeys = map.keySet();

        if(number < 4) {
            for (int i = 0; i < number; i++) {
                result += "I";
            }
        } else {
            result = "IV";
        }

       // int length = String.valueOf(number).length();
        return result;

    }

}
