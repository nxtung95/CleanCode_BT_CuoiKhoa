package vinfast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import vinfast.car.Car;

@SpringBootApplication
public class Bai2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bai2Application.class, args);
		Car car = context.getBean(Car.class);
		System.out.println(car);
	}

}
