package org.usfirst.frc.team9036.robot.commands;

import org.usfirst.frc.team9036.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DebugCommand extends Command {

    public DebugCommand() {
    	requires(Robot.debugSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
    	for (int i = 1; i <= 15; i++){
    		String s = "mainButton" + i;
    		SmartDashboard.putBoolean(s, Robot.oi.mainJoystick.getRawButton(i));
    	}
    	for (int i = 1;i <= 15; i++){
    		String s = "shootButton" + i;
    		SmartDashboard.putBoolean(s, Robot.oi.shootJoystick.getRawButton(i));
    	}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    	end();
    }
}