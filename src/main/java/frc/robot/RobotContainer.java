// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ExampleCommand;

public class RobotContainer {
  private final Joystick m_controller = new Joystick(0);

  public RobotContainer() {
    // Configure the button bindings
    new JoystickButton( m_controller, 8 )
    .whileActiveOnce( new ExampleCommand() );
  }
}

