package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name = "teleOp", group = "TeleOp")
public class Robot extends LinearOpMode {

    DcMotor L1;
    DcMotor L2;
    DcMotor R1;
    DcMotor R2;

    @Override
    public void runOpMode()
    {
        L1 = hardwareMap.dcMotor.get("L1");
        L2 = hardwareMap.dcMotor.get("L2");
        R1 = hardwareMap.dcMotor.get("R1");
        R2 = hardwareMap.dcMotor.get("R2");
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
            L1.setPower(Range.clip((leftpower), -1, 1));
            L2.setPower(Range.clip((leftpower), -1, 1));
            R1.setPower(Range.clip((leftpower), -1, 1));
            R2.setPower(Range.clip((leftpower), -1, 1));
            idle();

        }
    }
}
