package command;

public class Box {
    Command up, down;

    public Box(Command up, Command down) {
        this.up = up;
        this.down = down;
    }

    public void switchOn () {
        up.run();
    }

    public void switchOff() {
        down.run();
    }
}
