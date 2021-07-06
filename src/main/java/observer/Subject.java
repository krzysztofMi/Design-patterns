package observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
