package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.json.JSONObject;

public class ControllerTank extends Controller implements ControllerIF {
    public ControllerTank(OpMode opMode) {
        super(opMode);
    }

    @Override
    public void configure(JSONObject jsonObject) throws ConfigurationException {
        super.configure(jsonObject);
    }

    @Override
    public void updateMovement() {
    }

    @Override
    public Movement getMovement() {
        throw new UnsupportedOperationException();
    }
}
