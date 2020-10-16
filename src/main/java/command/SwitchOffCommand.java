package command;

public class SwitchOffCommand implements Command {

    Cat cat;

    public SwitchOffCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void run() {
        cat.disappear();
    }
}
