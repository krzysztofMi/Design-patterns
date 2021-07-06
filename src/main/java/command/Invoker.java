package command;

import java.util.HashMap;

public class Invoker {
    private final HashMap<String, Command> commands;

    public Invoker(){
        commands = new HashMap<>();
    }

    public void register(String name, Command command){
        commands.put(name, command);
    }

    public void execute(String commandName){
        Command command = commands.get(commandName);
        if (command == null) {
            throw new IllegalStateException("No command registered for " + commandName);
        }
        command.execute();
    }
}
