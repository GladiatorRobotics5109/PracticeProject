// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveIO.DriveIOInputs;

public class DriveSubsystem extends SubsystemBase {
  private final DriveIO m_io;
  // private final DriveIOInputsAutoLogged m_inputs;

  /** Creates a new ExampleSubsystem. */
  public DriveSubsystem() {
    switch (Constants.kMode) {
      case REAL:
        m_io = new DriveIO() {};

        break;
      case SIM:
        m_io = new DriveIOSim();

        break;
      default:
        m_io = new DriveIO() {};
    }

    // m_inputs = new DriveIOInputsAutoLogged();
  }

  public void setVoltage(double volts) {
    m_io.setVoltage(volts);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_io.periodic();
    // m_io.updateInputs(m_inputs);
    // Logger.processInputs("ExampleSubsystemInputs", m_inputs);

    // Logger.recordOutput("CurrentPosition", new Pose2d(0.1 * m_inputs.positionRad, 0.0, Rotation2d.kZero));
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
