
interface Vehicle {
    void start();
    void stop();
}

interface FourWheeler {
    void accelerate();
    void brake();
}

class Car implements Vehicle, FourWheeler {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerated.");
    }

    @Override
    public void brake() {
        System.out.println("Car applied brakes.");
    }
}

public class Multiple_Inheritance{
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.accelerate();
        car.brake();
        car.stop();
    }
}
