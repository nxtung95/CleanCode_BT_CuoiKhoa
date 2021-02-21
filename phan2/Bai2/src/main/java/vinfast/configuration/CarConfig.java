package vinfast.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vinfast.car.Car;
import vinfast.car.CarFactory;
import vinfast.engine.Engine;
import vinfast.steering.Steering;

@Configuration
public class CarConfig {
	@Autowired
	private CarFactory carFactory;
	
	@Value("${engineType}")
	private String engineType;
	@Value("${modeSteering}")
	private String modeSteering;
	
	@Bean
	public Car initCar() {
		Engine engine = carFactory.createCarEngine(this.engineType);
		Steering steering = carFactory.createCarSteering(this.modeSteering);
		return new Car(engine, steering);
	}
}
