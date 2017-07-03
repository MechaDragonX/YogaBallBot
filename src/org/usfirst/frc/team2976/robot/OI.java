package org.usfirst.frc.team2976.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2976.robot.commands.ExampleCommand;
import org.usfirst.frc.team2976.robot.commands.MoveArm;
import org.usfirst.frc.team2976.robot.commands.Roll;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick driveStick;
	
	public enum Button {
		RBumper(6), LBumper(5), A(1), B(2), X(3), Y(4), RightJoystickBtn(10), LeftJoystickBtn(9);

		private final int number;

		Button(int number) {
			this.number = number;
		}

		public int getBtnNumber() {
			return number;
		}
	}
	public enum Axis {
		LX(0), LY(1), LTrigger(2), RTrigger(3), RX(4), RY(5);
		private final int number;

		Axis(int number) {
			this.number = number;
		}

		public int getAxisNumber() {
			return number;
		}
	}
	public OI() {
		driveStick = new Joystick(0);
		new JoystickButton(driveStick, Button.A.getBtnNumber()).whenPressed(new MoveArm(0.7,500));
		new JoystickButton(driveStick, Button.B.getBtnNumber()).whenPressed(new MoveArm(-0.3,1000));	                      
		new JoystickButton(driveStick, Button.X.getBtnNumber()).whileHeld(new Roll(0.3));	                      
		new JoystickButton(driveStick, Button.Y.getBtnNumber()).whileHeld(new Roll(-0.3));	                      
		
	}
}
