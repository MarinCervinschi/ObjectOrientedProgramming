package functional;

import java.util.Map;

public class PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta) {
        fees.replaceAll((key, value) -> key.substring(0, 3).equals(numberFamily) ? value + costDelta : value);
    }
}
