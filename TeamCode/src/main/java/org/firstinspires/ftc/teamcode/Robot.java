package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name = "teleOp", group = "TeleOp")
public class Robot extends LinearOpMode {

    DcMotor left;
    DcMotor right;

    @Override
    public void runOpMode()
    {
        left = hardwareMap.dcMotor.get("left motor");
        right = hardwareMap.dcMotor.get("right motor");
        waitForStart();

        while (opModeIsActive())
        {
            //Arcade Drive
            /*double speed = -gamepad1.left_stick_y;
            double direction = gamepad1.right_stick_x;
            left.setPower(Range.clip((speed + direction), -1, 1));
            right.setPower(Range.clip((speed - direction), 1, 1));*/

            //Tank Drive
            double leftpower = -gamepad1.left_stick_y;
            double rightpower = -gamepad1.right_stick_y;
            left.setPower(Range.clip((leftpower), -1, 1));
            right.setPower(Range.clip((rightpower), -1, 1));
            idle();

        }
    }
}
