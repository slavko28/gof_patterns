package pattern.behavior.state;

public interface PackageState {

    void prev(MyPackage myPackage);

    void next(MyPackage myPackage);

    String getStatus();
}
