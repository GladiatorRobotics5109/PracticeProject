// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  /** An example command */
  public static Command exampleCommand() {
    return Commands.sequence( // 'Commands.sequence()' runs the following commands in the order that they are provided
      Commands.print("This is an example command!"), // 'Commands.print()' returns a command that prints a message to the console
      Commands.waitSeconds(1), // 'Commands.waitSeconds()' returns a command that pauses for the provided number of seconds
      Commands.print("Hello after 1 second!")
    );
  }

  /**
   * Sets the desired voltage of the DriveSubsystem
   * @param s The DriveSubsystem to set the voltage of
   * @param volts the voltage to set
   * @return a command that sets the desired drive voltage
   */
  public static Command setDriveVoltage(DriveSubsystem s, DoubleSupplier volts) {
    return Commands.runOnce(() -> s.setVoltage(volts.getAsDouble()), s);
  }

  /**
   * Makes the robot drive forward indefinitely
   * @param s the DriveSubsystem to move forward
   * @return a command that drives forward indefinitely
   */
  public static Command driveForward(DriveSubsystem s) {
    // -- IMPLEMENT THIS --

    // Replace Commands.none() with the correct line
    return Commands.none();
  }
}
