package org.usfirst.frc.team1708.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSystem extends Subsystem {
	
	RobotDrive robotDrive = new RobotDrive(0,1,2,3);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void driveWithJoystick(Joystick joystick) {
		robotDrive.arcadeDrive(joystick);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

