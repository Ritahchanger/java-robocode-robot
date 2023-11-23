package Afnan57248;
import robocode.AdvancedRobot;
public class CircularRobot extends AdvancedRobot {
    @Override
    public void run() {
        while (true) {
            ahead(50);
            turnRight(50); 
        }
    }

  
}

