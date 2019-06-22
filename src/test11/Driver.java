package test11;

public class Driver implements Idriver{
    @Override
    public void drive(Icar car) {
        car.run();
    }
}
