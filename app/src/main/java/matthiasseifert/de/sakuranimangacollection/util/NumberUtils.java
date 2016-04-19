package matthiasseifert.de.sakuranimangacollection.util;

public class NumberUtils {
    public static int StringToInt(String value) {
        if (value == null) return 0;

        return Integer.parseInt(value);
    }

    public static Double StringToDouble(String value) {
        if (value == null) return 0.0;

        return Double.parseDouble(value);
    }
}
