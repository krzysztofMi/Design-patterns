package command;

import lombok.Getter;

@Getter
public class Door {

    private boolean isOpen = false;

    public void close(){
        isOpen = false;
    }

    public void open(){
        isOpen = true;
    }
}
