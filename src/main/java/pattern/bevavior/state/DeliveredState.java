package pattern.bevavior.state;

public class DeliveredState implements PackageState {

    public void prev(MyPackage myPackage) {
        myPackage.setState(new OrderedState());
    }

    public void next(MyPackage myPackage) {
        myPackage.setState(new ReceivedState());
    }

    public String getStatus() {
        return "Package delivered.";
    }
}
