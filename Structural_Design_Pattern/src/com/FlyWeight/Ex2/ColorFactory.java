package com.FlyWeight.Ex2;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
	private static final Map<String, Color> colors = new HashMap<>();

    public static Color getColor(String name, String hexCode) {
        if (!colors.containsKey(name)) {
            colors.put(name, new Color(name, hexCode));
        }
        return colors.get(name);
    }
}
