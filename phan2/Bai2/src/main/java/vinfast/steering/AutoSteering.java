package vinfast.steering;

import org.springframework.stereotype.Component;

@Component("autoSteering")
public class AutoSteering implements Steering {

    @Override
    public void navigate() {
        System.out.println("Auto steering");
    }

}
