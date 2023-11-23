package Afnan57248;
import robocode.ScannedRobotEvent;
import java.util.ArrayList;

public class TrackRobot {
    private double bearing;
    private double distance;
    private double energy;
    private double heading;
    private String name;
    private double velocity;
    ArrayList<ScannedRobotEvent> movementHistory;

    public TrackRobot() {
        movementHistory = new ArrayList<>();
        reset();
    }
    public void reset() {
        bearing = 0.0;
        distance = 0.0;
        energy = 0.0;
        heading = 0.0;
        name = "";
        velocity = 0.0;
        movementHistory.clear();
    }
    public void onScannedRobot(ScannedRobotEvent event) {
        trackBot(event);
    }

    private void trackBot(ScannedRobotEvent event) {
        bearing = event.getBearing();
        distance = event.getDistance();
        energy = event.getEnergy();
        heading = event.getHeading();
        name = event.getName();
        velocity = event.getVelocity();
        movementHistory.add(event);
    }
}
