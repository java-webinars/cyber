package edu.cyber.color;

import java.util.Arrays;

public class Color
{
    private int[] rgb = new int[3];

    public final static int[] WHITE = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY = new int[]{64, 64, 64};
    public final static int[] BLACK = new int[]{0, 0, 0};
    public final static int[] RED = new int[]{255, 0, 0};
    public final static int[] PINK = new int[]{255, 175, 175};
    public final static int[] ORANGE = new int[]{255, 200, 0};
    public final static int[] YELLOW = new int[]{255, 255, 0};
    public final static int[] GREEN = new int[]{0, 255, 0};
    public final static int[] MAGENTA = new int[]{255, 0, 255};
    public final static int[] CYAN = new int[]{0, 255, 255};
    public final static int[] BLUE = new int[]{0, 0, 255};

    public Color() {
        rgb = WHITE;
    }

    public Color(int red, int green, int blue) {
        this.rgb[0] = red;
        this.rgb[1] = green;
        this.rgb[2] = blue;
    }

    public String toString() {
        if (Arrays.compare(rgb, WHITE) == 0) return "white";
        if (Arrays.compare(rgb, LIGHT_GRAY) == 0) return "light gray";
        if (Arrays.compare(rgb, GRAY) == 0) return "gray";
        if (Arrays.compare(rgb, DARK_GRAY) == 0) return "dark gray";
        if (Arrays.compare(rgb, BLACK) == 0) return "black";
        if (Arrays.compare(rgb, RED) == 0) return "red";
        if (Arrays.compare(rgb, PINK) == 0) return "pink";
        if (Arrays.compare(rgb, ORANGE) == 0) return "orange";
        if (Arrays.compare(rgb, YELLOW) == 0) return "yellow";
        if (Arrays.compare(rgb, GREEN) == 0) return "green";
        if (Arrays.compare(rgb, MAGENTA) == 0) return "magenta";
        if (Arrays.compare(rgb, CYAN) == 0) return "cyan";
        if (Arrays.compare(rgb, BLUE) == 0) return "blue";

        return "n/a";
    }
}
