package test;

import command.Command;
import command.Door;
import command.Invoker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {

    @Test
    public void doorCommandTest(){
        Door door = new Door();

        Command openDoor = door::open;
        Command closeDoor = door::close;

        Invoker invoker = new Invoker();
        invoker.register("openDoor", openDoor);
        invoker.register("closeDoor", closeDoor);

        assertFalse(door.isOpen(), "Door should be close on creation.");
        invoker.execute("openDoor");
        assertTrue(door.isOpen(), "Door should be open at this moment.");
        invoker.execute("closeDoor");
        assertFalse(door.isOpen(), "Door should be close now.");

        assertThrows(IllegalStateException.class,
                () -> invoker.execute("destroyDoors"),
                "Exception should be thrown. There is no command of name 'destroyDoors'");
    }
}
