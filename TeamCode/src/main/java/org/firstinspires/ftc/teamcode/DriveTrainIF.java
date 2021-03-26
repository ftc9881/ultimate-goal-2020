package org.firstinspires.ftc.teamcode;

public interface DriveTrainIF extends ComponentIF {
    void updateMovement(Movement movementBoth);

    double getDistance(boolean abs);

    int getPosition(boolean abs);

    void resetPositions();

    void stop();
}
