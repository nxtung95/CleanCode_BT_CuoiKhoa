package vinfast.steering;

import org.springframework.stereotype.Component;

@Component("manualSteering")
public class ManualSteering implements Steering {

    @Override
    public void navigate() {
        System.out.println("Manual steering");
    }

}
