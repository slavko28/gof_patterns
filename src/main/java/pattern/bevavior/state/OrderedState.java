package pattern.bevavior.state;

public class OrderedState implements PackageState {

    public void prev(MyPackage myPackage) {
        System.out.println("The package is in its root state.");
    }

    public void next(MyPackage myPackage) {
        myPackage.setState(new DeliveredState());
    }

    public String getStatus() {
        return "Package ordered.";
    }
}
