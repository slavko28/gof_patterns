package pattern.behavior.state;

public class MyPackage {

    private PackageState state = new OrderedState();

    public void setState(PackageState state) {
        this.state = state;
    }

    public PackageState getState() {
        return state;
    }

    public void prevState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}
