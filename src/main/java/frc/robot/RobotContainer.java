// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ExampleCommand;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Joystick m_controller = new Joystick(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    new JoystickButton( m_controller, 8 )
    .whileActiveOnce( new ExampleCommand() );

    // Holding the button down for more than one second results in this error:
    // Warning at edu.wpi.first.wpilibj.RobotBase.runRobot(RobotBase.java:388): 
    // The robot program quit unexpectedly. 
    // This is usually due to a code error.
    //     	at frc.robot.Main.main(Main.java:23)
    //    	at edu.wpi.first.wpilibj.RobotBase.startRobot(RobotBase.java:463)
    //    	at edu.wpi.first.wpilibj.RobotBase.runRobot(RobotBase.java:373)
    //    	at edu.wpi.first.wpilibj.TimedRobot.startCompetition(TimedRobot.java:131)
    //    	at edu.wpi.first.wpilibj.IterativeRobotBase.loopFunc(IterativeRobotBase.java:328)
    //    	at frc.robot.Robot.robotPeriodic(Robot.java:44)
    //    	at edu.wpi.first.wpilibj2.command.CommandScheduler.run(CommandScheduler.java:280)
    //    	at edu.wpi.first.wpilibj2.command.SequentialCommandGroup.execute(SequentialCommandGroup.java:65)
    //    	at java.base/java.util.ArrayList.get(Unknown Source)
    //    	at java.base/java.util.Objects.checkIndex(Unknown Source)
  }
}

