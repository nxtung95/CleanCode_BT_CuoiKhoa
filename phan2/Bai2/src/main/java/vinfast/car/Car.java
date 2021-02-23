package vinfast.car;

import org.springframework.beans.factory.annotation.Autowired;

import vinfast.chassis.Chassis;
import vinfast.engine.Engine;
import vinfast.steering.Steering;

public class Car {
    private Engine engine;
    private Steering steering;
    @Autowired
    private Chassis chassis;

    public Car(Engine engine, Steering steering) {
        this.engine = engine;
        this.steering = steering;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", steering=" + steering + ", chassis=" + chassis + "]";
    }
}
