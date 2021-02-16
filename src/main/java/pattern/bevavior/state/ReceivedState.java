package pattern.bevavior.state;

public class ReceivedState implements PackageState {

    public void prev(MyPackage myPackage) {
        myPackage.setState(new DeliveredState());
    }

    public void next(MyPackage myPackage) {
        System.out.println("This package is already received by a client.");
    }

    public String getStatus() {
        return "Package received.";
    }
}
