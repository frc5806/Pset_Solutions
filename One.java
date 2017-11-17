import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {
	RobotDrive robot;
	Joystick left, right;

	@Override
	public void robotInit() {
		robot = new RobotDrive(1, 2);
		left = new Joystick(1);
		right = new Joystick(2);
	}

	@Override
	public void teleopPeriodic() {
		robot.tankDrive(left.getRawAxis(1), right.getRawAxis(1));
	}
}
