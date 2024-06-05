import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertToRomanNumber {
    Map<Integer, String> map = Map.of(1,"I", 5,"V", 10, "X", 50, "L", 100, "C", 500, "D", 1000, "M");

    public String convert(Integer number) {
        if(map.get(number) != null) return map.get(number);
        String result = "";
        Set<Integer> mapKeys = map.keySet();

        int amountOfDigit = number.toString().length();
        switch (amountOfDigit){
            case 1:
                result = getUnits(number);
                break;
            case 2:
                result = getTens(number);
                int unit = Integer.parseInt(number.toString().substring(1));
                result += getUnits(unit);
                break;
        }


        return result;

    }
    private String getTens(Integer number) {
        StringBuilder result = new StringBuilder();
        if(number == 40) return "XL";
        if(number == 90) return "XC";

        String firstNumber = number.toString().substring(0, 1);
        number = Integer.parseInt(firstNumber+"0");
        if(number > 50){
            result.append("L");
            number -= 50;
        }
        if(number < 40){
            firstNumber = number.toString().substring(0, 1);
            result.append("X".repeat(Math.max(0, Integer.parseInt(firstNumber))));
        }
        return result.toString();
    }

    private static String getUnits(Integer number) {
        StringBuilder result = new StringBuilder();
        if(number == 4) return "IV";
        if(number == 9) return "IX";

        if(number > 5){
            result.append("V");
            number -= 5;
        }
        if(number < 4) {
            result.append("I".repeat(Math.max(0, number)));
        }

        return result.toString();
    }

}
