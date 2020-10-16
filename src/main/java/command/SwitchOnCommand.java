package command;

public class SwitchOnCommand implements Command {

    Cat cat;

    public SwitchOnCommand(Cat cat) {
        this.cat = cat;
    }
    @Override
    public void run() {
        cat.appear();
    }
}
