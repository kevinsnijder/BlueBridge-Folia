package de.mark225.bluebridge.core.util;

import de.bluecolored.bluemap.api.math.Color;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.text.StringSubstitutor;

public class BlueBridgeUtils {

    public static String escapeHtml(String in) {
        return StringEscapeUtils.escapeHtml4(in);
    }

    public static String replace(StringLookupWrapper stringLookup, String input) {
        return new StringSubstitutor(stringLookup.lookup).replace(input);
    }

    public static int colorToInt(Color color) {
        int a = (int) (color.getAlpha() * 255) & 0xFF;
        int r = (int) (color.getRed() * 255) & 0xFF;
        int g = (int) (color.getGreen() * 255) & 0xFF;
        int b = (int) (color.getBlue() * 255) & 0xFF;
        return (a << 24) | (r << 16) | (g << 8) | b;
    }
}
