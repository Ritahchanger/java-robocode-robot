package Afnan57248; 


import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

public class Afnan57248 extends AdvancedRobot {
    private TrackRobot trackBot;
    @Override
    public void run() {
        trackBot = new TrackRobot();
        for (int i = 0; i < 4; i++) {
            ahead(100);
            turnRight(90);
        }
    }
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        trackBot.onScannedRobot(event);
    }
}

