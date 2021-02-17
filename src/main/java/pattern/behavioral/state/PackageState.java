package pattern.behavioral.state;

public interface PackageState {

    void prev(MyPackage myPackage);

    void next(MyPackage myPackage);

    String getStatus();
}
