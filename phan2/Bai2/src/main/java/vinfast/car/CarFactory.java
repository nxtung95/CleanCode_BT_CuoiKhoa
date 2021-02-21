package vinfast.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import vinfast.engine.ElectricEngine;
import vinfast.engine.Engine;
import vinfast.engine.GasEngine;
import vinfast.steering.AutoSteering;
import vinfast.steering.ManualSteering;
import vinfast.steering.Steering;

@Component
public class CarFactory {
    @Autowired
    private ApplicationContext context;
    
	public Steering createCarSteering(String modeSteering) {
		Steering steering;
		switch(modeSteering) {
			case "manual": 
				steering = (ManualSteering) context.getBean("manualSteering");
				break;
			case "auto":
				steering = (AutoSteering) context.getBean("autoSteering");
				break;
			default:
				steering = (ManualSteering) context.getBean("manualSteering");
		}
		return steering;
	}
	
	public Engine createCarEngine(String engineType) {
		Engine engine;
		switch (engineType) {
			case "gas":
				engine = (GasEngine) context.getBean(GasEngine.class);
				break;
			case "electric":
				engine = (ElectricEngine) context.getBean(ElectricEngine.class);
				break;
			default:
				engine = (GasEngine) context.getBean(GasEngine.class);
		}
		return engine;
	}
}
