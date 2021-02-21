package vinfast.engine;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Electric engine start");
	}

	@Override
	public void move() {
		System.out.println("Electric engine move");
	}

	@Override
	public void brake() {
		System.out.println("Electric engine brake");
	}

}
