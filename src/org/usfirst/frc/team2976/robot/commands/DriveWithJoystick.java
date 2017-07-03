package org.usfirst.frc.team2976.robot.commands;

import org.usfirst.frc.team2976.robot.OI;
import org.usfirst.frc.team2976.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoystick extends Command {

    public DriveWithJoystick() {
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.drive(0, 0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double r = Robot.oi.driveStick.getRawAxis(OI.Axis.RY.getAxisNumber());
    	double l = Robot.oi.driveStick.getRawAxis(OI.Axis.LY.getAxisNumber());
    	Robot.driveTrain.drive(r, l);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
