package bridge;

public abstract class Painter {
    Palette palette;

    public Painter(Palette palette) {
        this.palette = palette;
    }

    public abstract void drawPicture(String color);

}
