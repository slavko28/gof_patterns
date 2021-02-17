package pattern.strutural.adapter;

public class MovableAdapterImpl implements MovableAdapter {

    Movable car;

    public MovableAdapterImpl(Movable car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(car.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.609344;
    }
}
