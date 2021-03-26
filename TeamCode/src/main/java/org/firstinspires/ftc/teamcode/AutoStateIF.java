package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.json.JSONObject;

import java.util.Map;

public interface AutoStateIF {
    void configure(JSONObject jsonObject,
                          DriveTrainIF driveTrain,
                          Map<String, DeviceIF> devices,
                          Map<String, SensorIF> sensors)
            throws ConfigurationException;

    String doState(RobotBase robotBase, Map<String, Object> propertyValues);
}
