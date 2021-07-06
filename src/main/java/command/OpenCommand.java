package command;

public class OpenCommand implements Command {

    private final Door door;

    public OpenCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
