package bridge;

public class Picture extends Painter {

    public Picture(Palette palette) {
        super(palette);
    }

    public void drawPicture(String color) {
        switch (color.toUpperCase()) {
            case "#FF0000":
                palette.setColor("RED");
                break;
            case "#00FF00":
                palette.setColor("Green");
                break;
            case "#0000FF":
                palette.setColor("BLUE");
                break;
            default:
                System.out.println("Picture without color");
        }
    }

    /* Picture picture = new Picture(new Color());
    String hex = Integer.toHexString(java.awt.Color.BLUE.getRGB());
        picture.drawPicture("#" + Integer.toHexString(java.awt.Color.BLUE.getRGB()).substring(2, 8));
        picture.drawPicture("#" + Integer.toHexString(java.awt.Color.RED.getRGB()).substring(2, 8));
        picture.drawPicture("#" + Integer.toHexString(java.awt.Color.YELLOW.getRGB()).substring(2, 8));
        picture.drawPicture("#" + Integer.toHexString(java.awt.Color.DARK_GRAY.getRGB()).substring(2, 8));
        */
}
