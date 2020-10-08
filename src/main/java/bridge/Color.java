package bridge;

public class Color implements Palette {

    public String setColor(String color) {
        System.out.println(color);
        return color;
    }
}
