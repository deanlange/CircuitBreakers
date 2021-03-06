package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Navigation_Routines;

/**
 * Created by Drew on 10/2/2017.
 */
@Autonomous (name = "VuforiaNavTest", group = "Tests")
public class VuforiaNavTest extends Navigation_Routines {
    @Override
    public void runOpMode() throws InterruptedException {
            waitForStart();
            vuforia_scan();
        while(opModeIsActive()) {
            telemetry.addLine("Picture Reading Returned");
            telemetry.addData("Picture Reading:", picturereading);
            telemetry.update();
        }
    }
}
