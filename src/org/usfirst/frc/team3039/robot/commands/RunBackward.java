package org.usfirst.frc.team3039.robot.commands;

import org.usfirst.frc.team3039.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunBackward extends Command {
    public RunBackward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.DriveBackward();
    	System.out.println("Encoder" + Robot.drivetrain.getRightDistance());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return (targetDistance <= Math.abs(Robot.drivetrain.getRightDistance()));
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stopDriving();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivetrain.stopDriving();
    }
}