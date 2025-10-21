package frc.robot.subsystems;

import org.littletonrobotics.junction.AutoLog;

public interface DriveIO {
    @AutoLog
    public static class DriveIOInputs {
        public double appliedVolts;

        public double positionRad;
        public double velocityRadPerSec;
        public double accelerationRadPerSecSq;
    }

    default void updateInputs(DriveIOInputs inputs) {};

    default void setVoltage(double volts) {};

    default void periodic() {};
}
