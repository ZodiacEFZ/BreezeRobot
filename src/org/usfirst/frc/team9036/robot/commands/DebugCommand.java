package org.usfirst.frc.team9036.robot.commands;

import org.usfirst.frc.team9036.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DebugCommand extends Command {

    public DebugCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.debugSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	for (int i=0;i<=15;i++){
    		String s="mainButton"+i;
    		SmartDashboard.putBoolean(s, Robot.oi.mainJoystick.getRawButton(i));
    	}
    	for (int i=0;i<=15;i++){
    		String s="shootButton"+i;
    		SmartDashboard.putBoolean(s, Robot.oi.shootJoystick.getRawButton(i));
    	}
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
    	end();
    }
}
