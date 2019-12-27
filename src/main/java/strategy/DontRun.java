package strategy;

public class DontRun implements Run{

    @Override
    public String run() {
        return "You are not allowed to run.";
    }
}
