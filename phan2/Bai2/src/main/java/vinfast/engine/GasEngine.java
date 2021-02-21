package vinfast.engine;

import org.springframework.stereotype.Component;

@Component
public class GasEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Gas engine start");
	}

	@Override
	public void move() {
		System.out.println("Gas engine move");
	}

	@Override
	public void brake() {
		System.out.println("Gas engine brake");
	}

}
