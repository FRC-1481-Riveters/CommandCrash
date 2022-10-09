// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

/** An example command that uses an example subsystem. */
public class ExampleCommand extends SequentialCommandGroup {
  public ExampleCommand() {
    addCommands( 
      new WaitCommand( 0 ),
      new WaitCommand( 0 ),
      new WaitCommand( 1.0 )
    );
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
