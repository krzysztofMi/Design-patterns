package command;

public class CloseCommand implements Command {

    private final Door door;

    CloseCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
